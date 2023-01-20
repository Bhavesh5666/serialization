package com.jspiders.serialization.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.jspiders.serialization.object.Student;

public class Serialization  {

	public static void main(String[] args) {
		File file  = new File("student.txt");
		try {
			file.createNewFile();
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			
			Student student = new Student();
			
			student.setId(001);
			student.setName("BHAVESH");
			student.setEmail("bhaveshsonar.5666@gmail.com");
			student.setAddress("pune");
			
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student);
			System.out.println("object written to file successfully");
			
			objectOutputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	

}
