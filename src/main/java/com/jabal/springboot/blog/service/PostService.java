package com.jabal.springboot.blog.service;

import com.jabal.springboot.blog.payload.PostDto;
import com.jabal.springboot.blog.payload.PostResponse;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
}
