package crc64a5a37c43dff01024;


public class NativeListViewBase
	extends Uno.UI.UnoRecyclerView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getOverScrollMode:()I:GetGetOverScrollModeHandler\n" +
			"n_scrollTo:(II)V:GetScrollTo_IIHandler\n" +
			"n_onScrolled:(II)V:GetOnScrolled_IIHandler\n" +
			"n_onScrollStateChanged:(I)V:GetOnScrollStateChanged_IHandler\n" +
			"n_canScrollHorizontally:(I)Z:GetCanScrollHorizontally_IHandler\n" +
			"n_canScrollVertically:(I)Z:GetCanScrollVertically_IHandler\n" +
			"n_attachViewToParent:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V:GetAttachViewToParent_Landroid_view_View_ILandroid_view_ViewGroup_LayoutParams_Handler\n" +
			"n_detachViewFromParent:(I)V:GetDetachViewFromParent_IHandler\n" +
			"n_removeDetachedView:(Landroid/view/View;Z)V:GetRemoveDetachedView_Landroid_view_View_ZHandler\n" +
			"n_fling:(II)Z:GetFling_IIHandler\n" +
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"n_onInitializeAccessibilityNodeInfo:(Landroid/view/accessibility/AccessibilityNodeInfo;)V:GetOnInitializeAccessibilityNodeInfo_Landroid_view_accessibility_AccessibilityNodeInfo_Handler\n" +
			"n_sendAccessibilityEvent:(I)V:GetSendAccessibilityEvent_IHandler\n" +
			"n_toString:()Ljava/lang/String;:GetToStringHandler\n" +
			"n_hashCode:()I:GetGetHashCodeHandler\n" +
			"n_GetBinderDetail:()Lcrc64396ef219c2977f4f/BinderDetails;:__export__\n" +
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.NativeListViewBase, Uno.UI", NativeListViewBase.class, __md_methods);
	}


	public NativeListViewBase (android.content.Context p0)
	{
		super (p0);
		if (getClass () == NativeListViewBase.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.NativeListViewBase, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public crc64396ef219c2977f4f.BinderDetails xamlBinder = GetBinderDetail ();


	public int getOverScrollMode ()
	{
		return n_getOverScrollMode ();
	}

	private native int n_getOverScrollMode ();


	public void scrollTo (int p0, int p1)
	{
		n_scrollTo (p0, p1);
	}

	private native void n_scrollTo (int p0, int p1);


	public void onScrolled (int p0, int p1)
	{
		n_onScrolled (p0, p1);
	}

	private native void n_onScrolled (int p0, int p1);


	public void onScrollStateChanged (int p0)
	{
		n_onScrollStateChanged (p0);
	}

	private native void n_onScrollStateChanged (int p0);


	public boolean canScrollHorizontally (int p0)
	{
		return n_canScrollHorizontally (p0);
	}

	private native boolean n_canScrollHorizontally (int p0);


	public boolean canScrollVertically (int p0)
	{
		return n_canScrollVertically (p0);
	}

	private native boolean n_canScrollVertically (int p0);


	public void attachViewToParent (android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2)
	{
		n_attachViewToParent (p0, p1, p2);
	}

	private native void n_attachViewToParent (android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2);


	public void detachViewFromParent (int p0)
	{
		n_detachViewFromParent (p0);
	}

	private native void n_detachViewFromParent (int p0);


	public void removeDetachedView (android.view.View p0, boolean p1)
	{
		n_removeDetachedView (p0, p1);
	}

	private native void n_removeDetachedView (android.view.View p0, boolean p1);


	public boolean fling (int p0, int p1)
	{
		return n_fling (p0, p1);
	}

	private native boolean n_fling (int p0, int p1);


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);


	public void onInitializeAccessibilityNodeInfo (android.view.accessibility.AccessibilityNodeInfo p0)
	{
		n_onInitializeAccessibilityNodeInfo (p0);
	}

	private native void n_onInitializeAccessibilityNodeInfo (android.view.accessibility.AccessibilityNodeInfo p0);


	public void sendAccessibilityEvent (int p0)
	{
		n_sendAccessibilityEvent (p0);
	}

	private native void n_sendAccessibilityEvent (int p0);


	public java.lang.String toString ()
	{
		return n_toString ();
	}

	private native java.lang.String n_toString ();


	public int hashCode ()
	{
		return n_hashCode ();
	}

	private native int n_hashCode ();

	public crc64396ef219c2977f4f.BinderDetails GetBinderDetail ()
	{
		return n_GetBinderDetail ();
	}

	private native crc64396ef219c2977f4f.BinderDetails n_GetBinderDetail ();


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();


	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();

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
