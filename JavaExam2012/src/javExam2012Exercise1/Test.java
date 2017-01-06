package javExam2012Exercise1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test {

	public static void main(String[] args) {
		Playlist myPlaylist = new Playlist("Party music");
		Song song1 = new Song("Seeed","Wonderful World",(float) 3.22);
		Song song2 = new Song("Deichkind", "Bück dich hoch", (float) 4.13);
		Song song3 = new Song("Queen", "We will rock you", (float) 2.47);
		
		myPlaylist.addSong(song1);
		myPlaylist.addSong(song2);
		myPlaylist.addSong(song3);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		myPlaylist.dump(bw);
		try {
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
