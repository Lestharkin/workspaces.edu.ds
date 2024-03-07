package edu.lenin.model.repository;

import com.lestharkin.io.array.Array;

import edu.lenin.model.domain.Employee;
import edu.lenin.model.domain.User;
import edu.lenin.shared.filejsonadpater.FileJsonAdapter;
import edu.lenin.shared.filejsonadpater.FileJsonInterface;

public class EmployeeRepository {
  private FileJsonInterface<EmployeeEntity> fileJson;
  private String pathFile;

  public EmployeeRepository(String pathFile) {
    this.pathFile = pathFile;
    this.fileJson = FileJsonAdapter.getInstance();
  }

  public Employee getEmployee(String id) {
    EmployeeEntity[] employeeEntities = fileJson.getObjects(pathFile, EmployeeEntity[].class);
    for (EmployeeEntity employeeEntity : employeeEntities) {
      if (employeeEntity.id.equals(id)) {
        return new Employee(
            employeeEntity.names,
            employeeEntity.lastNames,
            new Array<>(employeeEntity.phoneNumbers.split(",")),
            employeeEntity.id);
      }
    }
    return Employee.getNullEmployee();
  }
}
