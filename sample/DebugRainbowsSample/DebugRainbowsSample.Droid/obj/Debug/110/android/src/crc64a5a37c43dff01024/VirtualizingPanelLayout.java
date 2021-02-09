package crc64a5a37c43dff01024;


public abstract class VirtualizingPanelLayout
	extends androidx.recyclerview.widget.RecyclerView.LayoutManager
	implements
		mono.android.IGCUserPeer,
		androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_generateDefaultLayoutParams:()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;:GetGenerateDefaultLayoutParamsHandler\n" +
			"n_onLayoutChildren:(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V:GetOnLayoutChildren_Landroidx_recyclerview_widget_RecyclerView_Recycler_Landroidx_recyclerview_widget_RecyclerView_State_Handler\n" +
			"n_scrollVerticallyBy:(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I:GetScrollVerticallyBy_ILandroidx_recyclerview_widget_RecyclerView_Recycler_Landroidx_recyclerview_widget_RecyclerView_State_Handler\n" +
			"n_scrollHorizontallyBy:(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I:GetScrollHorizontallyBy_ILandroidx_recyclerview_widget_RecyclerView_Recycler_Landroidx_recyclerview_widget_RecyclerView_State_Handler\n" +
			"n_canScrollVertically:()Z:GetCanScrollVerticallyHandler\n" +
			"n_canScrollHorizontally:()Z:GetCanScrollHorizontallyHandler\n" +
			"n_scrollToPosition:(I)V:GetScrollToPosition_IHandler\n" +
			"n_removeAllViews:()V:GetRemoveAllViewsHandler\n" +
			"n_onMeasure:(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;II)V:GetOnMeasure_Landroidx_recyclerview_widget_RecyclerView_Recycler_Landroidx_recyclerview_widget_RecyclerView_State_IIHandler\n" +
			"n_offsetChildrenHorizontal:(I)V:GetOffsetChildrenHorizontal_IHandler\n" +
			"n_offsetChildrenVertical:(I)V:GetOffsetChildrenVertical_IHandler\n" +
			"n_computeHorizontalScrollExtent:(Landroidx/recyclerview/widget/RecyclerView$State;)I:GetComputeHorizontalScrollExtent_Landroidx_recyclerview_widget_RecyclerView_State_Handler\n" +
			"n_computeHorizontalScrollOffset:(Landroidx/recyclerview/widget/RecyclerView$State;)I:GetComputeHorizontalScrollOffset_Landroidx_recyclerview_widget_RecyclerView_State_Handler\n" +
			"n_computeHorizontalScrollRange:(Landroidx/recyclerview/widget/RecyclerView$State;)I:GetComputeHorizontalScrollRange_Landroidx_recyclerview_widget_RecyclerView_State_Handler\n" +
			"n_computeVerticalScrollExtent:(Landroidx/recyclerview/widget/RecyclerView$State;)I:GetComputeVerticalScrollExtent_Landroidx_recyclerview_widget_RecyclerView_State_Handler\n" +
			"n_computeVerticalScrollOffset:(Landroidx/recyclerview/widget/RecyclerView$State;)I:GetComputeVerticalScrollOffset_Landroidx_recyclerview_widget_RecyclerView_State_Handler\n" +
			"n_computeVerticalScrollRange:(Landroidx/recyclerview/widget/RecyclerView$State;)I:GetComputeVerticalScrollRange_Landroidx_recyclerview_widget_RecyclerView_State_Handler\n" +
			"n_onRequestChildFocus:(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;Landroid/view/View;Landroid/view/View;)Z:GetOnRequestChildFocus_Landroidx_recyclerview_widget_RecyclerView_Landroidx_recyclerview_widget_RecyclerView_State_Landroid_view_View_Landroid_view_View_Handler\n" +
			"n_toString:()Ljava/lang/String;:GetToStringHandler\n" +
			"n_computeScrollVectorForPosition:(I)Landroid/graphics/PointF;:GetComputeScrollVectorForPosition_IHandler:AndroidX.RecyclerView.Widget.RecyclerView/SmoothScroller/IScrollVectorProviderInvoker, Xamarin.AndroidX.RecyclerView\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.VirtualizingPanelLayout, Uno.UI", VirtualizingPanelLayout.class, __md_methods);
	}


	public VirtualizingPanelLayout ()
	{
		super ();
		if (getClass () == VirtualizingPanelLayout.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.VirtualizingPanelLayout, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams ()
	{
		return n_generateDefaultLayoutParams ();
	}

	private native androidx.recyclerview.widget.RecyclerView.LayoutParams n_generateDefaultLayoutParams ();


	public void onLayoutChildren (androidx.recyclerview.widget.RecyclerView.Recycler p0, androidx.recyclerview.widget.RecyclerView.State p1)
	{
		n_onLayoutChildren (p0, p1);
	}

	private native void n_onLayoutChildren (androidx.recyclerview.widget.RecyclerView.Recycler p0, androidx.recyclerview.widget.RecyclerView.State p1);


	public int scrollVerticallyBy (int p0, androidx.recyclerview.widget.RecyclerView.Recycler p1, androidx.recyclerview.widget.RecyclerView.State p2)
	{
		return n_scrollVerticallyBy (p0, p1, p2);
	}

	private native int n_scrollVerticallyBy (int p0, androidx.recyclerview.widget.RecyclerView.Recycler p1, androidx.recyclerview.widget.RecyclerView.State p2);


	public int scrollHorizontallyBy (int p0, androidx.recyclerview.widget.RecyclerView.Recycler p1, androidx.recyclerview.widget.RecyclerView.State p2)
	{
		return n_scrollHorizontallyBy (p0, p1, p2);
	}

	private native int n_scrollHorizontallyBy (int p0, androidx.recyclerview.widget.RecyclerView.Recycler p1, androidx.recyclerview.widget.RecyclerView.State p2);


	public boolean canScrollVertically ()
	{
		return n_canScrollVertically ();
	}

	private native boolean n_canScrollVertically ();


	public boolean canScrollHorizontally ()
	{
		return n_canScrollHorizontally ();
	}

	private native boolean n_canScrollHorizontally ();


	public void scrollToPosition (int p0)
	{
		n_scrollToPosition (p0);
	}

	private native void n_scrollToPosition (int p0);


	public void removeAllViews ()
	{
		n_removeAllViews ();
	}

	private native void n_removeAllViews ();


	public void onMeasure (androidx.recyclerview.widget.RecyclerView.Recycler p0, androidx.recyclerview.widget.RecyclerView.State p1, int p2, int p3)
	{
		n_onMeasure (p0, p1, p2, p3);
	}

	private native void n_onMeasure (androidx.recyclerview.widget.RecyclerView.Recycler p0, androidx.recyclerview.widget.RecyclerView.State p1, int p2, int p3);


	public void offsetChildrenHorizontal (int p0)
	{
		n_offsetChildrenHorizontal (p0);
	}

	private native void n_offsetChildrenHorizontal (int p0);


	public void offsetChildrenVertical (int p0)
	{
		n_offsetChildrenVertical (p0);
	}

	private native void n_offsetChildrenVertical (int p0);


	public int computeHorizontalScrollExtent (androidx.recyclerview.widget.RecyclerView.State p0)
	{
		return n_computeHorizontalScrollExtent (p0);
	}

	private native int n_computeHorizontalScrollExtent (androidx.recyclerview.widget.RecyclerView.State p0);


	public int computeHorizontalScrollOffset (androidx.recyclerview.widget.RecyclerView.State p0)
	{
		return n_computeHorizontalScrollOffset (p0);
	}

	private native int n_computeHorizontalScrollOffset (androidx.recyclerview.widget.RecyclerView.State p0);


	public int computeHorizontalScrollRange (androidx.recyclerview.widget.RecyclerView.State p0)
	{
		return n_computeHorizontalScrollRange (p0);
	}

	private native int n_computeHorizontalScrollRange (androidx.recyclerview.widget.RecyclerView.State p0);


	public int computeVerticalScrollExtent (androidx.recyclerview.widget.RecyclerView.State p0)
	{
		return n_computeVerticalScrollExtent (p0);
	}

	private native int n_computeVerticalScrollExtent (androidx.recyclerview.widget.RecyclerView.State p0);


	public int computeVerticalScrollOffset (androidx.recyclerview.widget.RecyclerView.State p0)
	{
		return n_computeVerticalScrollOffset (p0);
	}

	private native int n_computeVerticalScrollOffset (androidx.recyclerview.widget.RecyclerView.State p0);


	public int computeVerticalScrollRange (androidx.recyclerview.widget.RecyclerView.State p0)
	{
		return n_computeVerticalScrollRange (p0);
	}

	private native int n_computeVerticalScrollRange (androidx.recyclerview.widget.RecyclerView.State p0);


	public boolean onRequestChildFocus (androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView.State p1, android.view.View p2, android.view.View p3)
	{
		return n_onRequestChildFocus (p0, p1, p2, p3);
	}

	private native boolean n_onRequestChildFocus (androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView.State p1, android.view.View p2, android.view.View p3);


	public java.lang.String toString ()
	{
		return n_toString ();
	}

	private native java.lang.String n_toString ();


	public android.graphics.PointF computeScrollVectorForPosition (int p0)
	{
		return n_computeScrollVectorForPosition (p0);
	}

	private native android.graphics.PointF n_computeScrollVectorForPosition (int p0);

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
