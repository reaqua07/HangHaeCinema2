package com.hanghae.cinema.controller;

import com.hanghae.cinema.dto.LikeResponseDto;
import com.hanghae.cinema.model.LikeReview;
import com.hanghae.cinema.repository.LikeRepository;
import com.hanghae.cinema.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class LikeController {

    final LikeService likeService;
    final LikeRepository likeRepository;

    @GetMapping("/api/like")
        public List<LikeReview> getMoives()  {
        System.out.println("호출 몇번됩니까?");
        List<LikeReview> lr =  likeRepository.findAll();

        return lr;
    }

    @PostMapping("/api/like")
    public ResponseEntity<Void> clickLike(@RequestBody LikeResponseDto likeResponseDto){
        likeService.clickLike(likeResponseDto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/api/like")
    public String deleteLike(@RequestBody LikeResponseDto likeResponseDto){
        likeService.deleteLike(likeResponseDto);
        return "delete";
    }

}
