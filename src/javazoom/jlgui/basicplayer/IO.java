package javazoom.jlgui.basicplayer;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

public class IO {
	
	public static void main(String[] args) throws Exception {
		File f = new File("/Users/matthewmolloy/clojure/clj-shoutcast/songs/Gary Butcher - Stronger Love.wav");
		AudioInputStream in = AudioSystem.getAudioInputStream(f);
	}
}
