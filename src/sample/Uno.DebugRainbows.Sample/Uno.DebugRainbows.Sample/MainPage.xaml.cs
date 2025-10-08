using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Microsoft.UI.Xaml;
using Microsoft.UI.Xaml.Controls;
using Microsoft.UI.Xaml.Controls.Primitives;
using Microsoft.UI.Xaml.Data;
using Microsoft.UI.Xaml.Input;
using Microsoft.UI.Xaml.Media;
using Microsoft.UI.Xaml.Navigation;

// The Blank Page item template is documented at http://go.microsoft.com/fwlink/?LinkId=402352&clcid=0x409

namespace Uno.DebugRainbows.Sample;

	/// <summary>
	/// An empty page that can be used on its own or navigated to within a Frame.
	/// </summary>
	public sealed partial class MainPage : Page
	{
		private ToggleButton _selectedItem;

		public MainPage()
		{
			this.InitializeComponent();
		}

		private void OnRainbowsChecked(object sender, RoutedEventArgs e)
		{
			TryPerformNavigation<RainbowPage>(sender as ToggleButton);
			OnToggleButtonChecked(sender, e);
		}
		private void OnGridChecked(object sender, RoutedEventArgs e)
		{
			TryPerformNavigation<GridPage>(sender as ToggleButton);
			OnToggleButtonChecked(sender, e);
		}
		private void OnInverseGridChecked(object sender, RoutedEventArgs e)
		{
			TryPerformNavigation<InverseGridPage>(sender as ToggleButton);
			OnToggleButtonChecked(sender, e);
		}
		private void OnTomatoChecked(object sender, RoutedEventArgs e)
		{
			TryPerformNavigation<TomatoPage>(sender as ToggleButton);
			OnToggleButtonChecked(sender, e);
		}

		private void OnToggleButtonChecked(object sender, RoutedEventArgs e)
		{
			if (sender is not ToggleButton toggleButton)
			{
				return;
			}

			_selectedItem = toggleButton;

			foreach (var child in BottomNavGrid.Children.Where(c => c != _selectedItem))
			{
				if (child is ToggleButton childToggle && child != toggleButton)
				{
					childToggle.IsChecked = false;
				}
			}
		}

		private void ToggleButton_Unchecked(object sender, RoutedEventArgs e)
		{
			if (sender is not ToggleButton toggleButton)
			{
				return;
			}

			if (toggleButton == _selectedItem)
			{
				toggleButton.IsChecked = true;
			}
		}

		private bool TryPerformNavigation<T>(ToggleButton navItem) where T : Page
		{
			if (navItem == _selectedItem)
			{
				return false;
			}

			ShellFrame.Navigate(typeof(T));
			return true;
		}

	}
