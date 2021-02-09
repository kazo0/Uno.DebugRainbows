package crc6403df272061807d76;


public class CompositionTarget_FrameCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.Choreographer.FrameCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_doFrame:(J)V:GetDoFrame_JHandler:Android.Views.Choreographer/IFrameCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Media.CompositionTarget+FrameCallback, Uno.UI", CompositionTarget_FrameCallback.class, __md_methods);
	}


	public CompositionTarget_FrameCallback ()
	{
		super ();
		if (getClass () == CompositionTarget_FrameCallback.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Media.CompositionTarget+FrameCallback, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public void doFrame (long p0)
	{
		n_doFrame (p0);
	}

	private native void n_doFrame (long p0);

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
