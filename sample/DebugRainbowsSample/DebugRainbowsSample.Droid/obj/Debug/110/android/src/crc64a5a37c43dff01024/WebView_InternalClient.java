package crc64a5a37c43dff01024;


public class WebView_InternalClient
	extends android.webkit.WebViewClient
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_shouldOverrideUrlLoading:(Landroid/webkit/WebView;Ljava/lang/String;)Z:GetShouldOverrideUrlLoading_Landroid_webkit_WebView_Ljava_lang_String_Handler\n" +
			"n_onPageStarted:(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V:GetOnPageStarted_Landroid_webkit_WebView_Ljava_lang_String_Landroid_graphics_Bitmap_Handler\n" +
			"n_onReceivedError:(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V:GetOnReceivedError_Landroid_webkit_WebView_ILjava_lang_String_Ljava_lang_String_Handler\n" +
			"n_onPageFinished:(Landroid/webkit/WebView;Ljava/lang/String;)V:GetOnPageFinished_Landroid_webkit_WebView_Ljava_lang_String_Handler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.WebView+InternalClient, Uno.UI", WebView_InternalClient.class, __md_methods);
	}


	public WebView_InternalClient ()
	{
		super ();
		if (getClass () == WebView_InternalClient.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.WebView+InternalClient, Uno.UI", "", this, new java.lang.Object[] {  });
	}

	public WebView_InternalClient (crc64a5a37c43dff01024.WebView p0)
	{
		super ();
		if (getClass () == WebView_InternalClient.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.WebView+InternalClient, Uno.UI", "Windows.UI.Xaml.Controls.WebView, Uno.UI", this, new java.lang.Object[] { p0 });
	}


	public boolean shouldOverrideUrlLoading (android.webkit.WebView p0, java.lang.String p1)
	{
		return n_shouldOverrideUrlLoading (p0, p1);
	}

	private native boolean n_shouldOverrideUrlLoading (android.webkit.WebView p0, java.lang.String p1);


	public void onPageStarted (android.webkit.WebView p0, java.lang.String p1, android.graphics.Bitmap p2)
	{
		n_onPageStarted (p0, p1, p2);
	}

	private native void n_onPageStarted (android.webkit.WebView p0, java.lang.String p1, android.graphics.Bitmap p2);


	public void onReceivedError (android.webkit.WebView p0, int p1, java.lang.String p2, java.lang.String p3)
	{
		n_onReceivedError (p0, p1, p2, p3);
	}

	private native void n_onReceivedError (android.webkit.WebView p0, int p1, java.lang.String p2, java.lang.String p3);


	public void onPageFinished (android.webkit.WebView p0, java.lang.String p1)
	{
		n_onPageFinished (p0, p1);
	}

	private native void n_onPageFinished (android.webkit.WebView p0, java.lang.String p1);

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
