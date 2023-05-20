package com.company.proxy;

import com.company.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
