package crc64fe881b1858fb9a5d;


public class SimpleOrientationSensor_SettingsContentObserver
	extends android.database.ContentObserver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_deliverSelfNotifications:()Z:GetDeliverSelfNotificationsHandler\n" +
			"n_onChange:(Z)V:GetOnChange_ZHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.Devices.Sensors.SimpleOrientationSensor+SettingsContentObserver, Uno", SimpleOrientationSensor_SettingsContentObserver.class, __md_methods);
	}


	public SimpleOrientationSensor_SettingsContentObserver (android.os.Handler p0)
	{
		super (p0);
		if (getClass () == SimpleOrientationSensor_SettingsContentObserver.class)
			mono.android.TypeManager.Activate ("Windows.Devices.Sensors.SimpleOrientationSensor+SettingsContentObserver, Uno", "Android.OS.Handler, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public boolean deliverSelfNotifications ()
	{
		return n_deliverSelfNotifications ();
	}

	private native boolean n_deliverSelfNotifications ();


	public void onChange (boolean p0)
	{
		n_onChange (p0);
	}

	private native void n_onChange (boolean p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
