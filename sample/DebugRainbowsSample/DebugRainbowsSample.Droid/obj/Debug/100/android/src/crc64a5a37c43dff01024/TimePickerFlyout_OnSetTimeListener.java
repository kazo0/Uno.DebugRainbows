package crc64a5a37c43dff01024;


public class TimePickerFlyout_OnSetTimeListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.TimePickerDialog.OnTimeSetListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTimeSet:(Landroid/widget/TimePicker;II)V:GetOnTimeSet_Landroid_widget_TimePicker_IIHandler:Android.App.TimePickerDialog/IOnTimeSetListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.TimePickerFlyout+OnSetTimeListener, Uno.UI", TimePickerFlyout_OnSetTimeListener.class, __md_methods);
	}


	public TimePickerFlyout_OnSetTimeListener ()
	{
		super ();
		if (getClass () == TimePickerFlyout_OnSetTimeListener.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.TimePickerFlyout+OnSetTimeListener, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public void onTimeSet (android.widget.TimePicker p0, int p1, int p2)
	{
		n_onTimeSet (p0, p1, p2);
	}

	private native void n_onTimeSet (android.widget.TimePicker p0, int p1, int p2);

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
