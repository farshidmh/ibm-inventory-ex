package com.lq.main;

import java.util.SortedSet;
import java.util.TreeSet;

import com.lq.inventory.Artist;

public class ArtistEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Artist hotplate = new Artist("Hot Plate");
		
		SortedSet<String> instro1 = new TreeSet<String>();
		
		instro1.add("Piano");
		instro1.add("Clarinet");
		instro1.add("Hurdy Gurdy");
		instro1.add("Tuba");
		
		
		hotplate.addMember("John", instro1);
		
		SortedSet<String> instro2 = new TreeSet<String>();	
		instro2.add("Guitar");
		
		hotplate.addMember("Jane", instro2);
		
		System.out.println( hotplate.getMemberNames() );
		
		
	}

}
