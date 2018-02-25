package application.devices;

import application.computer.USB2Port;
import static application.logger.Logger.*;

public class DVDBurner implements IDevice {

	public void plugInUSB3(USB2Port usb2Port) {
		printInfo("DVDBurner plugged in!");
		usb2Port.setDevice(this);
	}
}
