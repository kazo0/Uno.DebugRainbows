package crc6467d88aaa7548788d;


public class DelegateActivity
	extends crc6467d88aaa7548788d.BaseActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onActivityResult:(IILandroid/content/Intent;)V:GetOnActivityResult_IILandroid_content_Intent_Handler\n" +
			"n_onDestroy:()V:GetOnDestroyHandler\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.DelegateActivity, Uno.UI", DelegateActivity.class, __md_methods);
	}


	public DelegateActivity ()
	{
		super ();
		if (getClass () == DelegateActivity.class)
			mono.android.TypeManager.Activate ("Uno.UI.DelegateActivity, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public DelegateActivity (int p0)
	{
		super (p0);
		if (getClass () == DelegateActivity.class)
			mono.android.TypeManager.Activate ("Uno.UI.DelegateActivity, Uno.UI", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public void onActivityResult (int p0, int p1, android.content.Intent p2)
	{
		n_onActivityResult (p0, p1, p2);
	}

	private native void n_onActivityResult (int p0, int p1, android.content.Intent p2);


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
