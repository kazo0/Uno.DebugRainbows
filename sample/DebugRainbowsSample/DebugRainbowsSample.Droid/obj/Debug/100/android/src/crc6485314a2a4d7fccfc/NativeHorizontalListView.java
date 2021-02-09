package crc6485314a2a4d7fccfc;


public class NativeHorizontalListView
	extends android.widget.AdapterView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getSelectedView:()Landroid/view/View;:GetGetSelectedViewHandler\n" +
			"n_getAdapter:()Landroid/widget/Adapter;:GetGetAdapterHandler\n" +
			"n_setAdapter:(Landroid/widget/Adapter;)V:GetSetAdapter_Landroid_widget_Adapter_Handler\n" +
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"n_setSelection:(I)V:GetSetSelection_IHandler\n" +
			"n_dispatchTouchEvent:(Landroid/view/MotionEvent;)Z:GetDispatchTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.NativeHorizontalListView, Uno.UI", NativeHorizontalListView.class, __md_methods);
	}


	public NativeHorizontalListView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == NativeHorizontalListView.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.NativeHorizontalListView, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public NativeHorizontalListView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == NativeHorizontalListView.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.NativeHorizontalListView, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public NativeHorizontalListView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == NativeHorizontalListView.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.NativeHorizontalListView, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public android.view.View getSelectedView ()
	{
		return n_getSelectedView ();
	}

	private native android.view.View n_getSelectedView ();


	public android.widget.Adapter getAdapter ()
	{
		return n_getAdapter ();
	}

	private native android.widget.Adapter n_getAdapter ();


	public void setAdapter (android.widget.Adapter p0)
	{
		n_setAdapter (p0);
	}

	private native void n_setAdapter (android.widget.Adapter p0);


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);


	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);


	public void setSelection (int p0)
	{
		n_setSelection (p0);
	}

	private native void n_setSelection (int p0);


	public boolean dispatchTouchEvent (android.view.MotionEvent p0)
	{
		return n_dispatchTouchEvent (p0);
	}

	private native boolean n_dispatchTouchEvent (android.view.MotionEvent p0);


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);

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
