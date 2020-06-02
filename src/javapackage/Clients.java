package javapackage;

interface MediaPlayer
{
	public void play(String file);

}

class MP3 implements MediaPlayer

{

	@Override
	public void play(String file) {
		
		System.out.println("Mp3 player " +file);	
	}

}

class Avi implements MediaPlayer
{

	@Override
	public void play(String file) {
	
		System.out.println("AVI player " +file);		
	}
	

}


class MediaPlayerFactory
{
	
	public MediaPlayer getMediaPlayer(String filename)
	{
		if(filename.endsWith(".mp3"))
			return new MP3();
		else if(filename.endsWith(".avi"))
			return new Avi();
		else
			return null;
	}


}

public class Clients {

	public static void main(String[] args) {
		
		String file= "songs.mp3";
		MediaPlayerFactory obj= new MediaPlayerFactory();
		MediaPlayer  obj2 = obj.getMediaPlayer(file);
		obj2.play(file);

	}

}
