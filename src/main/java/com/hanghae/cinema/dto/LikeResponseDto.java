package com.hanghae.cinema.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class LikeResponseDto {
    private Long review;
    private String user;
}
