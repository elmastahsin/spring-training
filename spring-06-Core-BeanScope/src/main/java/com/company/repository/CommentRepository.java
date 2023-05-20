package com.company.repository;

import com.company.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
