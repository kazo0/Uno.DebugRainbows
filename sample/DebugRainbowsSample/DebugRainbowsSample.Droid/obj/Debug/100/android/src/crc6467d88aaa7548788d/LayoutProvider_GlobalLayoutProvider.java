package crc6467d88aaa7548788d;


public class LayoutProvider_GlobalLayoutProvider
	extends android.widget.PopupWindow
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnGlobalLayoutListener,
		android.view.View.OnApplyWindowInsetsListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGlobalLayout:()V:GetOnGlobalLayoutHandler:Android.Views.ViewTreeObserver/IOnGlobalLayoutListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onApplyWindowInsets:(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;:GetOnApplyWindowInsets_Landroid_view_View_Landroid_view_WindowInsets_Handler:Android.Views.View/IOnApplyWindowInsetsListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.LayoutProvider+GlobalLayoutProvider, Uno.UI", LayoutProvider_GlobalLayoutProvider.class, __md_methods);
	}


	public LayoutProvider_GlobalLayoutProvider ()
	{
		super ();
		if (getClass () == LayoutProvider_GlobalLayoutProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.LayoutProvider+GlobalLayoutProvider, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public LayoutProvider_GlobalLayoutProvider (android.content.Context p0)
	{
		super (p0);
		if (getClass () == LayoutProvider_GlobalLayoutProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.LayoutProvider+GlobalLayoutProvider, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public LayoutProvider_GlobalLayoutProvider (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == LayoutProvider_GlobalLayoutProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.LayoutProvider+GlobalLayoutProvider, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public LayoutProvider_GlobalLayoutProvider (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == LayoutProvider_GlobalLayoutProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.LayoutProvider+GlobalLayoutProvider, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public LayoutProvider_GlobalLayoutProvider (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == LayoutProvider_GlobalLayoutProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.LayoutProvider+GlobalLayoutProvider, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public LayoutProvider_GlobalLayoutProvider (android.view.View p0)
	{
		super (p0);
		if (getClass () == LayoutProvider_GlobalLayoutProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.LayoutProvider+GlobalLayoutProvider, Uno.UI", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public LayoutProvider_GlobalLayoutProvider (android.view.View p0, int p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == LayoutProvider_GlobalLayoutProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.LayoutProvider+GlobalLayoutProvider, Uno.UI", "Android.Views.View, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public LayoutProvider_GlobalLayoutProvider (android.view.View p0, int p1, int p2, boolean p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == LayoutProvider_GlobalLayoutProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.LayoutProvider+GlobalLayoutProvider, Uno.UI", "Android.Views.View, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public LayoutProvider_GlobalLayoutProvider (int p0, int p1)
	{
		super (p0, p1);
		if (getClass () == LayoutProvider_GlobalLayoutProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.LayoutProvider+GlobalLayoutProvider, Uno.UI", "System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1 });
	}


	public void onGlobalLayout ()
	{
		n_onGlobalLayout ();
	}

	private native void n_onGlobalLayout ();


	public android.view.WindowInsets onApplyWindowInsets (android.view.View p0, android.view.WindowInsets p1)
	{
		return n_onApplyWindowInsets (p0, p1);
	}

	private native android.view.WindowInsets n_onApplyWindowInsets (android.view.View p0, android.view.WindowInsets p1);

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
