package ru.blackmirrror.pr14_24.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.*;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.blackmirrror.pr14_24.entity.Post;
import ru.blackmirrror.pr14_24.entity.User;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    EntityManager entityManager;
    @Override
    public List<User> getAllUsers() {
        Session session = entityManager.unwrap(Session.class);
        List<User> allUsers = session.createQuery("from User", User.class).getResultList();
        return allUsers;
    }

    @Override
    public void saveUser(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.persist(user);
    }

    @Override
    public User getUser(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(User.class, id);
    }

    @Override
    public void deleteUser(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("delete from Users where id =:userID");
        query.setParameter("userID", id);
        query.executeUpdate();
    }

    @Override
    public void setPostToUser(Post post, int id) {
        Session session = entityManager.unwrap(Session.class);
        User user = session.get(User.class, id);
        user.addPostToUser(post);
        session.saveOrUpdate(user);
    }

    @Override
    public List<User> getAllFilteredUsers(String firstName, String lastName, String middleName, String birthDate) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> query = cb.createQuery(User.class);
        Root<User> userRoot = query.from(User.class);
        Predicate predicate = cb.conjunction();

        if (firstName != null && !firstName.isEmpty()) {
            predicate = cb.and(predicate, cb.like(userRoot.get("firstName"), firstName));
        }
        if (lastName != null && !lastName.isEmpty()) {
            predicate = cb.and(predicate, cb.like(userRoot.get("lastName"), lastName));
        }
        if (middleName != null && !middleName.isEmpty()) {
            predicate = cb.and(predicate, cb.like(userRoot.get("middleName"), middleName));
        }
        if (birthDate != null && !birthDate.isEmpty()) {
            predicate = cb.and(predicate, cb.like(userRoot.get("birthDate"), birthDate));
        }

        query.select(userRoot).where(predicate);

        return entityManager.createQuery(query).getResultList();
    }
}
