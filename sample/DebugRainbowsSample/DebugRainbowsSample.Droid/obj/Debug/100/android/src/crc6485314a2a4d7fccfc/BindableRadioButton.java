package crc6485314a2a4d7fccfc;


public class BindableRadioButton
	extends androidx.appcompat.widget.AppCompatRadioButton
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_isEnabled:()Z:GetIsEnabledHandler\n" +
			"n_setEnabled:(Z)V:GetSetEnabled_ZHandler\n" +
			"n_isChecked:()Z:GetIsCheckedHandler\n" +
			"n_setChecked:(Z)V:GetSetChecked_ZHandler\n" +
			"n_toString:()Ljava/lang/String;:GetToStringHandler\n" +
			"n_hashCode:()I:GetGetHashCodeHandler\n" +
			"n_GetBinderDetail:()Lcrc64396ef219c2977f4f/BinderDetails;:__export__\n" +
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.BindableRadioButton, Uno.UI", BindableRadioButton.class, __md_methods);
	}


	public BindableRadioButton (android.content.Context p0)
	{
		super (p0);
		if (getClass () == BindableRadioButton.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableRadioButton, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public BindableRadioButton (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == BindableRadioButton.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableRadioButton, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public BindableRadioButton (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == BindableRadioButton.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableRadioButton, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public crc64396ef219c2977f4f.BinderDetails xamlBinder = GetBinderDetail ();


	public boolean isEnabled ()
	{
		return n_isEnabled ();
	}

	private native boolean n_isEnabled ();


	public void setEnabled (boolean p0)
	{
		n_setEnabled (p0);
	}

	private native void n_setEnabled (boolean p0);


	public boolean isChecked ()
	{
		return n_isChecked ();
	}

	private native boolean n_isChecked ();


	public void setChecked (boolean p0)
	{
		n_setChecked (p0);
	}

	private native void n_setChecked (boolean p0);


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
