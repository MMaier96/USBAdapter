package application.computer;

import application.devices.IUSB2Listener;
import static application.logger.Logger.*;

public class Computer implements IUSB2Listener {

	private USB2Port usb2port;

	public USB2Port getUSB2Port() {
		return usb2port;
	}

	@Override
	public void handleNotification() {
		printInfo(" USBPort notification: Device plugged in into USB2Port");
	}

	public void setUSB2Port(USB2Port usb2port) {
		this.usb2port = usb2port;
	}

}
