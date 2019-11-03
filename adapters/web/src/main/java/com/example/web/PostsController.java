package com.example.web;

import com.example.Post;
import com.example.PostService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
@AllArgsConstructor
public class PostsController {

  private PostService service;

  @GetMapping
  public List<Post> getAllPosts() {
    return service.getPosts();
  }

  @PostMapping
  public Post createPost(@RequestBody Post body) {
    return this.service.createPost(body);
  }
}
