package crc64a5a37c43dff01024;


public class TextBox_Factory
	extends android.text.Editable.Factory
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_newEditable:(Ljava/lang/CharSequence;)Landroid/text/Editable;:GetNewEditable_Ljava_lang_CharSequence_Handler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.TextBox+Factory, Uno.UI", TextBox_Factory.class, __md_methods);
	}


	public TextBox_Factory ()
	{
		super ();
		if (getClass () == TextBox_Factory.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.TextBox+Factory, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public android.text.Editable newEditable (java.lang.CharSequence p0)
	{
		return n_newEditable (p0);
	}

	private native android.text.Editable n_newEditable (java.lang.CharSequence p0);

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
