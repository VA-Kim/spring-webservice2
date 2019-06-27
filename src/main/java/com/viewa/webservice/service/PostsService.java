package com.viewa.webservice.service;

import com.viewa.webservice.domain.posts.PostsRepository;
import com.viewa.webservice.dto.posts.PostsSaveRequestDto;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional  //http://wonwoo.ml/index.php/post/776 javax의 트랜잭션과 spring의 트랜잭션 차이
    public Long save(PostsSaveRequestDto dto) {
        return postsRepository.save(dto.toEntity()).getId();
    }
}