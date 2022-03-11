package com.lq.main;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import com.lq.inventory.Book;

public class BookEx {

	
	public static List<Book> readBooksFromFile(String name){
		
		
		List<Book> books = null;
		
		try {
			FileInputStream inFile = new FileInputStream(name);
			InputStreamReader inReader = new InputStreamReader(inFile);
			LineNumberReader lineReader = new LineNumberReader(inReader);
			
			books = new ArrayList<Book>();
			
			String line;
			

			while(   ( line =   lineReader.readLine() ) != null    ) {
				
			
				String title = line;
				
				line = lineReader.readLine();
				
				String author = line;
				
				line = lineReader.readLine();
				
				double price = Double.parseDouble( line );
					
				
				Book t= new Book(title, price, 1, author, "A", "Sci0-FI");
						
				books.add(t);
				
				
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return books;
		
	}
	
	
	public static void main(String[] args) {

		
		List<Book> books = readBooksFromFile("D:\\smalltext\\book\\books.txt");
		

		for( Book s : books ) {
			
			System.out.println(  s.getTitle() );
			
		}
		
		
		
			
		
	}

}
