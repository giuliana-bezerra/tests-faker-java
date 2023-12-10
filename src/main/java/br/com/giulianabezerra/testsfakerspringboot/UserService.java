package br.com.giulianabezerra.testsfakerspringboot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserService {
  private Map<String, User> users = new HashMap<>();

  public void create(User user) {
    users.put(user.username(), user);
  }

  public User getUser(String username) {
    return users.get(username);
  }
}
