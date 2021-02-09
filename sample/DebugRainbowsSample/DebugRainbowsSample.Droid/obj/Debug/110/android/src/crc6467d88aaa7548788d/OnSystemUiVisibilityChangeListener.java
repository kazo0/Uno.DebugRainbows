package crc6467d88aaa7548788d;


public class OnSystemUiVisibilityChangeListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnSystemUiVisibilityChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSystemUiVisibilityChange:(I)V:GetOnSystemUiVisibilityChange_IHandler:Android.Views.View/IOnSystemUiVisibilityChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.OnSystemUiVisibilityChangeListener, Uno.UI", OnSystemUiVisibilityChangeListener.class, __md_methods);
	}


	public OnSystemUiVisibilityChangeListener ()
	{
		super ();
		if (getClass () == OnSystemUiVisibilityChangeListener.class)
			mono.android.TypeManager.Activate ("Uno.UI.OnSystemUiVisibilityChangeListener, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public void onSystemUiVisibilityChange (int p0)
	{
		n_onSystemUiVisibilityChange (p0);
	}

	private native void n_onSystemUiVisibilityChange (int p0);

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
