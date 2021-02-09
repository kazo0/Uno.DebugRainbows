package crc64122dcf5ad656876d;


public class UIElement_TouchReRouter
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnTouchListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTouch:(Landroid/view/View;Landroid/view/MotionEvent;)Z:GetOnTouch_Landroid_view_View_Landroid_view_MotionEvent_Handler:Android.Views.View/IOnTouchListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.UIElement+TouchReRouter, Uno.UI", UIElement_TouchReRouter.class, __md_methods);
	}


	public UIElement_TouchReRouter ()
	{
		super ();
		if (getClass () == UIElement_TouchReRouter.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.UIElement+TouchReRouter, Uno.UI", "", this, new java.lang.Object[] {  });
	}

	public UIElement_TouchReRouter (crc64122dcf5ad656876d.UIElement p0)
	{
		super ();
		if (getClass () == UIElement_TouchReRouter.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.UIElement+TouchReRouter, Uno.UI", "Windows.UI.Xaml.UIElement, Uno.UI", this, new java.lang.Object[] { p0 });
	}


	public boolean onTouch (android.view.View p0, android.view.MotionEvent p1)
	{
		return n_onTouch (p0, p1);
	}

	private native boolean n_onTouch (android.view.View p0, android.view.MotionEvent p1);

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
