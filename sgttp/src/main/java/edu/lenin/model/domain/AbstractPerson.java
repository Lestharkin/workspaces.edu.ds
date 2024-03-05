package edu.lenin.model.domain;

import java.io.Serializable;

import com.lestharkin.io.array.Array;

public class AbstractPerson implements Serializable {
  private String names;
  private String lastNames;
  protected Array<String> phoneNumbers;

  public AbstractPerson() {
    this.names = "";
    this.lastNames = "";
    this.phoneNumbers = new Array<>(1);
  }

  public AbstractPerson(String names, String lastNames, Array<String> phoneNumbers) {
    this.names = names;
    this.lastNames = lastNames;
    this.phoneNumbers = phoneNumbers;
  }

  public String getNames() {
    return names;
  }

  public void setNames(String names) {
    this.names = names;
  }

  public String getLastNames() {
    return lastNames;
  }

  public void setLastNames(String lastNames) {
    this.lastNames = lastNames;
  }

  public Array<String> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(Array<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  

  
}
