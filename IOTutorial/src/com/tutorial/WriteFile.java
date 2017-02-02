package com.tutorial;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	public static void main(String args[])
	{
		FileOutputStream fop = null;
		File file;
		String content = "This is the new content";
		
		try {
			file = new File("E:\\Asad_Work\\workspace\\IOTutorial\\example.txt");
			fop = new FileOutputStream(file);
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			byte[] contentBytes = content.getBytes();
			fop.write(contentBytes);
			fop.flush();
			fop.close();
			System.out.println("Content written in file");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fop!=null)
			{
				try {
					fop.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
	
		
	}
	
	

}
