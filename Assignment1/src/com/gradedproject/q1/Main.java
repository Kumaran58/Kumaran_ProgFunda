package com.gradedproject.q1;

public class Main {

	public static void main(String[] args) {

		AdminDepartment ob1=new AdminDepartment();
		HrDepartment ob2=new HrDepartment();
		TechDepartment ob3=new TechDepartment();


		System.out.println("Welcome to "+ob1.departmentName());
		System.out.println(ob1.getTodaysWork());
		System.out.println(ob1.getWorkDeadline());
		System.out.println(ob1.isTodayAHoliday());

		System.out.println("");

		System.out.println("Welcome to "+ob2.departmentName());
		System.out.println(ob2.doActivity());
		System.out.println(ob2.getTodaysWork());
		System.out.println(ob2.getWorkDeadline());
		System.out.println(ob2.isTodayAHoliday());


		System.out.println("");


		System.out.println("Welcome to "+ob3.departmentName());
		System.out.println(ob3.getTodaysWork());
		System.out.println(ob3.getWorkDeadline());
		System.out.println(ob3.getTechStackInformation());
		System.out.println(ob3.isTodayAHoliday());

	}

}
