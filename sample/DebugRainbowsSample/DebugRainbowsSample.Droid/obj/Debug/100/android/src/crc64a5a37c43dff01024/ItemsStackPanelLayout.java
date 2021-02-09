package crc64a5a37c43dff01024;


public class ItemsStackPanelLayout
	extends crc64a5a37c43dff01024.VirtualizingPanelLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.ItemsStackPanelLayout, Uno.UI", ItemsStackPanelLayout.class, __md_methods);
	}


	public ItemsStackPanelLayout ()
	{
		super ();
		if (getClass () == ItemsStackPanelLayout.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.ItemsStackPanelLayout, Uno.UI", "", this, new java.lang.Object[] {  });
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
