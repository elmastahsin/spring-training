package com.company.proxy;

import com.company.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("push")
public class PushCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sentComment(Comment comment) {
        System.out.println("Push notification sent to " + comment.getAuthor());
    }
}
