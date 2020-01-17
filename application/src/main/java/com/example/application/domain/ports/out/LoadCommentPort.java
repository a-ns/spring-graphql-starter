package com.example.application.domain.ports.out;

import com.example.application.domain.model.Comment;
import com.example.application.domain.model.CommentId;

import java.util.List;
import java.util.Optional;

public interface LoadCommentPort {
  Optional<Comment> getComment(CommentId id);

  List<Comment> getComments();
}
