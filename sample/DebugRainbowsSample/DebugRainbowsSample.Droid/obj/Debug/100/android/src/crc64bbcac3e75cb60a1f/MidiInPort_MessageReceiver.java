package crc64bbcac3e75cb60a1f;


public class MidiInPort_MessageReceiver
	extends android.media.midi.MidiReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSend:([BIIJ)V:GetOnSend_arrayBIIJHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.Devices.Midi.MidiInPort+MessageReceiver, Uno", MidiInPort_MessageReceiver.class, __md_methods);
	}


	public MidiInPort_MessageReceiver ()
	{
		super ();
		if (getClass () == MidiInPort_MessageReceiver.class)
			mono.android.TypeManager.Activate ("Windows.Devices.Midi.MidiInPort+MessageReceiver, Uno", "", this, new java.lang.Object[] {  });
	}


	public MidiInPort_MessageReceiver (int p0)
	{
		super (p0);
		if (getClass () == MidiInPort_MessageReceiver.class)
			mono.android.TypeManager.Activate ("Windows.Devices.Midi.MidiInPort+MessageReceiver, Uno", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public void onSend (byte[] p0, int p1, int p2, long p3)
	{
		n_onSend (p0, p1, p2, p3);
	}

	private native void n_onSend (byte[] p0, int p1, int p2, long p3);

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
