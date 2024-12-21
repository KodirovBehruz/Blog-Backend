package com.blog.Blog_Backend.repository;

import com.blog.Blog_Backend.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
