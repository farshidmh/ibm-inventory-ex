package com.lq.inventory;

import java.util.Date;

public class CD extends Item {
		
	private Artist artists;
	private Date relaseDate;

	
	public CD(String title, double price, int quantity, Artist artists, Date relaseDate) {
		super(title, price, quantity);
		setArtists(artists);
		setRelaseDate(relaseDate);
	}

	public Artist getArtists() {
		return artists;
	}

	public void setArtists(Artist artists) {
		this.artists = artists;
	}

	public Date getRelaseDate() {
		return relaseDate;
	}

	public void setRelaseDate(Date relaseDate) {
		this.relaseDate = relaseDate;
	}

	
	
	
	
	
	
	
	
	
	
	
}
