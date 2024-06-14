package com.springtutorial.core.xml.inCollection;

import java.util.Map;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private Address address;
	private Set<String> phoneNumbers;
	private Map<String, String> courses;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Address address, Set<String> phoneNumbers, Map<String, String> courses) {
		super();
		System.out.println("Contructor injection");
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumbers = phoneNumbers;
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Setter Injection");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter Injection");
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setter Injection");
		this.address = address;
	}

	public Set<String> getPhoneNumbers() {
		System.out.println("Setter Injection");
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<String> phoneNumbers) {
		System.out.println("Setter Injection");
		this.phoneNumbers = phoneNumbers;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		System.out.println("Setter Injection");
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumbers=" + phoneNumbers
				+ ", courses=" + courses + "]";
	}

}
