package com.hanghae.cinema.dto;

import com.hanghae.cinema.model.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberResponseDto {

    private String email;

    public static MemberResponseDto memberResponseDto(Member member){
        return new MemberResponseDto(member.getEmail());
    }
}
