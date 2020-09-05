package guru.springframework.solid;

public class LIghtBulb implements Switchable{

	
	public void turnOn() {
		System.out.println("LightBulb: Bulb turned on...");
	}
	
	public void turnOff() {
		System.out.println("LightBulb: Bulb turned off");
	}
	
}
