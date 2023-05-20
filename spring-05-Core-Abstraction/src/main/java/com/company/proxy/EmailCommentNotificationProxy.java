package com.company.proxy;

import com.company.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMail")
public class EmailCommentNotificationProxy implements  CommentNotificationProxy{
    @Override
    public void sentComment(Comment comment) {
        System.out.println("Sending email notification for comment: " + comment.getText());

    }
}
