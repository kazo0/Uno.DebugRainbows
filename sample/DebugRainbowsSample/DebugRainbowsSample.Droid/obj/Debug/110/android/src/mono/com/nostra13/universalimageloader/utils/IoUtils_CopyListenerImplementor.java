package mono.com.nostra13.universalimageloader.utils;


public class IoUtils_CopyListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.nostra13.universalimageloader.utils.IoUtils.CopyListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBytesCopied:(II)Z:GetOnBytesCopied_IIHandler:Com.Nostra13.Universalimageloader.Utils.IoUtils/ICopyListenerInvoker, UniversalImageLoader\n" +
			"";
		mono.android.Runtime.register ("Com.Nostra13.Universalimageloader.Utils.IoUtils+ICopyListenerImplementor, UniversalImageLoader", IoUtils_CopyListenerImplementor.class, __md_methods);
	}


	public IoUtils_CopyListenerImplementor ()
	{
		super ();
		if (getClass () == IoUtils_CopyListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Nostra13.Universalimageloader.Utils.IoUtils+ICopyListenerImplementor, UniversalImageLoader", "", this, new java.lang.Object[] {  });
	}


	public boolean onBytesCopied (int p0, int p1)
	{
		return n_onBytesCopied (p0, p1);
	}

	private native boolean n_onBytesCopied (int p0, int p1);

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
