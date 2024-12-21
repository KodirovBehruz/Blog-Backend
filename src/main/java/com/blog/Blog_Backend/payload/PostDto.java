package com.blog.Blog_Backend.payload;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 2, message = "Post Title should have at least 2 character")
    private String title;

    @NotEmpty
    @Size(min = 10, message = "Post Title should have at least 10 character")
    private String description;

    @NotEmpty
    private String imageUrl;

    @NotEmpty
    private String brand;

    @NotNull
    @Min(value = 1, message = "Price should be greater than 0")
    private Double price;

    private Set<CommentDto> comments;
}
