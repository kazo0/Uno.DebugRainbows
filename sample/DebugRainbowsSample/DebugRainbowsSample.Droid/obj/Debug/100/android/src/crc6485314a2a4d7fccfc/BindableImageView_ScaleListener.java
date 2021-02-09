package crc6485314a2a4d7fccfc;


public class BindableImageView_ScaleListener
	extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onScaleBegin:(Landroid/view/ScaleGestureDetector;)Z:GetOnScaleBegin_Landroid_view_ScaleGestureDetector_Handler\n" +
			"n_onScale:(Landroid/view/ScaleGestureDetector;)Z:GetOnScale_Landroid_view_ScaleGestureDetector_Handler\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.BindableImageView+ScaleListener, Uno.UI", BindableImageView_ScaleListener.class, __md_methods);
	}


	public BindableImageView_ScaleListener ()
	{
		super ();
		if (getClass () == BindableImageView_ScaleListener.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableImageView+ScaleListener, Uno.UI", "", this, new java.lang.Object[] {  });
	}

	public BindableImageView_ScaleListener (crc6485314a2a4d7fccfc.BindableImageView p0)
	{
		super ();
		if (getClass () == BindableImageView_ScaleListener.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableImageView+ScaleListener, Uno.UI", "Uno.UI.Controls.BindableImageView, Uno.UI", this, new java.lang.Object[] { p0 });
	}


	public boolean onScaleBegin (android.view.ScaleGestureDetector p0)
	{
		return n_onScaleBegin (p0);
	}

	private native boolean n_onScaleBegin (android.view.ScaleGestureDetector p0);


	public boolean onScale (android.view.ScaleGestureDetector p0)
	{
		return n_onScale (p0);
	}

	private native boolean n_onScale (android.view.ScaleGestureDetector p0);

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
