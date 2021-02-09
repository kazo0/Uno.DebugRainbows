package crc64122dcf5ad656876d;


public class UIElement
	extends crc6485314a2a4d7fccfc.BindableView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_SetDependencyPropertyValue:(Ljava/lang/String;)Ljava/lang/String;:__export__\n" +
			"n_GetDependencyPropertyValue:(Ljava/lang/String;)Ljava/lang/Object;:__export__\n" +
			"n_onNativeMotionEvent:(Landroid/view/MotionEvent;Landroid/view/View;Z)Z:GetOnNativeMotionEvent_Landroid_view_MotionEvent_Landroid_view_View_ZHandler\n" +
			"n_nativeHitCheck:()Z:GetNativeHitCheckHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.UIElement, Uno.UI", UIElement.class, __md_methods);
	}


	public UIElement (android.content.Context p0)
	{
		super (p0);
		if (getClass () == UIElement.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.UIElement, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public java.lang.String SetDependencyPropertyValue (java.lang.String p0)
	{
		return n_SetDependencyPropertyValue (p0);
	}

	private native java.lang.String n_SetDependencyPropertyValue (java.lang.String p0);


	public java.lang.Object GetDependencyPropertyValue (java.lang.String p0)
	{
		return n_GetDependencyPropertyValue (p0);
	}

	private native java.lang.Object n_GetDependencyPropertyValue (java.lang.String p0);


	public boolean onNativeMotionEvent (android.view.MotionEvent p0, android.view.View p1, boolean p2)
	{
		return n_onNativeMotionEvent (p0, p1, p2);
	}

	private native boolean n_onNativeMotionEvent (android.view.MotionEvent p0, android.view.View p1, boolean p2);


	public boolean nativeHitCheck ()
	{
		return n_nativeHitCheck ();
	}

	private native boolean n_nativeHitCheck ();

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
