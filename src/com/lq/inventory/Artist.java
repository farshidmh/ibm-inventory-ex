package com.lq.inventory;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Artist {
	private String name;
	private SortedSet<String> memberNames;
	private Map<String, SortedSet<String> > memberInstruments;
	
	public Artist() {
		memberNames = new TreeSet<String>();
		memberInstruments = new TreeMap<String, SortedSet<String>>();
	}
	
	public Artist(String name) {
		this();
		setName(name);
	}
	
	public void addMember(String name, SortedSet<String> instruments) {
		
		memberNames.add(name);
		memberInstruments.put(name, instruments);
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public SortedSet<String> getMemberNames() {
		return memberNames;
	}

	public Map<String, SortedSet<String>> getMemberInstruments() {
		return memberInstruments;
	}
	
	
	
	
	

}
