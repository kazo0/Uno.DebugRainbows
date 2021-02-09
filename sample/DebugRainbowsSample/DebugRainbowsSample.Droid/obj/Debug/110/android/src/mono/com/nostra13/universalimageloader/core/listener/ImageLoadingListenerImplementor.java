package mono.com.nostra13.universalimageloader.core.listener;


public class ImageLoadingListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.nostra13.universalimageloader.core.listener.ImageLoadingListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLoadingCancelled:(Ljava/lang/String;Landroid/view/View;)V:GetOnLoadingCancelled_Ljava_lang_String_Landroid_view_View_Handler:Com.Nostra13.Universalimageloader.Core.Listener.IImageLoadingListenerInvoker, UniversalImageLoader\n" +
			"n_onLoadingComplete:(Ljava/lang/String;Landroid/view/View;Landroid/graphics/Bitmap;)V:GetOnLoadingComplete_Ljava_lang_String_Landroid_view_View_Landroid_graphics_Bitmap_Handler:Com.Nostra13.Universalimageloader.Core.Listener.IImageLoadingListenerInvoker, UniversalImageLoader\n" +
			"n_onLoadingFailed:(Ljava/lang/String;Landroid/view/View;Lcom/nostra13/universalimageloader/core/assist/FailReason;)V:GetOnLoadingFailed_Ljava_lang_String_Landroid_view_View_Lcom_nostra13_universalimageloader_core_assist_FailReason_Handler:Com.Nostra13.Universalimageloader.Core.Listener.IImageLoadingListenerInvoker, UniversalImageLoader\n" +
			"n_onLoadingStarted:(Ljava/lang/String;Landroid/view/View;)V:GetOnLoadingStarted_Ljava_lang_String_Landroid_view_View_Handler:Com.Nostra13.Universalimageloader.Core.Listener.IImageLoadingListenerInvoker, UniversalImageLoader\n" +
			"";
		mono.android.Runtime.register ("Com.Nostra13.Universalimageloader.Core.Listener.IImageLoadingListenerImplementor, UniversalImageLoader", ImageLoadingListenerImplementor.class, __md_methods);
	}


	public ImageLoadingListenerImplementor ()
	{
		super ();
		if (getClass () == ImageLoadingListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Nostra13.Universalimageloader.Core.Listener.IImageLoadingListenerImplementor, UniversalImageLoader", "", this, new java.lang.Object[] {  });
	}


	public void onLoadingCancelled (java.lang.String p0, android.view.View p1)
	{
		n_onLoadingCancelled (p0, p1);
	}

	private native void n_onLoadingCancelled (java.lang.String p0, android.view.View p1);


	public void onLoadingComplete (java.lang.String p0, android.view.View p1, android.graphics.Bitmap p2)
	{
		n_onLoadingComplete (p0, p1, p2);
	}

	private native void n_onLoadingComplete (java.lang.String p0, android.view.View p1, android.graphics.Bitmap p2);


	public void onLoadingFailed (java.lang.String p0, android.view.View p1, com.nostra13.universalimageloader.core.assist.FailReason p2)
	{
		n_onLoadingFailed (p0, p1, p2);
	}

	private native void n_onLoadingFailed (java.lang.String p0, android.view.View p1, com.nostra13.universalimageloader.core.assist.FailReason p2);


	public void onLoadingStarted (java.lang.String p0, android.view.View p1)
	{
		n_onLoadingStarted (p0, p1);
	}

	private native void n_onLoadingStarted (java.lang.String p0, android.view.View p1);

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
