package com.example.Entity;

import java.io.Serializable;

public class Player implements Serializable {
	private static final long serialVersionUID = 7760614561073458247L;
	private int id;
	private String name;
	private int age = 0;
	private String gender = "Empty";
	private int averageSpeed = 0;
	private int addedWeight = 0;
	private int maxSpeed = 0;
	private int minSpeed = 0;
	private int formulaId = 0;
	private String other = "{}";
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAverageSpeed() {
	return averageSpeed;
}
public void setAverageSpeed(int averageSpeed) {
	this.averageSpeed = averageSpeed;
}
public int getAddedWeight() {
	return addedWeight;
}
public void setAddedWeight(int addedWeight) {
	this.addedWeight = addedWeight;
}
public int getMaxSpeed() {
	return maxSpeed;
}
public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}
public int getMinSpeed() {
	return minSpeed;
}
public void setMinSpeed(int minSpeed) {
	this.minSpeed = minSpeed;
}
public int getFormulaId() {
	return formulaId;
}
public void setFormulaId(int formulaId) {
	this.formulaId = formulaId;
}
public String getOther() {
	return other;
}
public void setOther(String other) {
	this.other = other;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
}
