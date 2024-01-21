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

        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class);


        CommentService commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);

    }
}
