package Remote;

import java.util.ArrayList;

import Bark.Bark;
import DogDoor.DogDoor;
public class BarkRecognizer {
 private  DogDoor door;
 public BarkRecognizer(DogDoor door){
	 this.door=door;
 }
 public void recognoise(Bark  bark){
	 ArrayList<Bark> compareBark=door.getAllowedBarks();
	 for(Bark bark1:compareBark){
		 if(bark.equaled(bark1)){
			 System.out.println("this dog is yours,the door will open soon");
			 door.OpenDoor();
			 break;
		 }else {
			continue;
		}
	 }
	 System.out.println("this is not your dog");
 }
}
