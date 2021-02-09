package crc64122dcf5ad656876d;


public class DragRoot
	extends crc64a5a37c43dff01024.Canvas
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.DragRoot, Uno.UI", DragRoot.class, __md_methods);
	}


	public DragRoot (android.content.Context p0)
	{
		super (p0);
		if (getClass () == DragRoot.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.DragRoot, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
