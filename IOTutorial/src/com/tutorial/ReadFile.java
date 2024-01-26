package com.tutorial;

import io.github.pixee.security.BoundedLineReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	private static final String fileName = "E:\\Asad_Work\\workspace\\IOTutorial\\test.txt";
	public static void main(String args[]){
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			String currentLine;
			
				while((currentLine = BoundedLineReader.readLine(br, 5_000_000))!=null){
					System.out.println(currentLine);
			
		} 
				
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try{
			if(br != null)
			{
				br.close();
			}
			
			if(fr != null)
			{
				fr.close();
			}
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
		
		
	}

}
