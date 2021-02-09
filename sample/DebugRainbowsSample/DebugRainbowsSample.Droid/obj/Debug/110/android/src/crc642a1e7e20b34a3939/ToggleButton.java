package crc642a1e7e20b34a3939;


public class ToggleButton
	extends crc642a1e7e20b34a3939.ButtonBase
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.Primitives.ToggleButton, Uno.UI", ToggleButton.class, __md_methods);
	}


	public ToggleButton (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ToggleButton.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.Primitives.ToggleButton, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
