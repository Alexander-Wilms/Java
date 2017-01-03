package javaexam2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) {
		HashSet<Course> allcourses = new HashSet<Course>();
		HashMap<Integer, Student> allstudents = new HashMap<Integer, Student>();

		File file = new File("data.txt");
		try {
			Scanner myScanner = new Scanner(file);

			String buffer = "";

			int matrikel = 0;

			String firstName;

			String lastName;

			String course;

			boolean matrikelAlreadyRead = false;

			while (myScanner.hasNext()) {

				ArrayList<Course> mycourses = new ArrayList<Course>();

				if (!matrikelAlreadyRead) {
					buffer = myScanner.next();
					buffer = buffer.replaceAll(",", "");
				}
				matrikel = new Integer(buffer);
				System.out.println(matrikel);

				buffer = myScanner.next();
				buffer = buffer.replaceAll(",", "");
				lastName = buffer;
				System.out.println(lastName);

				buffer = myScanner.next();
				buffer = buffer.replaceAll(",", "");
				firstName = buffer;
				System.out.println(firstName);

				buffer = myScanner.next();
				buffer = buffer.replaceAll(",", "");

				while (!isInteger(buffer)) {
					buffer.replaceAll(",", "");
					course = buffer;
					Course mycourse = new Course(course);

					if (!allcourses.contains(mycourse))
						allcourses.add(mycourse);
					mycourses.add(mycourse);
					System.out.println(mycourses);

					if (myScanner.hasNext()) {
						buffer = myScanner.next();
						buffer = buffer.replaceAll(",", "");

					} else {
						break;
					}
				}

				Student myStudent = new Student(matrikel, lastName, firstName, mycourses);

				allstudents.put(myStudent.getMatrikel(), myStudent);

				matrikelAlreadyRead = true;
			}

			System.out.println("allcourses: " + allcourses);

			System.out.println("allstudents: " + allstudents);

			myScanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	static boolean isInteger(String input) {

		input = input.trim();
		boolean soFarOnlyNumbers = true;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '0' || input.charAt(i) == '1' || input.charAt(i) == '2' || input.charAt(i) == '3'
					|| input.charAt(i) == '4' || input.charAt(i) == '5' || input.charAt(i) == '6'
					|| input.charAt(i) == '7' || input.charAt(i) == '8' || input.charAt(i) == '9') {

			} else {
				soFarOnlyNumbers = false;
			}
		}

		return soFarOnlyNumbers;

	}

}
