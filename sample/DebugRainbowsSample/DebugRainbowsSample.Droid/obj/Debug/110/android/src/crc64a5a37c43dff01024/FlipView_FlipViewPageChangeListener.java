package crc64a5a37c43dff01024;


public class FlipView_FlipViewPageChangeListener
	extends androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPageSelected:(I)V:GetOnPageSelected_IHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.FlipView+FlipViewPageChangeListener, Uno.UI", FlipView_FlipViewPageChangeListener.class, __md_methods);
	}


	public FlipView_FlipViewPageChangeListener ()
	{
		super ();
		if (getClass () == FlipView_FlipViewPageChangeListener.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.FlipView+FlipViewPageChangeListener, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public void onPageSelected (int p0)
	{
		n_onPageSelected (p0);
	}

	private native void n_onPageSelected (int p0);

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
