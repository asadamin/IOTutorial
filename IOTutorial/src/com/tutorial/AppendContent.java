package com.tutorial;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class AppendContent {
	
	public static void main(String args[]){
		
		try {
			appendContent();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void appendContent() throws IOException{
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		String content = "This is new new content";
		File file = new File("E:\\Asad_Work\\workspace\\IOTutorial\\example.txt");
		
				if(!file.exists())
				{
					file.createNewFile();

				}
				
				fw = new FileWriter(file.getAbsolutePath(), true);
				bw = new BufferedWriter(fw);
				
				bw.write(content);
				System.out.println("Done");

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();
				
		//		deleteFile();
			findLineNums();	
		
	}
	
	public static void deleteFile(){
		File file2 = new File("E:\\Asad_Work\\workspace\\IOTutorial\\test.txt");
		file2.delete();
		
		
	}
	
	public static void findLineNums() throws IOException{
		File file2 = new File("E:\\Asad_Work\\workspace\\IOTutorial\\lineTest.txt");
		FileReader fileReader = new FileReader(file2);
		LineNumberReader lnr = new LineNumberReader(fileReader);
		int lineNumber = 0;
		
		while(lnr.readLine() != null)
		{
			lineNumber++;
		}
		
	}
	
	
	
}



