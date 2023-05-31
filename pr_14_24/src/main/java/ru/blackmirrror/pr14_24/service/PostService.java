package ru.blackmirrror.pr14_24.service;

import ru.blackmirrror.pr14_24.entity.Post;

import java.util.List;

public interface PostService {
    public List<Post> getAllPosts();
    public void savePost(Post post);
    public Post getPost(int id);
    public void deletePost(int id);
}
