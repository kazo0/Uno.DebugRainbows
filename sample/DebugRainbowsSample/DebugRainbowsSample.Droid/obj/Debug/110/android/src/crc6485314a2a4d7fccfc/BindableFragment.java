package crc6485314a2a4d7fccfc;


public class BindableFragment
	extends androidx.fragment.app.Fragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_toString:()Ljava/lang/String;:GetToStringHandler\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.BindableFragment, Uno.UI", BindableFragment.class, __md_methods);
	}


	public BindableFragment ()
	{
		super ();
		if (getClass () == BindableFragment.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableFragment, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public BindableFragment (int p0)
	{
		super (p0);
		if (getClass () == BindableFragment.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableFragment, Uno.UI", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}

	public BindableFragment (android.app.Activity p0, android.util.AttributeSet p1)
	{
		super ();
		if (getClass () == BindableFragment.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.BindableFragment, Uno.UI", "Android.App.Activity, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public java.lang.String toString ()
	{
		return n_toString ();
	}

	private native java.lang.String n_toString ();

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
