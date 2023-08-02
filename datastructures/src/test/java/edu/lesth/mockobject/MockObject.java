package edu.lesth.mockobject;

public class MockObject {

  private int integer;
  private String string;
  private char[] charArray;

  public MockObject() {
    integer = 0;
    string = "";
    charArray = new char[0];
  }

  public MockObject(int integer, String string, char[] charArray) {
    this.string = string;
    this.integer = integer;
    this.charArray = charArray;
  }

  public int getInteger() {
    return integer;
  }

  public void setInteger(int integer) {
    this.integer = integer;
  }

  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public char[] getCharArray() {
    return charArray;
  }

  public void setCharArray(char[] charArray) {
    this.charArray = charArray;
  }
}
