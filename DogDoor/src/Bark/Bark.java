package Bark;

public class Bark {
	private String sound;
	public String getSound(){
		return sound;
	}
	public Bark(String sound){
	  this.sound=sound;	
	}
	public boolean equaled(Object openBark){
		if(openBark instanceof Bark){
		Bark OpenBark1= (Bark)openBark;
		if(this.sound.equals(OpenBark1.sound))
		{
			return true;
		}
		return false;
		}
		return false;
	}
}
