package com.Collections.app.Set;

public class Student {

	public int id;
	public String name;
	public String standard;

	public Student(int id, String name, String standard) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", standard=" + standard + "]";
	}

}
