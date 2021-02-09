package crc6403d1368c1194c09d;


public class ElevatedView
	extends crc64a5a37c43dff01024.Control
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Uno.UI.Toolkit.ElevatedView, Uno.UI.Toolkit", ElevatedView.class, __md_methods);
	}


	public ElevatedView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ElevatedView.class)
			mono.android.TypeManager.Activate ("Uno.UI.Toolkit.ElevatedView, Uno.UI.Toolkit", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}

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
