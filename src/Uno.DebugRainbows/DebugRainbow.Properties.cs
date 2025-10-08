// Original code taken from Steven Thewissen's Xamarin.Forms.DebugRainbows (https://github.com/sthewissen/Xamarin.Forms.DebugRainbows)

namespace Uno.DebugRainbows;

partial class DebugRainbow
{
	public static bool GetShowGrid(DependencyObject obj)
	{
		return (bool)obj.GetValue(ShowGridProperty);
	}

	public static void SetShowGrid(DependencyObject obj, bool value)
	{
		obj.SetValue(ShowGridProperty, value);
	}

	public static readonly DependencyProperty ShowGridProperty =
		DependencyProperty.RegisterAttached("ShowGrid", typeof(bool), typeof(UIElement), new PropertyMetadata(false, OnShowDebugModeChanged));

	public static bool GetShowColors(DependencyObject obj)
	{
		return (bool)obj.GetValue(ShowColorsProperty);
	}

	public static void SetShowColors(DependencyObject obj, bool value)
	{
		obj.SetValue(ShowColorsProperty, value);
	}

	public static readonly DependencyProperty ShowColorsProperty =
		DependencyProperty.RegisterAttached("ShowColors", typeof(bool), typeof(UIElement), new PropertyMetadata(false, OnShowDebugModeChanged));

	public static bool GetTomato(DependencyObject obj)
	{
		return (bool)obj.GetValue(TomatoProperty);
	}

	public static void SetTomato(DependencyObject obj, bool value)
	{
		obj.SetValue(TomatoProperty, value);
	}

	public static readonly DependencyProperty TomatoProperty =
		DependencyProperty.RegisterAttached("Tomato", typeof(bool), typeof(UIElement), new PropertyMetadata(false, OnTomatoChanged));

	public static double GetHorizontalItemsSize(DependencyObject obj)
	{
		return (double)obj.GetValue(HorizontalItemsSizeProperty);
	}

	public static void SetHorizontalItemsSize(DependencyObject obj, double value)
	{
		obj.SetValue(HorizontalItemsSizeProperty, value);
	}

	public static readonly DependencyProperty HorizontalItemsSizeProperty =
		DependencyProperty.RegisterAttached("HorizontalItemsSize", typeof(double), typeof(Page), new PropertyMetadata(10.0));

	public static double GetVerticalItemsSize(DependencyObject obj)
	{
		return (double)obj.GetValue(VerticalItemsSizeProperty);
	}

	public static void SetVerticalItemsSize(DependencyObject obj, double value)
	{
		obj.SetValue(VerticalItemsSizeProperty, value);
	}

	public static readonly DependencyProperty VerticalItemsSizeProperty =
		DependencyProperty.RegisterAttached("VerticalItemsSize", typeof(double), typeof(Page), new PropertyMetadata(10.0));

	public static int GetMajorGridLineInterval(DependencyObject obj)
	{
		return (int)obj.GetValue(MajorGridLineIntervalProperty);
	}

	public static void SetMajorGridLineInterval(DependencyObject obj, int value)
	{
		obj.SetValue(MajorGridLineIntervalProperty, value);
	}

	public static readonly DependencyProperty MajorGridLineIntervalProperty =
		DependencyProperty.RegisterAttached("MajorGridLineInterval", typeof(int), typeof(Page), new PropertyMetadata(0));

	public static SolidColorBrush GetMajorGridLineBrush(DependencyObject obj)
	{
		return (SolidColorBrush)obj.GetValue(MajorGridLineBrushProperty);
	}

	public static void SetMajorGridLineBrush(DependencyObject obj, SolidColorBrush value)
	{
		obj.SetValue(MajorGridLineBrushProperty, value);
	}

	public static readonly DependencyProperty MajorGridLineBrushProperty =
		DependencyProperty.RegisterAttached("MajorGridLineBrush", typeof(SolidColorBrush), typeof(Page), new PropertyMetadata(GetGridLineBrush()));

	public static double GetMajorGridLineOpacity(DependencyObject obj)
	{
		return (double)obj.GetValue(SetMajorGridLineOpacityProperty);
	}

	public static void SetMajorGridLineOpacity(DependencyObject obj, double value)
	{
		obj.SetValue(SetMajorGridLineOpacityProperty, value);
	}

	public static readonly DependencyProperty SetMajorGridLineOpacityProperty =
		DependencyProperty.RegisterAttached("MajorGridLineOpacity", typeof(double), typeof(Page), new PropertyMetadata(1.0));

	public static double GetMajorGridLineWidth(DependencyObject obj)
	{
		return (double)obj.GetValue(MajorGridLineWidthProperty);
	}

	public static void SetMajorGridLineWidth(DependencyObject obj, double value)
	{
		obj.SetValue(MajorGridLineWidthProperty, value);
	}

	public static readonly DependencyProperty MajorGridLineWidthProperty =
		DependencyProperty.RegisterAttached("MajorGridLineWidth", typeof(double), typeof(Page), new PropertyMetadata(3.0));

	public static Thickness GetGridLinePadding(DependencyObject obj)
	{
		return (Thickness)obj.GetValue(GridLinePaddingProperty);
	}

	public static void SetGridLinePadding(DependencyObject obj, Thickness value)
	{
		obj.SetValue(GridLinePaddingProperty, value);
	}

	public static readonly DependencyProperty GridLinePaddingProperty =
		DependencyProperty.RegisterAttached("GridLinePadding", typeof(Thickness), typeof(Page), new PropertyMetadata(default(Thickness)));

	public static SolidColorBrush GetGridLineBrush(DependencyObject obj)
	{
		return (SolidColorBrush)obj.GetValue(GridLineBrushProperty);
	}

	public static void SetGridLineBrush(DependencyObject obj, SolidColorBrush value)
	{
		obj.SetValue(GridLineBrushProperty, value);
	}

	public static readonly DependencyProperty GridLineBrushProperty =
		DependencyProperty.RegisterAttached("GridLineBrush", typeof(SolidColorBrush), typeof(Page), new PropertyMetadata(GetGridLineBrush()));

	public static double GetGridLineOpacity(DependencyObject obj)
	{
		return (double)obj.GetValue(GridLineOpacityProperty);
	}

	public static void SetGridLineOpacity(DependencyObject obj, double value)
	{
		obj.SetValue(GridLineOpacityProperty, value);
	}

	public static readonly DependencyProperty GridLineOpacityProperty =
		DependencyProperty.RegisterAttached("GridLineOpacity", typeof(double), typeof(Page), new PropertyMetadata(1.0));

	public static double GetGridLineWidth(DependencyObject obj)
	{
		return (double)obj.GetValue(GridLineWidthProperty);
	}

	public static void SetGridLineWidth(DependencyObject obj, double value)
	{
		obj.SetValue(GridLineWidthProperty, value);
	}

	public static readonly DependencyProperty GridLineWidthProperty =
		DependencyProperty.RegisterAttached("GridLineWidth", typeof(double), typeof(Page), new PropertyMetadata(1.0));

	public static bool GetMakeGridRainbows(DependencyObject obj)
	{
		return (bool)obj.GetValue(MakeGridRainbowsProperty);
	}

	public static void SetMakeGridRainbows(DependencyObject obj, bool value)
	{
		obj.SetValue(MakeGridRainbowsProperty, value);
	}

	public static readonly DependencyProperty MakeGridRainbowsProperty =
		DependencyProperty.RegisterAttached("MakeGridRainbows", typeof(bool), typeof(Page), new PropertyMetadata(false));

	public static bool GetInverse(DependencyObject obj)
	{
		return (bool)obj.GetValue(InverseProperty);
	}

	public static void SetInverse(DependencyObject obj, bool value)
	{
		obj.SetValue(InverseProperty, value);
	}

	public static readonly DependencyProperty InverseProperty =
		DependencyProperty.RegisterAttached("Inverse", typeof(bool), typeof(Page), new PropertyMetadata(false));

	public static DebugGridOrigin GetGridOrigin(DependencyObject obj)
	{
		return (DebugGridOrigin)obj.GetValue(GridOriginProperty);
	}

	public static void SetGridOrigin(DependencyObject obj, DebugGridOrigin value)
	{
		obj.SetValue(GridOriginProperty, value);
	}

	public static readonly DependencyProperty GridOriginProperty =
		DependencyProperty.RegisterAttached("GridOrigin", typeof(DebugGridOrigin), typeof(Page), new PropertyMetadata(DebugGridOrigin.Center));
}