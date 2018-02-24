
public class DVDBurner implements IDevice{

	public void plugInUSB3(USB2Port usb2Port){
		System.out.println("DVDBurner plugged in!");
		usb2Port.setDevice(this);
	}
}
