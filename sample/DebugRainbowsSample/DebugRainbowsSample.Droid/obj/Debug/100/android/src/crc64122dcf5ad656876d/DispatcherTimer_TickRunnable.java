package crc64122dcf5ad656876d;


public class DispatcherTimer_TickRunnable
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		java.lang.Runnable
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_run:()V:GetRunHandler:Java.Lang.IRunnableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.DispatcherTimer+TickRunnable, Uno.UI", DispatcherTimer_TickRunnable.class, __md_methods);
	}


	public DispatcherTimer_TickRunnable ()
	{
		super ();
		if (getClass () == DispatcherTimer_TickRunnable.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.DispatcherTimer+TickRunnable, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public void run ()
	{
		n_run ();
	}

	private native void n_run ();

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
