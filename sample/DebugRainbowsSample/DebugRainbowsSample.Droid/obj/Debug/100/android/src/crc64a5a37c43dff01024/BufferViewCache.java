package crc64a5a37c43dff01024;


public class BufferViewCache
	extends androidx.recyclerview.widget.RecyclerView.ViewCacheExtension
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getViewForPositionAndType:(Landroidx/recyclerview/widget/RecyclerView$Recycler;II)Landroid/view/View;:GetGetViewForPositionAndType_Landroidx_recyclerview_widget_RecyclerView_Recycler_IIHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.BufferViewCache, Uno.UI", BufferViewCache.class, __md_methods);
	}


	public BufferViewCache ()
	{
		super ();
		if (getClass () == BufferViewCache.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.BufferViewCache, Uno.UI", "", this, new java.lang.Object[] {  });
	}

	public BufferViewCache (crc64a5a37c43dff01024.NativeListViewBase p0)
	{
		super ();
		if (getClass () == BufferViewCache.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.BufferViewCache, Uno.UI", "Windows.UI.Xaml.Controls.NativeListViewBase, Uno.UI", this, new java.lang.Object[] { p0 });
	}


	public android.view.View getViewForPositionAndType (androidx.recyclerview.widget.RecyclerView.Recycler p0, int p1, int p2)
	{
		return n_getViewForPositionAndType (p0, p1, p2);
	}

	private native android.view.View n_getViewForPositionAndType (androidx.recyclerview.widget.RecyclerView.Recycler p0, int p1, int p2);

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
