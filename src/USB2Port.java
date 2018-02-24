import java.util.ArrayList;

public class USB2Port {

	ArrayList<IUSB2Listener> listeners;
	private IDevice usb2Device;

	public USB2Port() {
		listeners = new ArrayList<IUSB2Listener>();
	}

	public void addUSB2PortListener(IUSB2Listener usb2Listener) {
		listeners.add(usb2Listener);
	}

	public void removeUSB2PortListener(IUSB2Listener usb2Listener) {
		if (listeners.contains(usb2Listener)) {
			listeners.remove(usb2Listener);
		}
	}
	
	public void notifyListeners(){
		for (IUSB2Listener iusb2Listener : listeners) {
			iusb2Listener.handleNotification();
		}
	}

	public void setDevice(IDevice device) {
		this.usb2Device = device;
		notifyListeners();
		
	}
}
