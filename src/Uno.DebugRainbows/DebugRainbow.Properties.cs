// Original code taken from Steven Thewissen's Xamarin.Forms.DebugRainbows (https://github.com/sthewissen/Xamarin.Forms.DebugRainbows)

using System.Diagnostics.CodeAnalysis;

namespace Uno.DebugRainbows;

public static partial class DebugRainbow
{
	[DynamicDependency(nameof(SetShowGrid))]
	public static bool GetShowGrid(DependencyObject obj)
	{
		return (bool)obj.GetValue(ShowGridProperty);
	}

	[DynamicDependency(nameof(GetShowGrid))]
	public static void SetShowGrid(DependencyObject obj, bool value)
	{
		obj.SetValue(ShowGridProperty, value);
	}

	public static DependencyProperty ShowGridProperty { [DynamicDependency(nameof(GetShowGrid))] get; } =
		DependencyProperty.RegisterAttached("ShowGrid", typeof(bool), typeof(UIElement), new PropertyMetadata(false, OnShowDebugModeChanged));

	[DynamicDependency(nameof(SetShowColors))]
	public static bool GetShowColors(DependencyObject obj)
	{
		return (bool)obj.GetValue(ShowColorsProperty);
	}

	[DynamicDependency(nameof(GetShowColors))]
	public static void SetShowColors(DependencyObject obj, bool value)
	{
		obj.SetValue(ShowColorsProperty, value);
	}

	public static DependencyProperty ShowColorsProperty { [DynamicDependency(nameof(GetShowColors))] get; } =
		DependencyProperty.RegisterAttached("ShowColors", typeof(bool), typeof(UIElement), new PropertyMetadata(false, OnShowDebugModeChanged));

	[DynamicDependency(nameof(SetTomato))]
	public static bool GetTomato(DependencyObject obj)
	{
		return (bool)obj.GetValue(TomatoProperty);
	}

	[DynamicDependency(nameof(GetTomato))]
	public static void SetTomato(DependencyObject obj, bool value)
	{
		obj.SetValue(TomatoProperty, value);
	}

	public static DependencyProperty TomatoProperty { [DynamicDependency(nameof(GetTomato))] get; } =
		DependencyProperty.RegisterAttached("Tomato", typeof(bool), typeof(UIElement), new PropertyMetadata(false, OnTomatoChanged));

	[DynamicDependency(nameof(SetHorizontalItemsSize))]
	public static double GetHorizontalItemsSize(DependencyObject obj)
	{
		return (double)obj.GetValue(HorizontalItemsSizeProperty);
	}

	[DynamicDependency(nameof(GetHorizontalItemsSize))]
	public static void SetHorizontalItemsSize(DependencyObject obj, double value)
	{
		obj.SetValue(HorizontalItemsSizeProperty, value);
	}

	public static DependencyProperty HorizontalItemsSizeProperty { [DynamicDependency(nameof(GetHorizontalItemsSize))] get; } =
		DependencyProperty.RegisterAttached("HorizontalItemsSize", typeof(double), typeof(Page), new PropertyMetadata(10.0));

	[DynamicDependency(nameof(SetVerticalItemsSize))]
	public static double GetVerticalItemsSize(DependencyObject obj)
	{
		return (double)obj.GetValue(VerticalItemsSizeProperty);
	}

	[DynamicDependency(nameof(GetVerticalItemsSize))]
	public static void SetVerticalItemsSize(DependencyObject obj, double value)
	{
		obj.SetValue(VerticalItemsSizeProperty, value);
	}

	public static DependencyProperty VerticalItemsSizeProperty { [DynamicDependency(nameof(GetVerticalItemsSize))] get; } =
		DependencyProperty.RegisterAttached("VerticalItemsSize", typeof(double), typeof(Page), new PropertyMetadata(10.0));

	[DynamicDependency(nameof(SetMajorGridLineInterval))]
	public static int GetMajorGridLineInterval(DependencyObject obj)
	{
		return (int)obj.GetValue(MajorGridLineIntervalProperty);
	}

	[DynamicDependency(nameof(GetMajorGridLineInterval))]
	public static void SetMajorGridLineInterval(DependencyObject obj, int value)
	{
		obj.SetValue(MajorGridLineIntervalProperty, value);
	}

	public static DependencyProperty MajorGridLineIntervalProperty { [DynamicDependency(nameof(GetMajorGridLineInterval))] get; } =
		DependencyProperty.RegisterAttached("MajorGridLineInterval", typeof(int), typeof(Page), new PropertyMetadata(0));

	[DynamicDependency(nameof(SetMajorGridLineBrush))]
	public static SolidColorBrush GetMajorGridLineBrush(DependencyObject obj)
	{
		return (SolidColorBrush)obj.GetValue(MajorGridLineBrushProperty);
	}

	[DynamicDependency(nameof(GetMajorGridLineBrush))]
	public static void SetMajorGridLineBrush(DependencyObject obj, SolidColorBrush value)
	{
		obj.SetValue(MajorGridLineBrushProperty, value);
	}

	public static DependencyProperty MajorGridLineBrushProperty { [DynamicDependency(nameof(GetMajorGridLineBrush))] get; } =
		DependencyProperty.RegisterAttached("MajorGridLineBrush", typeof(SolidColorBrush), typeof(Page), new PropertyMetadata(GetGridLineBrush()));

	[DynamicDependency(nameof(SetMajorGridLineOpacity))]
	public static double GetMajorGridLineOpacity(DependencyObject obj)
	{
		return (double)obj.GetValue(SetMajorGridLineOpacityProperty);
	}

	[DynamicDependency(nameof(GetMajorGridLineOpacity))]
	public static void SetMajorGridLineOpacity(DependencyObject obj, double value)
	{
		obj.SetValue(SetMajorGridLineOpacityProperty, value);
	}

	public static DependencyProperty SetMajorGridLineOpacityProperty { [DynamicDependency(nameof(GetMajorGridLineOpacity))] get; } =
		DependencyProperty.RegisterAttached("MajorGridLineOpacity", typeof(double), typeof(Page), new PropertyMetadata(1.0));

	[DynamicDependency(nameof(SetMajorGridLineWidth))]
	public static double GetMajorGridLineWidth(DependencyObject obj)
	{
		return (double)obj.GetValue(MajorGridLineWidthProperty);
	}

	[DynamicDependency(nameof(GetMajorGridLineWidth))]
	public static void SetMajorGridLineWidth(DependencyObject obj, double value)
	{
		obj.SetValue(MajorGridLineWidthProperty, value);
	}

	public static DependencyProperty MajorGridLineWidthProperty { [DynamicDependency(nameof(GetMajorGridLineWidth))] get; } =
		DependencyProperty.RegisterAttached("MajorGridLineWidth", typeof(double), typeof(Page), new PropertyMetadata(3.0));

	[DynamicDependency(nameof(SetGridLinePadding))]
	public static Thickness GetGridLinePadding(DependencyObject obj)
	{
		return (Thickness)obj.GetValue(GridLinePaddingProperty);
	}

	[DynamicDependency(nameof(GetGridLinePadding))]
	public static void SetGridLinePadding(DependencyObject obj, Thickness value)
	{
		obj.SetValue(GridLinePaddingProperty, value);
	}

	public static DependencyProperty GridLinePaddingProperty { [DynamicDependency(nameof(GetGridLinePadding))] get; } =
		DependencyProperty.RegisterAttached("GridLinePadding", typeof(Thickness), typeof(Page), new PropertyMetadata(default(Thickness)));

	[DynamicDependency(nameof(SetGridLineBrush))]
	public static SolidColorBrush GetGridLineBrush(DependencyObject obj)
	{
		return (SolidColorBrush)obj.GetValue(GridLineBrushProperty);
	}

	[DynamicDependency(nameof(GetGridLineBrush))]
	public static void SetGridLineBrush(DependencyObject obj, SolidColorBrush value)
	{
		obj.SetValue(GridLineBrushProperty, value);
	}

	public static DependencyProperty GridLineBrushProperty { [DynamicDependency(nameof(GetGridLineBrush))] get; } =
		DependencyProperty.RegisterAttached("GridLineBrush", typeof(SolidColorBrush), typeof(Page), new PropertyMetadata(GetGridLineBrush()));

	[DynamicDependency(nameof(SetGridLineOpacity))]
	public static double GetGridLineOpacity(DependencyObject obj)
	{
		return (double)obj.GetValue(GridLineOpacityProperty);
	}

	[DynamicDependency(nameof(GetGridLineOpacity))]
	public static void SetGridLineOpacity(DependencyObject obj, double value)
	{
		obj.SetValue(GridLineOpacityProperty, value);
	}

	public static DependencyProperty GridLineOpacityProperty { [DynamicDependency(nameof(GetGridLineOpacity))] get; } =
		DependencyProperty.RegisterAttached("GridLineOpacity", typeof(double), typeof(Page), new PropertyMetadata(1.0));

	[DynamicDependency(nameof(SetGridLineWidth))]
	public static double GetGridLineWidth(DependencyObject obj)
	{
		return (double)obj.GetValue(GridLineWidthProperty);
	}

	[DynamicDependency(nameof(GetGridLineWidth))]
	public static void SetGridLineWidth(DependencyObject obj, double value)
	{
		obj.SetValue(GridLineWidthProperty, value);
	}

	public static DependencyProperty GridLineWidthProperty { [DynamicDependency(nameof(GetGridLineWidth))] get; } =
		DependencyProperty.RegisterAttached("GridLineWidth", typeof(double), typeof(Page), new PropertyMetadata(1.0));

	[DynamicDependency(nameof(SetMakeGridRainbows))]
	public static bool GetMakeGridRainbows(DependencyObject obj)
	{
		return (bool)obj.GetValue(MakeGridRainbowsProperty);
	}

	[DynamicDependency(nameof(GetMakeGridRainbows))]
	public static void SetMakeGridRainbows(DependencyObject obj, bool value)
	{
		obj.SetValue(MakeGridRainbowsProperty, value);
	}

	public static DependencyProperty MakeGridRainbowsProperty { [DynamicDependency(nameof(GetMakeGridRainbows))] get; } =
		DependencyProperty.RegisterAttached("MakeGridRainbows", typeof(bool), typeof(Page), new PropertyMetadata(false));

	[DynamicDependency(nameof(SetInverse))]
	public static bool GetInverse(DependencyObject obj)
	{
		return (bool)obj.GetValue(InverseProperty);
	}

	[DynamicDependency(nameof(GetInverse))]
	public static void SetInverse(DependencyObject obj, bool value)
	{
		obj.SetValue(InverseProperty, value);
	}

	public static DependencyProperty InverseProperty { [DynamicDependency(nameof(GetInverse))] get; } =
		DependencyProperty.RegisterAttached("Inverse", typeof(bool), typeof(Page), new PropertyMetadata(false));

	[DynamicDependency(nameof(SetGridOrigin))]
	public static DebugGridOrigin GetGridOrigin(DependencyObject obj)
	{
		return (DebugGridOrigin)obj.GetValue(GridOriginProperty);
	}

	[DynamicDependency(nameof(GetGridOrigin))]
	public static void SetGridOrigin(DependencyObject obj, DebugGridOrigin value)
	{
		obj.SetValue(GridOriginProperty, value);
	}

	public static DependencyProperty GridOriginProperty { [DynamicDependency(nameof(GetGridOrigin))] get; } =
		DependencyProperty.RegisterAttached("GridOrigin", typeof(DebugGridOrigin), typeof(Page), new PropertyMetadata(DebugGridOrigin.Center));
}