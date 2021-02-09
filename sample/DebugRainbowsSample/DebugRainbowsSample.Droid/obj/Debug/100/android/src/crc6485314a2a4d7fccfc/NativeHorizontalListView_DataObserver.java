package crc6485314a2a4d7fccfc;


public class NativeHorizontalListView_DataObserver
	extends android.database.DataSetObserver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onChanged:()V:GetOnChangedHandler\n" +
			"n_onInvalidated:()V:GetOnInvalidatedHandler\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.NativeHorizontalListView+DataObserver, Uno.UI", NativeHorizontalListView_DataObserver.class, __md_methods);
	}


	public NativeHorizontalListView_DataObserver ()
	{
		super ();
		if (getClass () == NativeHorizontalListView_DataObserver.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.NativeHorizontalListView+DataObserver, Uno.UI", "", this, new java.lang.Object[] {  });
	}

	public NativeHorizontalListView_DataObserver (crc6485314a2a4d7fccfc.NativeHorizontalListView p0)
	{
		super ();
		if (getClass () == NativeHorizontalListView_DataObserver.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.NativeHorizontalListView+DataObserver, Uno.UI", "Uno.UI.Controls.NativeHorizontalListView, Uno.UI", this, new java.lang.Object[] { p0 });
	}


	public void onChanged ()
	{
		n_onChanged ();
	}

	private native void n_onChanged ();


	public void onInvalidated ()
	{
		n_onInvalidated ();
	}

	private native void n_onInvalidated ();

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
