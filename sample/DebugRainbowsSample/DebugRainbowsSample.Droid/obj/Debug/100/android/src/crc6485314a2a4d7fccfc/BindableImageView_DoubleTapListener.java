package crc6485314a2a4d7fccfc;


public class BindableImageView_DoubleTapListener
	extends android.view.GestureDetector.SimpleOnGestureListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDoubleTap:(Landroid/view/MotionEvent;)Z:GetOnDoubleTap_Landroid_view_MotionEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.BindableImageView+DoubleTapListener, Uno.UI", BindableImageView_DoubleTapListener.class, __md_methods);
	}


	public BindableImageView_DoubleTapListener ()
	{
		super ();
		if (getClass () == BindableImageView_DoubleTapListener.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableImageView+DoubleTapListener, Uno.UI", "", this, new java.lang.Object[] {  });
	}

	public BindableImageView_DoubleTapListener (crc6485314a2a4d7fccfc.BindableImageView p0)
	{
		super ();
		if (getClass () == BindableImageView_DoubleTapListener.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableImageView+DoubleTapListener, Uno.UI", "Uno.UI.Controls.BindableImageView, Uno.UI", this, new java.lang.Object[] { p0 });
	}


	public boolean onDoubleTap (android.view.MotionEvent p0)
	{
		return n_onDoubleTap (p0);
	}

	private native boolean n_onDoubleTap (android.view.MotionEvent p0);

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
