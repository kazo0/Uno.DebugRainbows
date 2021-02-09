package crc6485314a2a4d7fccfc;


public class BindableGridView
	extends android.widget.GridView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_removeDetachedView:(Landroid/view/View;Z)V:GetRemoveDetachedView_Landroid_view_View_ZHandler\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.BindableGridView, Uno.UI", BindableGridView.class, __md_methods);
	}


	public BindableGridView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == BindableGridView.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableGridView, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public BindableGridView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == BindableGridView.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableGridView, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public BindableGridView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == BindableGridView.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableGridView, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public BindableGridView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == BindableGridView.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableGridView, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void removeDetachedView (android.view.View p0, boolean p1)
	{
		n_removeDetachedView (p0, p1);
	}

	private native void n_removeDetachedView (android.view.View p0, boolean p1);

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
