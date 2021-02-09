package crc64a5a37c43dff01024;


public abstract class NativePage
	extends crc6467d88aaa7548788d.BaseActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onDestroy:()V:GetOnDestroyHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.NativePage, Uno.UI", NativePage.class, __md_methods);
	}


	public NativePage ()
	{
		super ();
		if (getClass () == NativePage.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.NativePage, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public NativePage (int p0)
	{
		super (p0);
		if (getClass () == NativePage.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.NativePage, Uno.UI", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onDestroy ()
	{
		n_onDestroy ();
	}

	private native void n_onDestroy ();

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
