package com.blog.Blog_Backend.service;

import com.blog.Blog_Backend.payload.PostDto;
import com.blog.Blog_Backend.payload.PostResponse;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDto getPostById(long id);
    PostDto updatePost(PostDto postDto, long id);
    void deletePostById(long id);
}
