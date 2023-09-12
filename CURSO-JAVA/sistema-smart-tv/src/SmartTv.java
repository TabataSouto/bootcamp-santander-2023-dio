public class SmartTv {
	boolean on = false;
	int channel = 1;
	int volume = 25;

	public void turnOn() {
		on = true;
	}

	public void turnOf() {
		on = false;
	}

	public void lowerVolume() {
		volume--;
	}

	public void changeChannel(int newChannel) {
		channel = newChannel;
	}
}
