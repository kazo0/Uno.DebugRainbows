using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Media;

namespace Uno.DebugRainbows
{
	public static class DebugRainbow
	{

		private static readonly Random _randomGen = new Random();

		public static bool GetShowColors(DependencyObject obj)
		{
			return (bool)obj.GetValue(ShowColorsProperty);
		}

		public static void SetShowColors(DependencyObject obj, bool value)
		{
			obj.SetValue(ShowColorsProperty, value);
		}

		// Using a DependencyProperty as the backing store for ShowColors.  This enables animation, styling, binding, etc...
		public static readonly DependencyProperty ShowColorsProperty =
			DependencyProperty.RegisterAttached(
				"ShowColors",
				typeof(bool),
				typeof(UIElement),
				new PropertyMetadata(false, OnShowColorsChanged));

		private static void OnShowColorsChanged(DependencyObject dependencyObject, DependencyPropertyChangedEventArgs args)
		{
			var uiElement = dependencyObject as UIElement;
			if ((bool)args.NewValue)
			{
				IterateChildren(uiElement);
			}
		}

		private static void IterateChildren(UIElement element)
		{
			if (element is Panel panel)
			{
				panel.Background = GetRandomColor();

				foreach (var child in panel.Children)
				{
					IterateChildren(child);
				}
			}
			else if (element is FrameworkElement fe)
			{
				fe.Background = GetRandomColor();
			}
		}

		private static Brush GetRandomColor()
		{
			return SolidColorBrushHelper.FromARGB(255, (byte)_randomGen.Next(0, 255), (byte)_randomGen.Next(0, 255), (byte)_randomGen.Next(0, 255))
		}
	}
}
