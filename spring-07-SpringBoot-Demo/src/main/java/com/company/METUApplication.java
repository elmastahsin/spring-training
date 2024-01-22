package com.company;

import com.company.model.Comment;
import com.company.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class METUApplication {

    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Mike");
        comment.setComment("Spring FrameWork");

        ApplicationContext container = SpringApplication.run(METUApplication.class, args);

        CommentService commentService = container.getBean(CommentService.class);

        commentService.publishComment(comment);
        commentService.printConfigData();
        commentService.printDBConfigData();
    }

}
