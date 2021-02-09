package crc64a2db0dbf8de8c024;


public class AwaitableResultActivity
	extends androidx.fragment.app.FragmentActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onActivityResult:(IILandroid/content/Intent;)V:GetOnActivityResult_IILandroid_content_Intent_Handler\n" +
			"n_onDestroy:()V:GetOnDestroyHandler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"";
		mono.android.Runtime.register ("Uno.Helpers.Activities.AwaitableResultActivity, Uno", AwaitableResultActivity.class, __md_methods);
	}


	public AwaitableResultActivity ()
	{
		super ();
		if (getClass () == AwaitableResultActivity.class)
			mono.android.TypeManager.Activate ("Uno.Helpers.Activities.AwaitableResultActivity, Uno", "", this, new java.lang.Object[] {  });
	}


	public AwaitableResultActivity (int p0)
	{
		super (p0);
		if (getClass () == AwaitableResultActivity.class)
			mono.android.TypeManager.Activate ("Uno.Helpers.Activities.AwaitableResultActivity, Uno", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
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


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();

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
