package application;
import application.computer.Computer;
import application.computer.USB2Port;
import application.usb.IUSB2Device;
import application.usb.USB2DVDBurnerAdapter;

public class Application {

	public static void main(String[] args) {
		Computer computer = new Computer();
		USB2Port usb2Port = new USB2Port();
		usb2Port.addUSB2PortListener(computer);
		IUSB2Device dvdBurnerAdapter = new USB2DVDBurnerAdapter();
		dvdBurnerAdapter.plugInUB2(usb2Port);
	}
}
