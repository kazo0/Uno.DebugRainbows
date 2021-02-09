package crc64a5a37c43dff01024;


public class NativePopup
	extends crc64a5a37c43dff01024.PopupBase
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.NativePopup, Uno.UI", NativePopup.class, __md_methods);
	}


	public NativePopup (android.content.Context p0)
	{
		super (p0);
		if (getClass () == NativePopup.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.NativePopup, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
