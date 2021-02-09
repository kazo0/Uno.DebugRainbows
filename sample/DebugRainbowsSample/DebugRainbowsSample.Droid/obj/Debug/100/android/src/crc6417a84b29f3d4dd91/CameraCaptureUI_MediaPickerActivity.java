package crc6417a84b29f3d4dd91;


public class CameraCaptureUI_MediaPickerActivity
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
		mono.android.Runtime.register ("Windows.Media.Capture.CameraCaptureUI+MediaPickerActivity, Uno", CameraCaptureUI_MediaPickerActivity.class, __md_methods);
	}


	public CameraCaptureUI_MediaPickerActivity ()
	{
		super ();
		if (getClass () == CameraCaptureUI_MediaPickerActivity.class)
			mono.android.TypeManager.Activate ("Windows.Media.Capture.CameraCaptureUI+MediaPickerActivity, Uno", "", this, new java.lang.Object[] {  });
	}


	public CameraCaptureUI_MediaPickerActivity (int p0)
	{
		super (p0);
		if (getClass () == CameraCaptureUI_MediaPickerActivity.class)
			mono.android.TypeManager.Activate ("Windows.Media.Capture.CameraCaptureUI+MediaPickerActivity, Uno", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
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
