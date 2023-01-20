package com.jspiders.serialization.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.jspiders.serialization.object.Student;

public class Deserialization {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("student.txt");
			
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			Student student = (Student) objectInputStream.readObject();
			System.out.println(student);
			objectInputStream.close();
			
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
