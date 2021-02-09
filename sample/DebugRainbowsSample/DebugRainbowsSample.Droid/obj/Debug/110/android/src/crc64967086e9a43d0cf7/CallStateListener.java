package crc64967086e9a43d0cf7;


public class CallStateListener
	extends android.telephony.PhoneStateListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCallStateChanged:(ILjava/lang/String;)V:GetOnCallStateChanged_ILjava_lang_String_Handler\n" +
			"";
		mono.android.Runtime.register ("Windows.ApplicationModel.Calls.CallStateListener, Uno", CallStateListener.class, __md_methods);
	}


	public CallStateListener ()
	{
		super ();
		if (getClass () == CallStateListener.class)
			mono.android.TypeManager.Activate ("Windows.ApplicationModel.Calls.CallStateListener, Uno", "", this, new java.lang.Object[] {  });
	}


	public CallStateListener (java.util.concurrent.Executor p0)
	{
		super (p0);
		if (getClass () == CallStateListener.class)
			mono.android.TypeManager.Activate ("Windows.ApplicationModel.Calls.CallStateListener, Uno", "Java.Util.Concurrent.IExecutor, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void onCallStateChanged (int p0, java.lang.String p1)
	{
		n_onCallStateChanged (p0, p1);
	}

	private native void n_onCallStateChanged (int p0, java.lang.String p1);

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
