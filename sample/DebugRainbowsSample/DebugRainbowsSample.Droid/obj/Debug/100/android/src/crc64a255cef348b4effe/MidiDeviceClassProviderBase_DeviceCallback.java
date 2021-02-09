package crc64a255cef348b4effe;


public class MidiDeviceClassProviderBase_DeviceCallback
	extends android.media.midi.MidiManager.DeviceCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDeviceAdded:(Landroid/media/midi/MidiDeviceInfo;)V:GetOnDeviceAdded_Landroid_media_midi_MidiDeviceInfo_Handler\n" +
			"n_onDeviceRemoved:(Landroid/media/midi/MidiDeviceInfo;)V:GetOnDeviceRemoved_Landroid_media_midi_MidiDeviceInfo_Handler\n" +
			"n_onDeviceStatusChanged:(Landroid/media/midi/MidiDeviceStatus;)V:GetOnDeviceStatusChanged_Landroid_media_midi_MidiDeviceStatus_Handler\n" +
			"";
		mono.android.Runtime.register ("Uno.Devices.Enumeration.Internal.Providers.Midi.MidiDeviceClassProviderBase+DeviceCallback, Uno", MidiDeviceClassProviderBase_DeviceCallback.class, __md_methods);
	}


	public MidiDeviceClassProviderBase_DeviceCallback ()
	{
		super ();
		if (getClass () == MidiDeviceClassProviderBase_DeviceCallback.class)
			mono.android.TypeManager.Activate ("Uno.Devices.Enumeration.Internal.Providers.Midi.MidiDeviceClassProviderBase+DeviceCallback, Uno", "", this, new java.lang.Object[] {  });
	}


	public void onDeviceAdded (android.media.midi.MidiDeviceInfo p0)
	{
		n_onDeviceAdded (p0);
	}

	private native void n_onDeviceAdded (android.media.midi.MidiDeviceInfo p0);


	public void onDeviceRemoved (android.media.midi.MidiDeviceInfo p0)
	{
		n_onDeviceRemoved (p0);
	}

	private native void n_onDeviceRemoved (android.media.midi.MidiDeviceInfo p0);


	public void onDeviceStatusChanged (android.media.midi.MidiDeviceStatus p0)
	{
		n_onDeviceStatusChanged (p0);
	}

	private native void n_onDeviceStatusChanged (android.media.midi.MidiDeviceStatus p0);

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
