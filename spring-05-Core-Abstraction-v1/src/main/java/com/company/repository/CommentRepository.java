package com.company.repository;

import com.company.model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository {

    void storeComment(Comment comment);
}
