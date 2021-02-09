package crc64122dcf5ad656876d;


public class ApplicationActivity
	extends crc64a5a37c43dff01024.NativePage
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_setContentView:(Landroid/view/View;)V:GetSetContentView_Landroid_view_View_Handler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onDestroy:()V:GetOnDestroyHandler\n" +
			"n_onConfigurationChanged:(Landroid/content/res/Configuration;)V:GetOnConfigurationChanged_Landroid_content_res_Configuration_Handler\n" +
			"n_onBackPressed:()V:GetOnBackPressedHandler\n" +
			"n_onNewIntent:(Landroid/content/Intent;)V:GetOnNewIntent_Landroid_content_Intent_Handler\n" +
			"n_GetTypeAssemblyFullName:(Ljava/lang/String;)Ljava/lang/String;:__export__\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.ApplicationActivity, Uno.UI", ApplicationActivity.class, __md_methods);
	}


	public ApplicationActivity ()
	{
		super ();
		if (getClass () == ApplicationActivity.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.ApplicationActivity, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public ApplicationActivity (int p0)
	{
		super (p0);
		if (getClass () == ApplicationActivity.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.ApplicationActivity, Uno.UI", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void setContentView (android.view.View p0)
	{
		n_setContentView (p0);
	}

	private native void n_setContentView (android.view.View p0);


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();


	public void onPause ()
	{
		n_onPause ();
	}

	private native void n_onPause ();


	public void onDestroy ()
	{
		n_onDestroy ();
	}

	private native void n_onDestroy ();


	public void onConfigurationChanged (android.content.res.Configuration p0)
	{
		n_onConfigurationChanged (p0);
	}

	private native void n_onConfigurationChanged (android.content.res.Configuration p0);


	public void onBackPressed ()
	{
		n_onBackPressed ();
	}

	private native void n_onBackPressed ();


	public void onNewIntent (android.content.Intent p0)
	{
		n_onNewIntent (p0);
	}

	private native void n_onNewIntent (android.content.Intent p0);


	public static java.lang.String GetTypeAssemblyFullName (java.lang.String p0)
	{
		return n_GetTypeAssemblyFullName (p0);
	}

	private static native java.lang.String n_GetTypeAssemblyFullName (java.lang.String p0);

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
