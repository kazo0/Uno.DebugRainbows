package crc6485314a2a4d7fccfc;


public class AbsListViewSecondaryPool
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.AbsListView.RecyclerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMovedToScrapHeap:(Landroid/view/View;)V:GetOnMovedToScrapHeap_Landroid_view_View_Handler:Android.Widget.AbsListView/IRecyclerListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.AbsListViewSecondaryPool, Uno.UI", AbsListViewSecondaryPool.class, __md_methods);
	}


	public AbsListViewSecondaryPool ()
	{
		super ();
		if (getClass () == AbsListViewSecondaryPool.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.AbsListViewSecondaryPool, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public void onMovedToScrapHeap (android.view.View p0)
	{
		n_onMovedToScrapHeap (p0);
	}

	private native void n_onMovedToScrapHeap (android.view.View p0);

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
