package crc64a5a37c43dff01024;


public class Canvas
	extends crc64a5a37c43dff01024.Panel
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getChildDrawingOrder:(II)I:GetGetChildDrawingOrder_IIHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.Canvas, Uno.UI", Canvas.class, __md_methods);
	}


	public Canvas (android.content.Context p0)
	{
		super (p0);
		if (getClass () == Canvas.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.Canvas, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public int getChildDrawingOrder (int p0, int p1)
	{
		return n_getChildDrawingOrder (p0, p1);
	}

	private native int n_getChildDrawingOrder (int p0, int p1);

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
