package com.hanghae.cinema.config;

import com.hanghae.cinema.jwt.JwtAccessDeniedHandler;
import com.hanghae.cinema.jwt.JwtAuthenticationEntryPoint;
import com.hanghae.cinema.jwt.TokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final TokenProvider tokenProvider;
    private final JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
    private final JwtAccessDeniedHandler jwtAccessDeniedHandler;
    private final CorsConfig corsConfig;
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // h2 database 테스트가 원활하도록 관련 API 들은 전부 무시
    @Override
    public void configure(WebSecurity web) {
        web.ignoring()
            .antMatchers("/h2-console/**", "/favicon.ico");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // CSRF 설정 Disable
        http.csrf().disable()
                // token을 사용하는 방식이기 때문에 csrf를 disable합니다.
            .addFilter(corsConfig.corsFilter())
<<<<<<< HEAD
=======

>>>>>>> 38aef4f1852ada787943928f0f552c9cbd837fe0
            // exception handling 할 때 우리가 만든 클래스를 추가
            .exceptionHandling()
            .authenticationEntryPoint(jwtAuthenticationEntryPoint)
            .accessDeniedHandler(jwtAccessDeniedHandler)
<<<<<<< HEAD
            .and()
=======
            // jwt 인증입니다. 세션 사용하지 않음
            .and()

>>>>>>> 38aef4f1852ada787943928f0f552c9cbd837fe0
            // h2-console 을 위한 설정을 추가
            .headers()
            .frameOptions()
            .sameOrigin()
<<<<<<< HEAD
=======

>>>>>>> 38aef4f1852ada787943928f0f552c9cbd837fe0
            // 시큐리티는 기본적으로 세션을 사용
            // 여기서는 세션을 사용하지 않기 때문에 세션 설정을 Stateless 로 설정
            .and()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
<<<<<<< HEAD
=======

>>>>>>> 38aef4f1852ada787943928f0f552c9cbd837fe0
            // 로그인, 회원가입 API 는 토큰이 없는 상태에서 요청이 들어오기 때문에 permitAll 설정
            .and()
            .authorizeRequests()
            .antMatchers("/member/**").permitAll()
<<<<<<< HEAD
            .antMatchers("api/movie").permitAll()
            .anyRequest().authenticated()   // 나머지 API 는 전부 인증 필요
            // JwtFilter 를 addFilterBefore 로 등록했던 JwtSecurityConfig 클래스를 적용
=======
            .antMatchers("/api/movie").permitAll()
            .anyRequest().authenticated()
//            .antMatchers("/").permitAll()

>>>>>>> 38aef4f1852ada787943928f0f552c9cbd837fe0
            .and()
            .apply(new JwtSecurityConfig(tokenProvider));

    }
}
