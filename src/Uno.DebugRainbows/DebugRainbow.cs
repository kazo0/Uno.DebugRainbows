using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Windows.UI;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Media;

namespace Uno.DebugRainbows
{
	public static class DebugRainbow
	{

		private static readonly Random _randomGen = new Random();
		private static bool _tomatoTime = false;

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



        public static bool GetTomato(DependencyObject obj)
        {
            return (bool)obj.GetValue(TomatoProperty);
        }

        public static void SetTomato(DependencyObject obj, bool value)
        {
            obj.SetValue(TomatoProperty, value);
        }

        // Using a DependencyProperty as the backing store for Tomato.  This enables animation, styling, binding, etc...
        public static readonly DependencyProperty TomatoProperty =
            DependencyProperty.RegisterAttached("Tomato", typeof(bool), typeof(UIElement), new PropertyMetadata(false, OnTomatoChanged));

        private static void OnTomatoChanged(DependencyObject dependencyObject, DependencyPropertyChangedEventArgs args)
        {
#if DEBUG
			_tomatoTime = (bool)args.NewValue;
			IterateChildren(dependencyObject as UIElement);
#endif
		}

        private static void OnShowColorsChanged(DependencyObject dependencyObject, DependencyPropertyChangedEventArgs args)
		{
#if DEBUG
			if (dependencyObject is FrameworkElement fe)
			{
				if ((bool)args.NewValue)
				{                   
					fe.Loaded += Element_Loaded; 
				}
				else
                {
					fe.Loaded -= Element_Loaded;
                }
			}
#endif
		}

		private static void Element_Loaded(object sender, RoutedEventArgs e)
		{
#if DEBUG
			IterateChildren(sender as UIElement);
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
#endif
		}

		private static Brush GetColor()
		{
			if (_tomatoTime)
            {
#if !HAS_UNO
				return new SolidColorBrush(Colors.Tomato);
#else
				return SolidColorBrushHelper.Tomato;
#endif
			}
#if !HAS_UNO
			return new SolidColorBrush(new Windows.UI.Color() { 
				A = 255, 
				R = (byte)_randomGen.Next(0, 255), 
				B = (byte)_randomGen.Next(0, 255), 
				G = (byte)_randomGen.Next(0, 255) 
			});
#else
			return SolidColorBrushHelper
				.FromARGB(
				255, 
				(byte)_randomGen.Next(0, 255), 
				(byte)_randomGen.Next(0, 255), 
				(byte)_randomGen.Next(0, 255));
#endif
		}
	}
}
