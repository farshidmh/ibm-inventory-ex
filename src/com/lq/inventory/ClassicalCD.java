package com.lq.inventory;

import java.util.Date;

public class ClassicalCD extends Item {
	
	private String composer;
	private String[] performers = new String[5];
	private String recordingLocation;
	private Date releaseDate;
	private int perfomerCount=0;

	public void addPerformer(String perfomer) {		
		if(  perfomerCount < performers.length ) {			
			performers[ perfomerCount++ ] = perfomer;			
		}else {			
			System.out.println("Cannot add more to "+getTitle());	
		}
	}
	
	public void showPerformers() {
		if(  perfomerCount>0 ) {	
			for( int i = 0 ; i<perfomerCount ; i++) {
				System.out.println( performers[i] );
			}	
		}	
	}
	
	
	
	public ClassicalCD(String title, double price, int quantity, String composer,String recordingLocation, Date releaseDate) {
		super(title, price, quantity);
		setComposer(composer);
		setRecordingLocation(recordingLocation);
		setReleaseDate(releaseDate);
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getRecordingLocation() {
		return recordingLocation;
	}
	public void setRecordingLocation(String recordingLocation) {
		this.recordingLocation = recordingLocation;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	
	
	
	

}
