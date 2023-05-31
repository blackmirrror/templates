package ru.blackmirrror.pr14_24.dao;

import ru.blackmirrror.pr14_24.entity.Post;

import java.util.List;

public interface PostDAO {
    public List<Post> getAllPosts();
    public void savePost(Post post);
    public Post getPost(int id);
    public void deletePost(int id);

}
