package com.student.pack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentNarsi student = new StudentNarsi();
		student.setsId(1);
		student.setName("Narsi");
		student.setSclass("Inter");
		
		System.out.println("Details of student : "+ student.getsId() + student.getName() + student.getSclass());

	}

}
