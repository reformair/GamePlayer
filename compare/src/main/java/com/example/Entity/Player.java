package com.example.Entity;

import java.io.Serializable;

public class Player implements Serializable {
	private static final long serialVersionUID = 7760614561073458247L;
  int ID;
  String Name;
  int Age;
  String Gender;
  int speed_average;
  int Load;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public int getSpeed_average() {
	return speed_average;
}
public void setSpeed_average(int speed_average) {
	this.speed_average = speed_average;
}
public int getLoad() {
	return Load;
}
public void setLoad(int load) {
	Load = load;
}

  
}
