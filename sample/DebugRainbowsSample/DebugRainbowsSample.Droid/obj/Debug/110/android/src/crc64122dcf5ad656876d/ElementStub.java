package crc64122dcf5ad656876d;


public class ElementStub
	extends crc64122dcf5ad656876d.FrameworkElement
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.ElementStub, Uno.UI", ElementStub.class, __md_methods);
	}


	public ElementStub (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ElementStub.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.ElementStub, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
