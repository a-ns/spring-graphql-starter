package com.example.application.domain.services.userprofile;

import static org.mockito.Mockito.when;

import com.example.application.domain.model.Profile;
import com.example.application.domain.model.User;
import com.example.application.domain.ports.out.LoadProfilePort;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GetProfileQueryServiceTest {

  @InjectMocks GetProfileQueryService sut;
  @Mock LoadProfilePort loadProfilePort;

  @DisplayName("Get a profile")
  @Test
  void get_profile() {
    // Arrange
    String username = "bob";
    Optional<User> request = Optional.empty();
    Profile profile = Profile.builder().username("bob").build();
    when(loadProfilePort.isFollowing("bob", request)).thenReturn(false);
    when(loadProfilePort.loadProfile("bob")).thenReturn(Optional.of(profile));
    // Act

    Profile actual = sut.getProfile(username, request);
    // Assert
    Profile expected = Profile.builder().username("bob").following(false).build();
    Assertions.assertEquals(expected, actual);
  }
}
