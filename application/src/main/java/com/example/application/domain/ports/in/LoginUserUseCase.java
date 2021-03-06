package com.example.application.domain.ports.in;

import com.example.application.domain.model.User;
import javax.security.auth.login.FailedLoginException;

public interface LoginUserUseCase {
  public User login(String email, String password) throws FailedLoginException;
}
