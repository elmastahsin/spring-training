package com.company.proxy;

import com.company.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sentComment(Comment comment) {
        System.out.println("Email sent to " + comment.getAuthor());
    }
}
