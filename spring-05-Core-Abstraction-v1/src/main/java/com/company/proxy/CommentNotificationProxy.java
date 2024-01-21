package com.company.proxy;

import com.company.model.Comment;

public interface CommentNotificationProxy {

    void sentComment(Comment comment);
}
