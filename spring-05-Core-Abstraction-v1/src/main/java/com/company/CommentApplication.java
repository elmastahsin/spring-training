package com.company;

import com.company.config.CommentConfig;
import com.company.model.Comment;
import com.company.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApplication {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Mike");
        comment.setComment("Spring FrameWork");

        Comment comment1 = new Comment();
        comment1.setAuthor("Tyson");
        comment1.setComment("Comment Application works properly");
        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class);


        CommentService commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);

        commentService.publishComment(comment1);

    }
}
