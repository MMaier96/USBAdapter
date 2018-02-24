package application.usb;
import application.computer.USB2Port;

public class DVDBurner implements IDevice{

	public void plugInUSB3(USB2Port usb2Port){
		System.out.println("DVDBurner plugged in!");
		usb2Port.setDevice(this);
	}
}
