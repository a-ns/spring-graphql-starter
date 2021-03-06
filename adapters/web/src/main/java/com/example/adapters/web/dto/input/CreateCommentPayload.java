package com.example.adapters.web.dto.input;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateCommentPayload implements Serializable {

  private Body comment;

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public class Body {
    private String body;
  }
}
