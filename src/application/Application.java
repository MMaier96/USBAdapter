package application;

import static application.logger.Logger.*;

import application.computer.Computer;
import application.computer.USB2Port;
import application.devices.IUSB2Device;
import application.devices.USB2DVDBurnerAdapter;

public class Application {

	public static void main(String[] args) {
		printMessage("Application started!");
		Computer computer = new Computer();
		printInfo("Computer created!");

		USB2Port usb2Port = new USB2Port();
		printInfo("USB2Port created!");

		computer.setUSB2Port(usb2Port);
		printInfo("USB2Port was added to computer!");

		usb2Port.addUSB2PortListener(computer);
		printInfo("Computer now is listening to the USB2Port!");

		printInfo("Creating DVDBurner with USB2PortAdapter!");
		IUSB2Device dvdBurnerAdapter = new USB2DVDBurnerAdapter();

		printInfo("Plugging DVDBurners Adapter into the USB2Port of the Computer ...");
		dvdBurnerAdapter.plugInUB2(usb2Port);

		printMessage("Application finished!");
	}
}
