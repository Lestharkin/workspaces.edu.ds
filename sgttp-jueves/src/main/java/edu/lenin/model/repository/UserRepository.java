package edu.lenin.model.repository;

import java.io.Serializable;

import edu.lenin.model.domain.Employee;
import edu.lenin.model.domain.User;
import edu.lenin.shared.filejsonadpater.FileJsonAdapter;
import edu.lenin.shared.filejsonadpater.FileJsonInterface;

public class UserRepository implements Serializable {
  
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
        EmployeeRepository employeeRepository = new EmployeeRepository("../../database/employee.json");
        Employee employee = employeeRepository.getEmployee(userEntity.person);
        return new User(userEntity.username, userEntity.password, employee);
      }
    }
    return User.getNullUser();
  }


}
