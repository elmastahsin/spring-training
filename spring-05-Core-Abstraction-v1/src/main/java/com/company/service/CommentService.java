package com.company.service;

import com.company.model.Comment;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    void publishComment(Comment comment);
}
