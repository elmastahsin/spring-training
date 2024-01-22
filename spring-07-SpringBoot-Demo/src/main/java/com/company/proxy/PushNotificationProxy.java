package com.company.proxy;

import com.company.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Push")
public class PushNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sentComment(Comment comment) {
        System.out.println("Sending push notification for comment : " + comment.getComment());
    }
}
