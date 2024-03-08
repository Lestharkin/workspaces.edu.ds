package edu.lenin.model.repository;

public class UserEntity {
  String person;
  String username;
  String password;

  public UserEntity(String person, String username, String password) {
    this.person = person;
    this.username = username;
    this.password = password;
  }
}
