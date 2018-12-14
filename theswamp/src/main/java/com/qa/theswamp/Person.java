package com.qa.theswamp;

public class Person {

	private String name;
	private int xCord;
	private int yCord;

	public Person(String name, int xCord, int yCord) {
		this.setName(name);
		this.setxCord(xCord);
		this.setyCord(yCord);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getxCord() {
		return xCord;
	}

	public void setxCord(int xCord) {
		this.xCord = xCord;
	}

	public int getyCord() {
		return yCord;
	}

	public void setyCord(int yCord) {
		this.yCord = yCord;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", xCord=" + xCord + ", yCord=" + yCord + "]";
	}

}
