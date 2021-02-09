package crc6485314a2a4d7fccfc;


public class BindableView
	extends Uno.UI.UnoViewGroup
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLayoutCore:(ZIIII)V:GetOnLayoutCore_ZIIIIHandler\n" +
			"n_onLocalViewAdded:(Landroid/view/View;I)V:GetOnLocalViewAdded_Landroid_view_View_IHandler\n" +
			"n_onLocalViewRemoved:(Landroid/view/View;)V:GetOnLocalViewRemoved_Landroid_view_View_Handler\n" +
			"n_nativeHitCheck:()Z:GetNativeHitCheckHandler\n" +
			"n_nativeRequestLayout:()Z:GetNativeRequestLayoutHandler\n" +
			"n_onRemovedFromParent:()V:GetOnRemovedFromParentHandler\n" +
			"n_getElevation:()F:GetGetElevationHandler\n" +
			"n_setElevation:(F)V:GetSetElevation_FHandler\n" +
			"n_toString:()Ljava/lang/String;:GetToStringHandler\n" +
			"n_hashCode:()I:GetGetHashCodeHandler\n" +
			"n_GetBinderDetail:()Lcrc64396ef219c2977f4f/BinderDetails;:__export__\n" +
			"n_onNativeLoaded:()V:GetOnNativeLoadedHandler\n" +
			"n_onNativeUnloaded:()V:GetOnNativeUnloadedHandler\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.BindableView, Uno.UI", BindableView.class, __md_methods);
	}


	public BindableView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == BindableView.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableView, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public crc64396ef219c2977f4f.BinderDetails xamlBinder = GetBinderDetail ();


	public void onLayoutCore (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayoutCore (p0, p1, p2, p3, p4);
	}

	private native void n_onLayoutCore (boolean p0, int p1, int p2, int p3, int p4);


	public void onLocalViewAdded (android.view.View p0, int p1)
	{
		n_onLocalViewAdded (p0, p1);
	}

	private native void n_onLocalViewAdded (android.view.View p0, int p1);


	public void onLocalViewRemoved (android.view.View p0)
	{
		n_onLocalViewRemoved (p0);
	}

	private native void n_onLocalViewRemoved (android.view.View p0);


	public boolean nativeHitCheck ()
	{
		return n_nativeHitCheck ();
	}

	private native boolean n_nativeHitCheck ();


	public boolean nativeRequestLayout ()
	{
		return n_nativeRequestLayout ();
	}

	private native boolean n_nativeRequestLayout ();


	public void onRemovedFromParent ()
	{
		n_onRemovedFromParent ();
	}

	private native void n_onRemovedFromParent ();


	public float getElevation ()
	{
		return n_getElevation ();
	}

	private native float n_getElevation ();


	public void setElevation (float p0)
	{
		n_setElevation (p0);
	}

	private native void n_setElevation (float p0);


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


	public void onNativeLoaded ()
	{
		n_onNativeLoaded ();
	}

	private native void n_onNativeLoaded ();


	public void onNativeUnloaded ()
	{
		n_onNativeUnloaded ();
	}

	private native void n_onNativeUnloaded ();

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
