package ru.blackmirrror.pr14_24.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.blackmirrror.pr14_24.dao.PostDAO;
import ru.blackmirrror.pr14_24.entity.Post;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostDAO postDAO;
    private final EmailService emailService;

    public PostServiceImpl(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    @Transactional
    public List<Post> getAllPosts() {
        return postDAO.getAllPosts();
    }

    @Override
    @Transactional
    public void savePost(Post post) {
        //emailService.sendSaveNotification("Post " + post.getId() + " saved");
        postDAO.savePost(post);
    }

    @Override
    public Post getPost(int id) {
        return postDAO.getPost(id);
    }

    @Override
    public void deletePost(int id) {
        postDAO.deletePost(id);
    }
}
