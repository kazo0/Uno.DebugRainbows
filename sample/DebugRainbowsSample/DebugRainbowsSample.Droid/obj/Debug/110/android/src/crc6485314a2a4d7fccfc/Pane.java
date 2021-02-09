package crc6485314a2a4d7fccfc;


public class Pane
	extends crc64a5a37c43dff01024.Border
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"n_nativeHitCheck:()Z:GetNativeHitCheckHandler\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.Pane, Uno.UI", Pane.class, __md_methods);
	}


	public Pane (android.content.Context p0)
	{
		super (p0);
		if (getClass () == Pane.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.Pane, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);


	public boolean nativeHitCheck ()
	{
		return n_nativeHitCheck ();
	}

	private native boolean n_nativeHitCheck ();

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
