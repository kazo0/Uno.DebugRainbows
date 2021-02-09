package crc642579205336516b81;


public class ListViewHeader
	extends crc64a5a37c43dff01024.ContentControl
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.Legacy.ListViewHeader, Uno.UI", ListViewHeader.class, __md_methods);
	}


	public ListViewHeader (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ListViewHeader.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.Legacy.ListViewHeader, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
