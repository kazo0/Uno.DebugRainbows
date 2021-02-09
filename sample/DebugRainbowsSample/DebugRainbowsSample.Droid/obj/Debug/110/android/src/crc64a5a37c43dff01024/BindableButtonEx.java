package crc64a5a37c43dff01024;


public class BindableButtonEx
	extends crc6485314a2a4d7fccfc.BindableButton
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.BindableButtonEx, Uno.UI", BindableButtonEx.class, __md_methods);
	}


	public BindableButtonEx (android.content.Context p0)
	{
		super (p0);
		if (getClass () == BindableButtonEx.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.BindableButtonEx, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public BindableButtonEx (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == BindableButtonEx.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.BindableButtonEx, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public BindableButtonEx (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == BindableButtonEx.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.BindableButtonEx, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
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
