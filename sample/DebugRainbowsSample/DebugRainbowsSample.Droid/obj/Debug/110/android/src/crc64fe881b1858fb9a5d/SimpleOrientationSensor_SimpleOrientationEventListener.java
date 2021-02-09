package crc64fe881b1858fb9a5d;


public class SimpleOrientationSensor_SimpleOrientationEventListener
	extends android.view.OrientationEventListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onOrientationChanged:(I)V:GetOnOrientationChanged_IHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.Devices.Sensors.SimpleOrientationSensor+SimpleOrientationEventListener, Uno", SimpleOrientationSensor_SimpleOrientationEventListener.class, __md_methods);
	}


	public SimpleOrientationSensor_SimpleOrientationEventListener (android.content.Context p0)
	{
		super (p0);
		if (getClass () == SimpleOrientationSensor_SimpleOrientationEventListener.class)
			mono.android.TypeManager.Activate ("Windows.Devices.Sensors.SimpleOrientationSensor+SimpleOrientationEventListener, Uno", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public SimpleOrientationSensor_SimpleOrientationEventListener (android.content.Context p0, int p1)
	{
		super (p0, p1);
		if (getClass () == SimpleOrientationSensor_SimpleOrientationEventListener.class)
			mono.android.TypeManager.Activate ("Windows.Devices.Sensors.SimpleOrientationSensor+SimpleOrientationEventListener, Uno", "Android.Content.Context, Mono.Android:Android.Hardware.SensorDelay, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public void onOrientationChanged (int p0)
	{
		n_onOrientationChanged (p0);
	}

	private native void n_onOrientationChanged (int p0);

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
