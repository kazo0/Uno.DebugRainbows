package crc646125a61496ffa52c;


public class RealtimeBlurView_PreDrawListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnPreDrawListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPreDraw:()Z:GetOnPreDrawHandler:Android.Views.ViewTreeObserver/IOnPreDrawListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Xaml.Media.RealtimeBlurView+PreDrawListener, Uno.UI", RealtimeBlurView_PreDrawListener.class, __md_methods);
	}


	public RealtimeBlurView_PreDrawListener ()
	{
		super ();
		if (getClass () == RealtimeBlurView_PreDrawListener.class)
			mono.android.TypeManager.Activate ("Uno.UI.Xaml.Media.RealtimeBlurView+PreDrawListener, Uno.UI", "", this, new java.lang.Object[] {  });
	}

	public RealtimeBlurView_PreDrawListener (crc646125a61496ffa52c.RealtimeBlurView p0)
	{
		super ();
		if (getClass () == RealtimeBlurView_PreDrawListener.class)
			mono.android.TypeManager.Activate ("Uno.UI.Xaml.Media.RealtimeBlurView+PreDrawListener, Uno.UI", "Uno.UI.Xaml.Media.RealtimeBlurView, Uno.UI", this, new java.lang.Object[] { p0 });
	}


	public boolean onPreDraw ()
	{
		return n_onPreDraw ();
	}

	private native boolean n_onPreDraw ();

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
