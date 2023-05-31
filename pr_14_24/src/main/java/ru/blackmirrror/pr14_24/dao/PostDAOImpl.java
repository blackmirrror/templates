package ru.blackmirrror.pr14_24.dao;

import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.blackmirrror.pr14_24.entity.Post;

import java.util.List;

@Repository
public class PostDAOImpl implements PostDAO{

    @Autowired
    EntityManager entityManager;
    @Override
    public List<Post> getAllPosts() {
        Session session = entityManager.unwrap(Session.class);
        List<Post> allPosts = session.createQuery("from Post", Post.class).getResultList();
        return allPosts;
    }

    @Override
    public void savePost(Post post) {
        Session session = entityManager.unwrap(Session.class);
        session.persist(post);
    }

    @Override
    public Post getPost(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Post.class, id);
    }

    @Override
    public void deletePost(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("delete from Posts where id =:postID");
        query.setParameter("postID", id);
        query.executeUpdate();
    }
}
