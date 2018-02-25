package application.computer;

import java.util.ArrayList;

import application.devices.IDevice;
import application.devices.IUSB2Listener;

public class USB2Port {

	ArrayList<IUSB2Listener> listeners;
	private IDevice usb2Device;

	public USB2Port() {
		listeners = new ArrayList<IUSB2Listener>();
	}

	public void addUSB2PortListener(IUSB2Listener usb2Listener) {
		listeners.add(usb2Listener);
	}

	public ArrayList<IUSB2Listener> getListeners() {
		return listeners;
	}

	public IDevice getUsb2Device() {
		return usb2Device;
	}

	public void notifyListeners() {
		for (IUSB2Listener iusb2Listener : listeners) {
			iusb2Listener.handleNotification();
		}
	}

	public void removeUSB2PortListener(IUSB2Listener usb2Listener) {
		if (listeners.contains(usb2Listener)) {
			listeners.remove(usb2Listener);
		}
	}

	public void setDevice(IDevice device) {
		this.usb2Device = device;
		notifyListeners();

	}

	public void setListeners(ArrayList<IUSB2Listener> listeners) {
		this.listeners = listeners;
	}

	public void setUsb2Device(IDevice usb2Device) {
		this.usb2Device = usb2Device;
	}
}
