package crc64a5a37c43dff01024;


public class TextBox_TextBoxStringBuilder
	extends android.text.SpannableStringBuilder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_replace:(IILjava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;:GetReplace_IILjava_lang_CharSequence_IIHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.TextBox+TextBoxStringBuilder, Uno.UI", TextBox_TextBoxStringBuilder.class, __md_methods);
	}


	public TextBox_TextBoxStringBuilder ()
	{
		super ();
		if (getClass () == TextBox_TextBoxStringBuilder.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.TextBox+TextBoxStringBuilder, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public TextBox_TextBoxStringBuilder (java.lang.CharSequence p0)
	{
		super (p0);
		if (getClass () == TextBox_TextBoxStringBuilder.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.TextBox+TextBoxStringBuilder, Uno.UI", "Java.Lang.ICharSequence, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public TextBox_TextBoxStringBuilder (java.lang.CharSequence p0, int p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == TextBox_TextBoxStringBuilder.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.TextBox+TextBoxStringBuilder, Uno.UI", "Java.Lang.ICharSequence, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public android.text.SpannableStringBuilder replace (int p0, int p1, java.lang.CharSequence p2, int p3, int p4)
	{
		return n_replace (p0, p1, p2, p3, p4);
	}

	private native android.text.SpannableStringBuilder n_replace (int p0, int p1, java.lang.CharSequence p2, int p3, int p4);

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
