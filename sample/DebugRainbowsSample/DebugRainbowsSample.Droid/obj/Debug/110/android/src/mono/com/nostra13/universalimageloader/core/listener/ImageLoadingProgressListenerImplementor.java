package mono.com.nostra13.universalimageloader.core.listener;


public class ImageLoadingProgressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.nostra13.universalimageloader.core.listener.ImageLoadingProgressListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onProgressUpdate:(Ljava/lang/String;Landroid/view/View;II)V:GetOnProgressUpdate_Ljava_lang_String_Landroid_view_View_IIHandler:Com.Nostra13.Universalimageloader.Core.Listener.IImageLoadingProgressListenerInvoker, UniversalImageLoader\n" +
			"";
		mono.android.Runtime.register ("Com.Nostra13.Universalimageloader.Core.Listener.IImageLoadingProgressListenerImplementor, UniversalImageLoader", ImageLoadingProgressListenerImplementor.class, __md_methods);
	}


	public ImageLoadingProgressListenerImplementor ()
	{
		super ();
		if (getClass () == ImageLoadingProgressListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Nostra13.Universalimageloader.Core.Listener.IImageLoadingProgressListenerImplementor, UniversalImageLoader", "", this, new java.lang.Object[] {  });
	}


	public void onProgressUpdate (java.lang.String p0, android.view.View p1, int p2, int p3)
	{
		n_onProgressUpdate (p0, p1, p2, p3);
	}

	private native void n_onProgressUpdate (java.lang.String p0, android.view.View p1, int p2, int p3);

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
