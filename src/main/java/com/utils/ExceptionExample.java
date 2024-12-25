package com.utils;

public class ExceptionExample {

	public static void main(String[] args) {

		int c=1/0;

		System.out.println("before execution----1");

		try {
			System.out.println("in try block-------2");
		//	int c=1/0;

		} catch (Exception e) {
			System.out.println("in catch block------3");
		}
		System.out.println("after execution---------4");
	}
}
