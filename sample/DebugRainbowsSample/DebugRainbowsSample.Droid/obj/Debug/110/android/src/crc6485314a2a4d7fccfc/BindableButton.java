package crc6485314a2a4d7fccfc;


public class BindableButton
	extends androidx.appcompat.widget.AppCompatButton
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"n_toString:()Ljava/lang/String;:GetToStringHandler\n" +
			"n_hashCode:()I:GetGetHashCodeHandler\n" +
			"n_GetBinderDetail:()Lcrc64396ef219c2977f4f/BinderDetails;:__export__\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.BindableButton, Uno.UI", BindableButton.class, __md_methods);
	}


	public BindableButton (android.content.Context p0)
	{
		super (p0);
		if (getClass () == BindableButton.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableButton, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public BindableButton (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == BindableButton.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableButton, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public BindableButton (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == BindableButton.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableButton, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public crc64396ef219c2977f4f.BinderDetails xamlBinder = GetBinderDetail ();


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
