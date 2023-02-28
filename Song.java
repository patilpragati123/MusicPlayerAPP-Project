package com.jspiders.musicplayer1.musicplayer;

public class Song {
	int id;
	String songName;
	String singerName;
	String movieName;
	String composer;
	String lyricist;
	double length;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getLyricist() {
		return lyricist;
	}
	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double d) {
		this.length = d;
	}
	
	
	@Override
	public String toString() {
		return "Song [id=" + id + ", songName=" + songName + ", singerName=" + singerName + ", movieName=" + movieName
				+ ", composer=" + composer + ", length=" + length + "]";
	}

}
