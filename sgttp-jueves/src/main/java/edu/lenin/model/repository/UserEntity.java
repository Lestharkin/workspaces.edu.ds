package edu.lenin.model.repository;

import java.io.Serializable;

public class UserEntity implements Serializable {
  String person;
  String username;
  String password;

  public UserEntity(String person, String username, String password) {
    this.person = person;
    this.username = username;
    this.password = password;
  }
}
