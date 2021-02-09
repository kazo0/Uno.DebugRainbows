package crc6485314a2a4d7fccfc;


public class ManagedItemsStackPanel
	extends crc64a5a37c43dff01024.Panel
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_nativeRequestLayout:()Z:GetNativeRequestLayoutHandler\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.ManagedItemsStackPanel, Uno.UI", ManagedItemsStackPanel.class, __md_methods);
	}


	public ManagedItemsStackPanel (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ManagedItemsStackPanel.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.ManagedItemsStackPanel, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public boolean nativeRequestLayout ()
	{
		return n_nativeRequestLayout ();
	}

	private native boolean n_nativeRequestLayout ();

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
