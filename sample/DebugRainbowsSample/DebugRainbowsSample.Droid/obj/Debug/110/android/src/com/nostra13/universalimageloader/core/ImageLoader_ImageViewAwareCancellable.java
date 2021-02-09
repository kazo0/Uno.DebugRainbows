package com.nostra13.universalimageloader.core;


public class ImageLoader_ImageViewAwareCancellable
	extends com.nostra13.universalimageloader.core.imageaware.ImageViewAware
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_setImageBitmap:(Landroid/graphics/Bitmap;)Z:GetSetImageBitmap_Landroid_graphics_Bitmap_Handler\n" +
			"n_setImageBitmapInto:(Landroid/graphics/Bitmap;Landroid/view/View;)V:GetSetImageBitmapInto_Landroid_graphics_Bitmap_Landroid_view_View_Handler\n" +
			"n_setImageDrawable:(Landroid/graphics/drawable/Drawable;)Z:GetSetImageDrawable_Landroid_graphics_drawable_Drawable_Handler\n" +
			"n_setImageDrawableInto:(Landroid/graphics/drawable/Drawable;Landroid/view/View;)V:GetSetImageDrawableInto_Landroid_graphics_drawable_Drawable_Landroid_view_View_Handler\n" +
			"";
		mono.android.Runtime.register ("Com.Nostra13.Universalimageloader.Core.ImageLoader+ImageViewAwareCancellable, UniversalImageLoader", ImageLoader_ImageViewAwareCancellable.class, __md_methods);
	}


	public ImageLoader_ImageViewAwareCancellable (android.widget.ImageView p0)
	{
		super (p0);
		if (getClass () == ImageLoader_ImageViewAwareCancellable.class)
			mono.android.TypeManager.Activate ("Com.Nostra13.Universalimageloader.Core.ImageLoader+ImageViewAwareCancellable, UniversalImageLoader", "Android.Widget.ImageView, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public ImageLoader_ImageViewAwareCancellable (android.widget.ImageView p0, boolean p1)
	{
		super (p0, p1);
		if (getClass () == ImageLoader_ImageViewAwareCancellable.class)
			mono.android.TypeManager.Activate ("Com.Nostra13.Universalimageloader.Core.ImageLoader+ImageViewAwareCancellable, UniversalImageLoader", "Android.Widget.ImageView, Mono.Android:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1 });
	}


	public boolean setImageBitmap (android.graphics.Bitmap p0)
	{
		return n_setImageBitmap (p0);
	}

	private native boolean n_setImageBitmap (android.graphics.Bitmap p0);


	public void setImageBitmapInto (android.graphics.Bitmap p0, android.view.View p1)
	{
		n_setImageBitmapInto (p0, p1);
	}

	private native void n_setImageBitmapInto (android.graphics.Bitmap p0, android.view.View p1);


	public boolean setImageDrawable (android.graphics.drawable.Drawable p0)
	{
		return n_setImageDrawable (p0);
	}

	private native boolean n_setImageDrawable (android.graphics.drawable.Drawable p0);


	public void setImageDrawableInto (android.graphics.drawable.Drawable p0, android.view.View p1)
	{
		n_setImageDrawableInto (p0, p1);
	}

	private native void n_setImageDrawableInto (android.graphics.drawable.Drawable p0, android.view.View p1);

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
