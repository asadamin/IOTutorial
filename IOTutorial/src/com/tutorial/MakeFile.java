package com.tutorial;

import java.io.File;
import java.io.IOException;

public class MakeFile {
	
	public static void main(String args[]){
		
		String fileName = "test.txt";
		String workingDirectory = System.getProperty("user.dir");
		File file = new File(workingDirectory, fileName);
		
		System.out.println("Final filepath: "+workingDirectory);
		
		try {
			if(file.createNewFile())
			{
				System.out.println("File is created");
			}
			else{
				System.out.println("File is already created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
