package com.hanghae.cinema.controller;

import com.hanghae.cinema.dto.MemberRequestDto;
import com.hanghae.cinema.dto.MemberResponseDto;
import com.hanghae.cinema.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Source;
import java.net.URI;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/member")
@RestController
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/me")
    public ResponseEntity<MemberResponseDto> getMyMemberInfo() {

        return ResponseEntity.ok(memberService.getMyInfo());
    }

    @GetMapping("/{email}")
    public ResponseEntity<MemberResponseDto> getMemberInfo(@PathVariable String email) {
        return ResponseEntity.ok(memberService.getMemberInfo(email));
    }

}
