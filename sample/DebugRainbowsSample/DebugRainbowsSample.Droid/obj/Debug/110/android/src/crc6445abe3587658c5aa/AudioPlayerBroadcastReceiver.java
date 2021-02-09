package crc6445abe3587658c5aa;


public class AudioPlayerBroadcastReceiver
	extends android.content.BroadcastReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onReceive:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnReceive_Landroid_content_Context_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("Uno.Media.Playback.AudioPlayerBroadcastReceiver, Uno", AudioPlayerBroadcastReceiver.class, __md_methods);
	}


	public AudioPlayerBroadcastReceiver ()
	{
		super ();
		if (getClass () == AudioPlayerBroadcastReceiver.class)
			mono.android.TypeManager.Activate ("Uno.Media.Playback.AudioPlayerBroadcastReceiver, Uno", "", this, new java.lang.Object[] {  });
	}

	public AudioPlayerBroadcastReceiver (crc641ee720dfd084de9e.MediaPlayer p0)
	{
		super ();
		if (getClass () == AudioPlayerBroadcastReceiver.class)
			mono.android.TypeManager.Activate ("Uno.Media.Playback.AudioPlayerBroadcastReceiver, Uno", "Windows.Media.Playback.MediaPlayer, Uno", this, new java.lang.Object[] { p0 });
	}


	public void onReceive (android.content.Context p0, android.content.Intent p1)
	{
		n_onReceive (p0, p1);
	}

	private native void n_onReceive (android.content.Context p0, android.content.Intent p1);

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
