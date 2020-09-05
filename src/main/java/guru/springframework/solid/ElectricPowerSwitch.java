package guru.springframework.solid;

public class ElectricPowerSwitch implements Switch{

	public Switchable client;
	public boolean on;
	
	
	public ElectricPowerSwitch(Switchable client) {
		
		this.client = client;
		this.on = false;
	}

	@Override
	public boolean isOn() {
		return this.on;
	}

	@Override
	public void press() {
		
		boolean checkOn = isOn();
		if(checkOn) {
			this.client.turnOff();
			this.on = false;
		}else {
			this.client.turnOn();
			this.on = true;
		}
		
	}

	
	
	
	
	
}
