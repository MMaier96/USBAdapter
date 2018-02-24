package application.usb;
import application.computer.USB2Port;

public class USB2DVDBurnerAdapter extends DVDBurner implements IUSB2Device{

	@Override
	public void plugInUB2(USB2Port usb2Port) {
		plugInUSB3(usb2Port);
	}
}
