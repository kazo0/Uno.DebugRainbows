package crc64a5a37c43dff01024;


public class InputFilterAllLower
	extends android.text.InputFilter.AllCaps
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_filter:(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;:GetFilter_Ljava_lang_CharSequence_IILandroid_text_Spanned_IIHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.InputFilterAllLower, Uno.UI", InputFilterAllLower.class, __md_methods);
	}


	public InputFilterAllLower ()
	{
		super ();
		if (getClass () == InputFilterAllLower.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.InputFilterAllLower, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public InputFilterAllLower (java.util.Locale p0)
	{
		super (p0);
		if (getClass () == InputFilterAllLower.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.InputFilterAllLower, Uno.UI", "Java.Util.Locale, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public java.lang.CharSequence filter (java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5)
	{
		return n_filter (p0, p1, p2, p3, p4, p5);
	}

	private native java.lang.CharSequence n_filter (java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5);

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
