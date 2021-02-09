package crc6485314a2a4d7fccfc;


public class NativeCommandBarPresenter
	extends crc64a5a37c43dff01024.ContentPresenter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.NativeCommandBarPresenter, Uno.UI", NativeCommandBarPresenter.class, __md_methods);
	}


	public NativeCommandBarPresenter (android.content.Context p0)
	{
		super (p0);
		if (getClass () == NativeCommandBarPresenter.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.NativeCommandBarPresenter, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
