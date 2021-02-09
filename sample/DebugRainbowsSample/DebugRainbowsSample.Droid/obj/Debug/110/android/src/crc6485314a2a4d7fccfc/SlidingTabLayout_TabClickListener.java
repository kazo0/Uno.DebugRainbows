package crc6485314a2a4d7fccfc;


public class SlidingTabLayout_TabClickListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.SlidingTabLayout+TabClickListener, Uno.UI", SlidingTabLayout_TabClickListener.class, __md_methods);
	}


	public SlidingTabLayout_TabClickListener ()
	{
		super ();
		if (getClass () == SlidingTabLayout_TabClickListener.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.SlidingTabLayout+TabClickListener, Uno.UI", "", this, new java.lang.Object[] {  });
	}

	public SlidingTabLayout_TabClickListener (crc6485314a2a4d7fccfc.SlidingTabLayout p0)
	{
		super ();
		if (getClass () == SlidingTabLayout_TabClickListener.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.SlidingTabLayout+TabClickListener, Uno.UI", "Uno.UI.Controls.SlidingTabLayout, Uno.UI", this, new java.lang.Object[] { p0 });
	}


	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);

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
