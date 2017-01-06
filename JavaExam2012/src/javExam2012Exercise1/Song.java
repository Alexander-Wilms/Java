package javExam2012Exercise1;

import java.io.IOException;
import java.io.Writer;
import java.util.Comparator;

public class Song {
	private String artist;
	private String title;
	private float length;
	
	public Song(String artist, String title, float length) {
		this.artist = artist;
		this.title = title;
		this.length = length;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getTitle() {
		return title;
	}
	
	public float getLength() {
		return length;
	}
	
	public void write(Writer writer) {
		try {
			writer.write(artist + ";" + title + ";" + length + '\n');
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Comparator<Song> getComparator() {
		Comparator<Song> comp = new Comparator<Song> () {
			@Override 
			public int compare(Song song1, Song song2) {
				return song1.getTitle().compareTo(song2.getTitle());
			}
		};
		return comp;
	}
}
