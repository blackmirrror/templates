package ru.blackmirrror.pr14_24.tests;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import ru.blackmirrror.pr14_24.dao.PostDAO;
import ru.blackmirrror.pr14_24.entity.Post;
import ru.blackmirrror.pr14_24.service.EmailService;
import ru.blackmirrror.pr14_24.service.PostService;
import ru.blackmirrror.pr14_24.service.PostServiceImpl;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class PostServiceImplTest {

    @Mock
    private PostDAO postDAO;

    @Mock
    private EmailService emailService = new EmailService();

    @InjectMocks
    private PostService postService = new PostServiceImpl(emailService);

    public PostServiceImplTest() {
    }

    @Test
    public void getAllPosts_shouldReturnListOfPosts() {
        List<Post> expectedPosts = Arrays.asList(new Post(), new Post(), new Post());
        Mockito.when(postDAO.getAllPosts()).thenReturn(expectedPosts);

        List<Post> actualPosts = postService.getAllPosts();

        assertEquals(expectedPosts, actualPosts);
    }

    @Test
    public void savePost_shouldSavePostAndSendNotification() {
        Post post = new Post();
        post.setSomeText("some");

        postService.savePost(post);

        Mockito.verify(postDAO).savePost(post);
    }
}
