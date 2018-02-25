package tests;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import application.computer.Computer;
import application.computer.USB2Port;
import application.devices.IUSB2Device;
import application.devices.USB2DVDBurnerAdapter;

public class ApplicationTests {
	
	@Test
	public void PortTest() {

		Computer computer = new Computer();
		assertNotNull(computer);

		USB2Port usb2Port = new USB2Port();
		assertNotNull(usb2Port);

		computer.setUSB2Port(usb2Port);
		assertNotNull(computer.getUSB2Port());

		usb2Port.addUSB2PortListener(computer);
		assertNotNull(computer.getUSB2Port().getListeners());
		assertEquals(computer.getUSB2Port().getListeners().size(), 1);

		IUSB2Device dvdBurnerAdapter = new USB2DVDBurnerAdapter();
		assertNotNull(dvdBurnerAdapter);		
	}
}
