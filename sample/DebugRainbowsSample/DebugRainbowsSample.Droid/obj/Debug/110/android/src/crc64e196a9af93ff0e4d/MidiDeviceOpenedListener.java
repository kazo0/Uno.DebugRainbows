package crc64e196a9af93ff0e4d;


public class MidiDeviceOpenedListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.midi.MidiManager.OnDeviceOpenedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDeviceOpened:(Landroid/media/midi/MidiDevice;)V:GetOnDeviceOpened_Landroid_media_midi_MidiDevice_Handler:Android.Media.Midi.MidiManager/IOnDeviceOpenedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Uno.Devices.Midi.Internal.MidiDeviceOpenedListener, Uno", MidiDeviceOpenedListener.class, __md_methods);
	}


	public MidiDeviceOpenedListener ()
	{
		super ();
		if (getClass () == MidiDeviceOpenedListener.class)
			mono.android.TypeManager.Activate ("Uno.Devices.Midi.Internal.MidiDeviceOpenedListener, Uno", "", this, new java.lang.Object[] {  });
	}


	public void onDeviceOpened (android.media.midi.MidiDevice p0)
	{
		n_onDeviceOpened (p0);
	}

	private native void n_onDeviceOpened (android.media.midi.MidiDevice p0);

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
