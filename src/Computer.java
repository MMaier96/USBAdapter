
public class Computer implements IUSB2Listener {

	@Override
	public void handleNotification() {
		System.out.println("Device plugged in into USB2Port");
	}

}
