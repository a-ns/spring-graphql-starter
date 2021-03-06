package com.example.application.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Profile {
  private String username;
  private String bio;
  private String image;
  private Boolean following;
}
