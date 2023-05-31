package ru.blackmirrror.pr14_24.controllers;

import org.springframework.web.bind.annotation.*;
import ru.blackmirrror.pr14_24.entity.Post;
import ru.blackmirrror.pr14_24.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getPosts() {
        return postService.getAllPosts();
    }

    @PostMapping
    public void createPost(@RequestBody Post post) {
        postService.savePost(post);
    }

    @GetMapping("/{index}")
    public Post getPost(@PathVariable int index) {
        return postService.getPost(index);
    }

    @DeleteMapping("/{index}")
    public void deletePost(@PathVariable int index) {
        postService.deletePost(index);
    }
}
