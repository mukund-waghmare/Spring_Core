package com.ty;

import java.util.List;

public class Student {
	
	private String name;
	private int age;
	private List<String> subjectName;
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
	public List<String> getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(List<String> subjectName) {
		this.subjectName = subjectName;
	}
	public Student(String name, int age, List<String> subjectName) {
	
		this.name = name;
		this.age = age;
		this.subjectName = subjectName;
	}
	
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", subjectName=" + subjectName + "]";
	}
	
	
}
