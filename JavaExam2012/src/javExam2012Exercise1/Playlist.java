package javExam2012Exercise1;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class Playlist {
	private String name;
	private ArrayList<Song> songlist;
	
	public Playlist(String name) {
		this.name = name;
		songlist = new ArrayList<Song>(); 
	}
	
	public String getName() {
		return name;
	}
	
	public void addSong(Song song) {
		songlist.add(song);
	}
	
	public Song getSongByNumber(int numberOfSong) {
		return songlist.get(numberOfSong+1);
	}
	
	public void dump(Writer writer) {
		Collections.sort(songlist, Song.getComparator());
		Iterator<Song> iter = songlist.iterator();
		while(iter.hasNext()) {
			iter.next().write(writer);
		}
		
	}
}
