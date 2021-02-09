package crc6467d88aaa7548788d;


public class BaseActivity
	extends androidx.appcompat.app.AppCompatActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_setContentView:(Landroid/view/View;)V:GetSetContentView_Landroid_view_View_Handler\n" +
			"n_setContentView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V:GetSetContentView_Landroid_view_View_Landroid_view_ViewGroup_LayoutParams_Handler\n" +
			"n_addContentView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V:GetAddContentView_Landroid_view_View_Landroid_view_ViewGroup_LayoutParams_Handler\n" +
			"n_dispatchTouchEvent:(Landroid/view/MotionEvent;)Z:GetDispatchTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onActionModeFinished:(Landroid/view/ActionMode;)V:GetOnActionModeFinished_Landroid_view_ActionMode_Handler\n" +
			"n_onActionModeStarted:(Landroid/view/ActionMode;)V:GetOnActionModeStarted_Landroid_view_ActionMode_Handler\n" +
			"n_onActivityReenter:(ILandroid/content/Intent;)V:GetOnActivityReenter_ILandroid_content_Intent_Handler\n" +
			"n_onActivityResult:(IILandroid/content/Intent;)V:GetOnActivityResult_IILandroid_content_Intent_Handler\n" +
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onAttachFragment:(Landroid/app/Fragment;)V:GetOnAttachFragment_Landroid_app_Fragment_Handler\n" +
			"n_onBackPressed:()V:GetOnBackPressedHandler\n" +
			"n_onChildTitleChanged:(Landroid/app/Activity;Ljava/lang/CharSequence;)V:GetOnChildTitleChanged_Landroid_app_Activity_Ljava_lang_CharSequence_Handler\n" +
			"n_onConfigurationChanged:(Landroid/content/res/Configuration;)V:GetOnConfigurationChanged_Landroid_content_res_Configuration_Handler\n" +
			"n_onContentChanged:()V:GetOnContentChangedHandler\n" +
			"n_onContextItemSelected:(Landroid/view/MenuItem;)Z:GetOnContextItemSelected_Landroid_view_MenuItem_Handler\n" +
			"n_onContextMenuClosed:(Landroid/view/Menu;)V:GetOnContextMenuClosed_Landroid_view_Menu_Handler\n" +
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onCreate:(Landroid/os/Bundle;Landroid/os/PersistableBundle;)V:GetOnCreate_Landroid_os_Bundle_Landroid_os_PersistableBundle_Handler\n" +
			"n_onCreateContextMenu:(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V:GetOnCreateContextMenu_Landroid_view_ContextMenu_Landroid_view_View_Landroid_view_ContextMenu_ContextMenuInfo_Handler\n" +
			"n_onCreateDescription:()Ljava/lang/CharSequence;:GetOnCreateDescriptionHandler\n" +
			"n_onCreateNavigateUpTaskStack:(Landroid/app/TaskStackBuilder;)V:GetOnCreateNavigateUpTaskStack_Landroid_app_TaskStackBuilder_Handler\n" +
			"n_onCreateOptionsMenu:(Landroid/view/Menu;)Z:GetOnCreateOptionsMenu_Landroid_view_Menu_Handler\n" +
			"n_onCreatePanelMenu:(ILandroid/view/Menu;)Z:GetOnCreatePanelMenu_ILandroid_view_Menu_Handler\n" +
			"n_onCreatePanelView:(I)Landroid/view/View;:GetOnCreatePanelView_IHandler\n" +
			"n_onCreateThumbnail:(Landroid/graphics/Bitmap;Landroid/graphics/Canvas;)Z:GetOnCreateThumbnail_Landroid_graphics_Bitmap_Landroid_graphics_Canvas_Handler\n" +
			"n_onCreateView:(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;:GetOnCreateView_Ljava_lang_String_Landroid_content_Context_Landroid_util_AttributeSet_Handler\n" +
			"n_onCreateView:(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;:GetOnCreateView_Landroid_view_View_Ljava_lang_String_Landroid_content_Context_Landroid_util_AttributeSet_Handler\n" +
			"n_onDestroy:()V:GetOnDestroyHandler\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"n_onEnterAnimationComplete:()V:GetOnEnterAnimationCompleteHandler\n" +
			"n_onGenericMotionEvent:(Landroid/view/MotionEvent;)Z:GetOnGenericMotionEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onKeyDown:(ILandroid/view/KeyEvent;)Z:GetOnKeyDown_ILandroid_view_KeyEvent_Handler\n" +
			"n_onKeyLongPress:(ILandroid/view/KeyEvent;)Z:GetOnKeyLongPress_ILandroid_view_KeyEvent_Handler\n" +
			"n_onKeyMultiple:(IILandroid/view/KeyEvent;)Z:GetOnKeyMultiple_IILandroid_view_KeyEvent_Handler\n" +
			"n_onKeyShortcut:(ILandroid/view/KeyEvent;)Z:GetOnKeyShortcut_ILandroid_view_KeyEvent_Handler\n" +
			"n_onKeyUp:(ILandroid/view/KeyEvent;)Z:GetOnKeyUp_ILandroid_view_KeyEvent_Handler\n" +
			"n_onLowMemory:()V:GetOnLowMemoryHandler\n" +
			"n_onMenuOpened:(ILandroid/view/Menu;)Z:GetOnMenuOpened_ILandroid_view_Menu_Handler\n" +
			"n_onNavigateUp:()Z:GetOnNavigateUpHandler\n" +
			"n_onNavigateUpFromChild:(Landroid/app/Activity;)Z:GetOnNavigateUpFromChild_Landroid_app_Activity_Handler\n" +
			"n_onNewIntent:(Landroid/content/Intent;)V:GetOnNewIntent_Landroid_content_Intent_Handler\n" +
			"n_onOptionsItemSelected:(Landroid/view/MenuItem;)Z:GetOnOptionsItemSelected_Landroid_view_MenuItem_Handler\n" +
			"n_onOptionsMenuClosed:(Landroid/view/Menu;)V:GetOnOptionsMenuClosed_Landroid_view_Menu_Handler\n" +
			"n_onPanelClosed:(ILandroid/view/Menu;)V:GetOnPanelClosed_ILandroid_view_Menu_Handler\n" +
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onPostCreate:(Landroid/os/Bundle;)V:GetOnPostCreate_Landroid_os_Bundle_Handler\n" +
			"n_onPostCreate:(Landroid/os/Bundle;Landroid/os/PersistableBundle;)V:GetOnPostCreate_Landroid_os_Bundle_Landroid_os_PersistableBundle_Handler\n" +
			"n_onPostResume:()V:GetOnPostResumeHandler\n" +
			"n_onPrepareNavigateUpTaskStack:(Landroid/app/TaskStackBuilder;)V:GetOnPrepareNavigateUpTaskStack_Landroid_app_TaskStackBuilder_Handler\n" +
			"n_onPrepareOptionsMenu:(Landroid/view/Menu;)Z:GetOnPrepareOptionsMenu_Landroid_view_Menu_Handler\n" +
			"n_onPrepareOptionsPanel:(Landroid/view/View;Landroid/view/Menu;)Z:GetOnPrepareOptionsPanel_Landroid_view_View_Landroid_view_Menu_Handler\n" +
			"n_onPreparePanel:(ILandroid/view/View;Landroid/view/Menu;)Z:GetOnPreparePanel_ILandroid_view_View_Landroid_view_Menu_Handler\n" +
			"n_onProvideAssistData:(Landroid/os/Bundle;)V:GetOnProvideAssistData_Landroid_os_Bundle_Handler\n" +
			"n_onRequestPermissionsResult:(I[Ljava/lang/String;[I)V:GetOnRequestPermissionsResult_IarrayLjava_lang_String_arrayIHandler\n" +
			"n_onRestart:()V:GetOnRestartHandler\n" +
			"n_onRestoreInstanceState:(Landroid/os/Bundle;)V:GetOnRestoreInstanceState_Landroid_os_Bundle_Handler\n" +
			"n_onRestoreInstanceState:(Landroid/os/Bundle;Landroid/os/PersistableBundle;)V:GetOnRestoreInstanceState_Landroid_os_Bundle_Landroid_os_PersistableBundle_Handler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"n_onResumeFragments:()V:GetOnResumeFragmentsHandler\n" +
			"n_onRetainCustomNonConfigurationInstance:()Ljava/lang/Object;:GetOnRetainCustomNonConfigurationInstanceHandler\n" +
			"n_onSaveInstanceState:(Landroid/os/Bundle;)V:GetOnSaveInstanceState_Landroid_os_Bundle_Handler\n" +
			"n_onSaveInstanceState:(Landroid/os/Bundle;Landroid/os/PersistableBundle;)V:GetOnSaveInstanceState_Landroid_os_Bundle_Landroid_os_PersistableBundle_Handler\n" +
			"n_onSearchRequested:()Z:GetOnSearchRequestedHandler\n" +
			"n_onStart:()V:GetOnStartHandler\n" +
			"n_onStateNotSaved:()V:GetOnStateNotSavedHandler\n" +
			"n_onStop:()V:GetOnStopHandler\n" +
			"n_onTitleChanged:(Ljava/lang/CharSequence;I)V:GetOnTitleChanged_Ljava_lang_CharSequence_IHandler\n" +
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onTrackballEvent:(Landroid/view/MotionEvent;)Z:GetOnTrackballEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onTrimMemory:(I)V:GetOnTrimMemory_IHandler\n" +
			"n_onUserInteraction:()V:GetOnUserInteractionHandler\n" +
			"n_onUserLeaveHint:()V:GetOnUserLeaveHintHandler\n" +
			"n_onVisibleBehindCanceled:()V:GetOnVisibleBehindCanceledHandler\n" +
			"n_onWindowAttributesChanged:(Landroid/view/WindowManager$LayoutParams;)V:GetOnWindowAttributesChanged_Landroid_view_WindowManager_LayoutParams_Handler\n" +
			"n_onWindowFocusChanged:(Z)V:GetOnWindowFocusChanged_ZHandler\n" +
			"n_onWindowStartingActionMode:(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;:GetOnWindowStartingActionMode_Landroid_view_ActionMode_Callback_Handler\n" +
			"n_toString:()Ljava/lang/String;:GetToStringHandler\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.BaseActivity, Uno.UI", BaseActivity.class, __md_methods);
	}


	public BaseActivity ()
	{
		super ();
		if (getClass () == BaseActivity.class)
			mono.android.TypeManager.Activate ("Uno.UI.BaseActivity, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public BaseActivity (int p0)
	{
		super (p0);
		if (getClass () == BaseActivity.class)
			mono.android.TypeManager.Activate ("Uno.UI.BaseActivity, Uno.UI", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public void setContentView (android.view.View p0)
	{
		n_setContentView (p0);
	}

	private native void n_setContentView (android.view.View p0);


	public void setContentView (android.view.View p0, android.view.ViewGroup.LayoutParams p1)
	{
		n_setContentView (p0, p1);
	}

	private native void n_setContentView (android.view.View p0, android.view.ViewGroup.LayoutParams p1);


	public void addContentView (android.view.View p0, android.view.ViewGroup.LayoutParams p1)
	{
		n_addContentView (p0, p1);
	}

	private native void n_addContentView (android.view.View p0, android.view.ViewGroup.LayoutParams p1);


	public boolean dispatchTouchEvent (android.view.MotionEvent p0)
	{
		return n_dispatchTouchEvent (p0);
	}

	private native boolean n_dispatchTouchEvent (android.view.MotionEvent p0);


	public void onActionModeFinished (android.view.ActionMode p0)
	{
		n_onActionModeFinished (p0);
	}

	private native void n_onActionModeFinished (android.view.ActionMode p0);


	public void onActionModeStarted (android.view.ActionMode p0)
	{
		n_onActionModeStarted (p0);
	}

	private native void n_onActionModeStarted (android.view.ActionMode p0);


	public void onActivityReenter (int p0, android.content.Intent p1)
	{
		n_onActivityReenter (p0, p1);
	}

	private native void n_onActivityReenter (int p0, android.content.Intent p1);


	public void onActivityResult (int p0, int p1, android.content.Intent p2)
	{
		n_onActivityResult (p0, p1, p2);
	}

	private native void n_onActivityResult (int p0, int p1, android.content.Intent p2);


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();


	public void onAttachFragment (android.app.Fragment p0)
	{
		n_onAttachFragment (p0);
	}

	private native void n_onAttachFragment (android.app.Fragment p0);


	public void onBackPressed ()
	{
		n_onBackPressed ();
	}

	private native void n_onBackPressed ();


	public void onChildTitleChanged (android.app.Activity p0, java.lang.CharSequence p1)
	{
		n_onChildTitleChanged (p0, p1);
	}

	private native void n_onChildTitleChanged (android.app.Activity p0, java.lang.CharSequence p1);


	public void onConfigurationChanged (android.content.res.Configuration p0)
	{
		n_onConfigurationChanged (p0);
	}

	private native void n_onConfigurationChanged (android.content.res.Configuration p0);


	public void onContentChanged ()
	{
		n_onContentChanged ();
	}

	private native void n_onContentChanged ();


	public boolean onContextItemSelected (android.view.MenuItem p0)
	{
		return n_onContextItemSelected (p0);
	}

	private native boolean n_onContextItemSelected (android.view.MenuItem p0);


	public void onContextMenuClosed (android.view.Menu p0)
	{
		n_onContextMenuClosed (p0);
	}

	private native void n_onContextMenuClosed (android.view.Menu p0);


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onCreate (android.os.Bundle p0, android.os.PersistableBundle p1)
	{
		n_onCreate (p0, p1);
	}

	private native void n_onCreate (android.os.Bundle p0, android.os.PersistableBundle p1);


	public void onCreateContextMenu (android.view.ContextMenu p0, android.view.View p1, android.view.ContextMenu.ContextMenuInfo p2)
	{
		n_onCreateContextMenu (p0, p1, p2);
	}

	private native void n_onCreateContextMenu (android.view.ContextMenu p0, android.view.View p1, android.view.ContextMenu.ContextMenuInfo p2);


	public java.lang.CharSequence onCreateDescription ()
	{
		return n_onCreateDescription ();
	}

	private native java.lang.CharSequence n_onCreateDescription ();


	public void onCreateNavigateUpTaskStack (android.app.TaskStackBuilder p0)
	{
		n_onCreateNavigateUpTaskStack (p0);
	}

	private native void n_onCreateNavigateUpTaskStack (android.app.TaskStackBuilder p0);


	public boolean onCreateOptionsMenu (android.view.Menu p0)
	{
		return n_onCreateOptionsMenu (p0);
	}

	private native boolean n_onCreateOptionsMenu (android.view.Menu p0);


	public boolean onCreatePanelMenu (int p0, android.view.Menu p1)
	{
		return n_onCreatePanelMenu (p0, p1);
	}

	private native boolean n_onCreatePanelMenu (int p0, android.view.Menu p1);


	public android.view.View onCreatePanelView (int p0)
	{
		return n_onCreatePanelView (p0);
	}

	private native android.view.View n_onCreatePanelView (int p0);


	public boolean onCreateThumbnail (android.graphics.Bitmap p0, android.graphics.Canvas p1)
	{
		return n_onCreateThumbnail (p0, p1);
	}

	private native boolean n_onCreateThumbnail (android.graphics.Bitmap p0, android.graphics.Canvas p1);


	public android.view.View onCreateView (java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2)
	{
		return n_onCreateView (p0, p1, p2);
	}

	private native android.view.View n_onCreateView (java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2);


	public android.view.View onCreateView (android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3)
	{
		return n_onCreateView (p0, p1, p2, p3);
	}

	private native android.view.View n_onCreateView (android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3);


	public void onDestroy ()
	{
		n_onDestroy ();
	}

	private native void n_onDestroy ();


	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();


	public void onEnterAnimationComplete ()
	{
		n_onEnterAnimationComplete ();
	}

	private native void n_onEnterAnimationComplete ();


	public boolean onGenericMotionEvent (android.view.MotionEvent p0)
	{
		return n_onGenericMotionEvent (p0);
	}

	private native boolean n_onGenericMotionEvent (android.view.MotionEvent p0);


	public boolean onKeyDown (int p0, android.view.KeyEvent p1)
	{
		return n_onKeyDown (p0, p1);
	}

	private native boolean n_onKeyDown (int p0, android.view.KeyEvent p1);


	public boolean onKeyLongPress (int p0, android.view.KeyEvent p1)
	{
		return n_onKeyLongPress (p0, p1);
	}

	private native boolean n_onKeyLongPress (int p0, android.view.KeyEvent p1);


	public boolean onKeyMultiple (int p0, int p1, android.view.KeyEvent p2)
	{
		return n_onKeyMultiple (p0, p1, p2);
	}

	private native boolean n_onKeyMultiple (int p0, int p1, android.view.KeyEvent p2);


	public boolean onKeyShortcut (int p0, android.view.KeyEvent p1)
	{
		return n_onKeyShortcut (p0, p1);
	}

	private native boolean n_onKeyShortcut (int p0, android.view.KeyEvent p1);


	public boolean onKeyUp (int p0, android.view.KeyEvent p1)
	{
		return n_onKeyUp (p0, p1);
	}

	private native boolean n_onKeyUp (int p0, android.view.KeyEvent p1);


	public void onLowMemory ()
	{
		n_onLowMemory ();
	}

	private native void n_onLowMemory ();


	public boolean onMenuOpened (int p0, android.view.Menu p1)
	{
		return n_onMenuOpened (p0, p1);
	}

	private native boolean n_onMenuOpened (int p0, android.view.Menu p1);


	public boolean onNavigateUp ()
	{
		return n_onNavigateUp ();
	}

	private native boolean n_onNavigateUp ();


	public boolean onNavigateUpFromChild (android.app.Activity p0)
	{
		return n_onNavigateUpFromChild (p0);
	}

	private native boolean n_onNavigateUpFromChild (android.app.Activity p0);


	public void onNewIntent (android.content.Intent p0)
	{
		n_onNewIntent (p0);
	}

	private native void n_onNewIntent (android.content.Intent p0);


	public boolean onOptionsItemSelected (android.view.MenuItem p0)
	{
		return n_onOptionsItemSelected (p0);
	}

	private native boolean n_onOptionsItemSelected (android.view.MenuItem p0);


	public void onOptionsMenuClosed (android.view.Menu p0)
	{
		n_onOptionsMenuClosed (p0);
	}

	private native void n_onOptionsMenuClosed (android.view.Menu p0);


	public void onPanelClosed (int p0, android.view.Menu p1)
	{
		n_onPanelClosed (p0, p1);
	}

	private native void n_onPanelClosed (int p0, android.view.Menu p1);


	public void onPause ()
	{
		n_onPause ();
	}

	private native void n_onPause ();


	public void onPostCreate (android.os.Bundle p0)
	{
		n_onPostCreate (p0);
	}

	private native void n_onPostCreate (android.os.Bundle p0);


	public void onPostCreate (android.os.Bundle p0, android.os.PersistableBundle p1)
	{
		n_onPostCreate (p0, p1);
	}

	private native void n_onPostCreate (android.os.Bundle p0, android.os.PersistableBundle p1);


	public void onPostResume ()
	{
		n_onPostResume ();
	}

	private native void n_onPostResume ();


	public void onPrepareNavigateUpTaskStack (android.app.TaskStackBuilder p0)
	{
		n_onPrepareNavigateUpTaskStack (p0);
	}

	private native void n_onPrepareNavigateUpTaskStack (android.app.TaskStackBuilder p0);


	public boolean onPrepareOptionsMenu (android.view.Menu p0)
	{
		return n_onPrepareOptionsMenu (p0);
	}

	private native boolean n_onPrepareOptionsMenu (android.view.Menu p0);


	public boolean onPrepareOptionsPanel (android.view.View p0, android.view.Menu p1)
	{
		return n_onPrepareOptionsPanel (p0, p1);
	}

	private native boolean n_onPrepareOptionsPanel (android.view.View p0, android.view.Menu p1);


	public boolean onPreparePanel (int p0, android.view.View p1, android.view.Menu p2)
	{
		return n_onPreparePanel (p0, p1, p2);
	}

	private native boolean n_onPreparePanel (int p0, android.view.View p1, android.view.Menu p2);


	public void onProvideAssistData (android.os.Bundle p0)
	{
		n_onProvideAssistData (p0);
	}

	private native void n_onProvideAssistData (android.os.Bundle p0);


	public void onRequestPermissionsResult (int p0, java.lang.String[] p1, int[] p2)
	{
		n_onRequestPermissionsResult (p0, p1, p2);
	}

	private native void n_onRequestPermissionsResult (int p0, java.lang.String[] p1, int[] p2);


	public void onRestart ()
	{
		n_onRestart ();
	}

	private native void n_onRestart ();


	public void onRestoreInstanceState (android.os.Bundle p0)
	{
		n_onRestoreInstanceState (p0);
	}

	private native void n_onRestoreInstanceState (android.os.Bundle p0);


	public void onRestoreInstanceState (android.os.Bundle p0, android.os.PersistableBundle p1)
	{
		n_onRestoreInstanceState (p0, p1);
	}

	private native void n_onRestoreInstanceState (android.os.Bundle p0, android.os.PersistableBundle p1);


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();


	public void onResumeFragments ()
	{
		n_onResumeFragments ();
	}

	private native void n_onResumeFragments ();


	public java.lang.Object onRetainCustomNonConfigurationInstance ()
	{
		return n_onRetainCustomNonConfigurationInstance ();
	}

	private native java.lang.Object n_onRetainCustomNonConfigurationInstance ();


	public void onSaveInstanceState (android.os.Bundle p0)
	{
		n_onSaveInstanceState (p0);
	}

	private native void n_onSaveInstanceState (android.os.Bundle p0);


	public void onSaveInstanceState (android.os.Bundle p0, android.os.PersistableBundle p1)
	{
		n_onSaveInstanceState (p0, p1);
	}

	private native void n_onSaveInstanceState (android.os.Bundle p0, android.os.PersistableBundle p1);


	public boolean onSearchRequested ()
	{
		return n_onSearchRequested ();
	}

	private native boolean n_onSearchRequested ();


	public void onStart ()
	{
		n_onStart ();
	}

	private native void n_onStart ();


	public void onStateNotSaved ()
	{
		n_onStateNotSaved ();
	}

	private native void n_onStateNotSaved ();


	public void onStop ()
	{
		n_onStop ();
	}

	private native void n_onStop ();


	public void onTitleChanged (java.lang.CharSequence p0, int p1)
	{
		n_onTitleChanged (p0, p1);
	}

	private native void n_onTitleChanged (java.lang.CharSequence p0, int p1);


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);


	public boolean onTrackballEvent (android.view.MotionEvent p0)
	{
		return n_onTrackballEvent (p0);
	}

	private native boolean n_onTrackballEvent (android.view.MotionEvent p0);


	public void onTrimMemory (int p0)
	{
		n_onTrimMemory (p0);
	}

	private native void n_onTrimMemory (int p0);


	public void onUserInteraction ()
	{
		n_onUserInteraction ();
	}

	private native void n_onUserInteraction ();


	public void onUserLeaveHint ()
	{
		n_onUserLeaveHint ();
	}

	private native void n_onUserLeaveHint ();


	public void onVisibleBehindCanceled ()
	{
		n_onVisibleBehindCanceled ();
	}

	private native void n_onVisibleBehindCanceled ();


	public void onWindowAttributesChanged (android.view.WindowManager.LayoutParams p0)
	{
		n_onWindowAttributesChanged (p0);
	}

	private native void n_onWindowAttributesChanged (android.view.WindowManager.LayoutParams p0);


	public void onWindowFocusChanged (boolean p0)
	{
		n_onWindowFocusChanged (p0);
	}

	private native void n_onWindowFocusChanged (boolean p0);


	public android.view.ActionMode onWindowStartingActionMode (android.view.ActionMode.Callback p0)
	{
		return n_onWindowStartingActionMode (p0);
	}

	private native android.view.ActionMode n_onWindowStartingActionMode (android.view.ActionMode.Callback p0);


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
