package edu.lenin.model.repository;

import edu.lenin.model.domain.User;
import edu.lenin.shared.filejsonadpater.FileJsonAdapter;
import edu.lenin.shared.filejsonadpater.FileJsonInterface;

public class UserRepository {
  
  private FileJsonInterface<UserEntity> fileJson;
  private String pathFile;

  public UserRepository(String pathFile) {
    this.pathFile = pathFile;
    this.fileJson = FileJsonAdapter.getInstance();
  }

  public User getUser(String username) {
    UserEntity[] userEntities = fileJson.getObjects(pathFile, UserEntity[].class);
    for (UserEntity userEntity : userEntities) {
      if (userEntity.username.equals(username)) {
        return new User();
      }
    }
  }


}
