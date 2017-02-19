

public class Sound {
	
	private int sound;

	public getSound() {
		return sound;
	}
	
	Clip c = AudioSystem.getClip();
	AudioInputStream ais = AudioSystem.getAudioInputStream(new File("play.wav"));

	c.open(ais);
	c.loop(0);

	Thread.sleep(time); // ѕриостановить поток, пока играет музыка
	
}