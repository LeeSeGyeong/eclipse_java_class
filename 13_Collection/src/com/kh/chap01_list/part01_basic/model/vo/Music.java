package com.kh.chap01_list.part01_basic.model.vo;

public class Music {

	private String title;
	private String artist;
	
	public Music() {
		
	}

	public Music(String title, String artist) { //alt+shift+S > O : 매개변수 값 자동완성 
		//super();
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() { //alt + shift + s > r > alt+R 
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override //alt shift s > r > enter
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}
	
	
	
	
}
