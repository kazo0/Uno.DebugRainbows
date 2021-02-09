package crc6485314a2a4d7fccfc;


public class SlidingTabLayout_InternalViewPagerListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.viewpager.widget.ViewPager.OnPageChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPageScrollStateChanged:(I)V:GetOnPageScrollStateChanged_IHandler:AndroidX.ViewPager.Widget.ViewPager/IOnPageChangeListenerInvoker, Xamarin.AndroidX.ViewPager\n" +
			"n_onPageScrolled:(IFI)V:GetOnPageScrolled_IFIHandler:AndroidX.ViewPager.Widget.ViewPager/IOnPageChangeListenerInvoker, Xamarin.AndroidX.ViewPager\n" +
			"n_onPageSelected:(I)V:GetOnPageSelected_IHandler:AndroidX.ViewPager.Widget.ViewPager/IOnPageChangeListenerInvoker, Xamarin.AndroidX.ViewPager\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.SlidingTabLayout+InternalViewPagerListener, Uno.UI", SlidingTabLayout_InternalViewPagerListener.class, __md_methods);
	}


	public SlidingTabLayout_InternalViewPagerListener ()
	{
		super ();
		if (getClass () == SlidingTabLayout_InternalViewPagerListener.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.SlidingTabLayout+InternalViewPagerListener, Uno.UI", "", this, new java.lang.Object[] {  });
	}

	public SlidingTabLayout_InternalViewPagerListener (crc6485314a2a4d7fccfc.SlidingTabLayout p0)
	{
		super ();
		if (getClass () == SlidingTabLayout_InternalViewPagerListener.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.SlidingTabLayout+InternalViewPagerListener, Uno.UI", "Uno.UI.Controls.SlidingTabLayout, Uno.UI", this, new java.lang.Object[] { p0 });
	}


	public void onPageScrollStateChanged (int p0)
	{
		n_onPageScrollStateChanged (p0);
	}

	private native void n_onPageScrollStateChanged (int p0);


	public void onPageScrolled (int p0, float p1, int p2)
	{
		n_onPageScrolled (p0, p1, p2);
	}

	private native void n_onPageScrolled (int p0, float p1, int p2);


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
