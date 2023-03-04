using System;
using Microsoft.UI;
using Microsoft.UI.Xaml;
using Microsoft.UI.Xaml.Controls;
using Microsoft.UI.Xaml.Media;

namespace Uno.DebugRainbows
{
	public static partial class DebugRainbow
	{

		private static readonly Random _randomGen = new Random();
		private static bool _tomatoTime = false;


		private static void OnTomatoChanged(DependencyObject dependencyObject, DependencyPropertyChangedEventArgs args)
		{
#if DEBUG
			_tomatoTime = (bool)args.NewValue;
			IterateChildren(dependencyObject as UIElement);
#endif
		}

		private static void OnShowDebugModeChanged(DependencyObject dependencyObject, DependencyPropertyChangedEventArgs args)
		{
#if DEBUG
			var showGrid = GetShowGrid(dependencyObject);
			var showColors = GetShowColors(dependencyObject);

			if (dependencyObject is FrameworkElement fe)
			{
				if (showColors || showGrid)
				{
					fe.Loaded += Element_Loaded;
				}
				else
				{
					fe.Loaded -= Element_Loaded;
				}

				if (showGrid)
				{
					fe.SizeChanged += Element_SizeChanged;
				}
				else
				{
					fe.SizeChanged -= Element_SizeChanged;
				}
			}
#endif
		}

		private static void Element_SizeChanged(object sender, SizeChangedEventArgs args)
		{
#if DEBUG
			if (sender is Page page)
			{
				BuildGrid(page);
			}
#endif
		}

		private static void Element_Loaded(object sender, RoutedEventArgs e)
		{
#if DEBUG
			if (GetShowColors(sender as DependencyObject))
			{
				IterateChildren(sender as UIElement);
			}

			if (sender is Page page)
			{
				if (GetShowGrid(page))
				{
					BuildGrid(page);
				}
			}
#endif
		}

		private static void IterateChildren(UIElement element)
		{
			if (element is Page page)
			{
				page.Background = GetColor();

				IterateChildren(page.Content as UIElement);
			}
			else if (element is Panel panel)
			{
				panel.Background = GetColor();

				foreach (var child in panel.Children)
				{
					IterateChildren(child);
				}
			}
#if HAS_UNO
			else if (element is FrameworkElement fe)
			{
				fe.Background = GetColor();
			}
#else
			else if (element is Control control)
			{
				control.Background = GetColor();
			}
			else if (element is Border border)
			{
				border.Background = GetColor();
			}
#endif
		}

		private static Brush GetColor()
		{
			if (_tomatoTime)
			{
				return new SolidColorBrush(Colors.Tomato);
			}
			return new SolidColorBrush(new Windows.UI.Color()
			{
				A = 255,
				R = (byte)_randomGen.Next(0, 255),
				B = (byte)_randomGen.Next(0, 255),
				G = (byte)_randomGen.Next(0, 255)
			});
		}

		private static Brush GetGridLineBrush()
		{
			return new SolidColorBrush(Colors.Red);
		}

		private static void BuildGrid(Page page)
		{
			if (page.Content is FrameworkElement content)
			{
				if (content.Name != nameof(DebugRainbow))
				{
					page.Content = null;

					var gridContent = new DebugGridWrapper
					{
						HorizontalItemSize = GetHorizontalItemsSize(page),
						VerticalItemSize = GetVerticalItemsSize(page),
						MajorGridLineBrush = GetMajorGridLineBrush(page),
						GridLineBrush = GetGridLineBrush(page),
						MajorGridLineOpacity = GetMajorGridLineOpacity(page),
						GridLineOpacity = GetGridLineOpacity(page),
						MajorGridLineInterval = GetMajorGridLineInterval(page),
						MajorGridLineWidth = GetMajorGridLineWidth(page),
						GridLineWidth = GetGridLineWidth(page),
						MakeGridRainbows = GetMakeGridRainbows(page),
						Inverse = GetInverse(page),
						GridOrigin = GetGridOrigin(page)
					};

					Grid newContent = new Grid()
					{
						Name = nameof(DebugRainbow),
						Height = content.Height,
						Width = content.Width
					};

					newContent.Children.Add(content);
					newContent.Children.Add(gridContent);

					page.Content = newContent;
				}
			}
		}
	}
}
