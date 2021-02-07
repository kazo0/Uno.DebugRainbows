using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using Windows.UI;
using Windows.UI.ViewManagement;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Shapes;

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

		private static Brush GetGridLineBrush()
        {
#if HAS_UNO
			return SolidColorBrushHelper.Red;
#else
			return new SolidColorBrush(Colors.Red);
#endif
		}

        static partial void BuildGridPartial(Page page);

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
                        Height = content.Height,
                        Width = content.Width,
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

		private static Grid GetOverlayGrid(Page page)
        {
            var mainGrid = new Grid() { IsHitTestVisible = false };

            Grid majorGrid = BuildMajorGrid(page);
            Grid minorGrid = BuildMinorGrid(page);

            mainGrid.Children.Add(minorGrid);
            mainGrid.Children.Add(majorGrid);

            return mainGrid;
        }

        private static Grid BuildMajorGrid(Page page)
        {
            var majorGrid = new Grid
            {
                //BorderBrush = GetMajorGridLineBrush(page),
                //BorderThickness = GetMajorGridLineThickness(page),
                //Opacity = GetMajorGridLineOpacity(page),
                IsHitTestVisible = false,
            };
            var bounds = ApplicationView.GetForCurrentView().VisibleBounds;

            var majorGridCellWidth = GetHorizontalItemsSize(page) * GetMajorGridLineInterval(page);
            var majorGridCellHeight = GetVerticalItemsSize(page) * GetMajorGridLineInterval(page);

            var numFullWidthMajorGridCells = bounds.Width / majorGridCellWidth;
            var remainingMajorGridCellWidth = bounds.Width % majorGridCellWidth;

            var numFullHeightMajorGridCells = bounds.Height / majorGridCellWidth;
            var remainingMajorGridCellHeight = bounds.Height % majorGridCellWidth;


            for (int i = 0; i < numFullWidthMajorGridCells; i++)
            {
                majorGrid.ColumnDefinitions.Add(new ColumnDefinition { Width = new GridLength(majorGridCellWidth) });
            }

            if (remainingMajorGridCellWidth > 0)
            {
                majorGrid.ColumnDefinitions.Insert(0, new ColumnDefinition { Width = new GridLength(remainingMajorGridCellWidth / 2) });
                majorGrid.ColumnDefinitions.Add(new ColumnDefinition { Width = new GridLength(remainingMajorGridCellWidth / 2) });
            }

            for (int i = 0; i < numFullHeightMajorGridCells; i++)
            {
                majorGrid.RowDefinitions.Add(new RowDefinition { Height = new GridLength(majorGridCellHeight) });
            }

            if (remainingMajorGridCellHeight > 0)
            {
                majorGrid.RowDefinitions.Insert(0, new RowDefinition { Height = new GridLength(remainingMajorGridCellHeight / 2) });
                majorGrid.RowDefinitions.Add(new RowDefinition { Height = new GridLength(remainingMajorGridCellHeight / 2) });
            }


            var majorLineBrush = GetMajorGridLineBrush(page);
            var majorLineWidth = GetMajorGridLineWidth(page);
            var majorOpacity = GetMajorGridLineOpacity(page);

            for (int row = 0; row < majorGrid.RowDefinitions.Count; row++)
            {
                for (int col = 0; col < majorGrid.ColumnDefinitions.Count; col++)
                {
                    var rect = new Rectangle
                    {
                        StrokeThickness = majorLineWidth / 2,
                        Opacity = majorOpacity,
                    };

                    if (GetInverse(page))
                    {
                        rect.Fill = majorLineBrush;
                        rect.Stroke = new SolidColorBrush(Colors.Transparent);
                    }
                    else
                    {
                        rect.Stroke = majorLineBrush;

                    }

                    majorGrid.Children.Add(rect);
                    Grid.SetRow(rect, row);
                    Grid.SetColumn(rect, col);
                }
            }

            return majorGrid;
        }

        private static Grid BuildMinorGrid(Page page)
        {
            var minorGrid = new Grid
            {
                //BorderBrush = GetMajorGridLineBrush(page),
                //BorderThickness = GetMajorGridLineThickness(page),
                //Opacity = GetMajorGridLineOpacity(page),
                IsHitTestVisible = false,
            };
            var bounds = ApplicationView.GetForCurrentView().VisibleBounds;

            var minorGridCellWidth = GetHorizontalItemsSize(page);
            var minorGridCellHeight = GetVerticalItemsSize(page);

            var numFullWidthMinorGridCells = bounds.Width / minorGridCellWidth;
            var remainingMinorGridCellWidth = bounds.Width % minorGridCellWidth;

            var numFullHeightMinorGridCells = bounds.Height / minorGridCellHeight;
            var remainingMinorGridCellHeight = bounds.Height % minorGridCellHeight;


            for (int i = 0; i < numFullWidthMinorGridCells; i++)
            {
                minorGrid.ColumnDefinitions.Add(new ColumnDefinition { Width = new GridLength(minorGridCellWidth) });
            }

            if (remainingMinorGridCellWidth > 0)
            {
                minorGrid.ColumnDefinitions.Insert(0, new ColumnDefinition { Width = new GridLength(remainingMinorGridCellWidth / 2) });
                minorGrid.ColumnDefinitions.Add(new ColumnDefinition { Width = new GridLength(remainingMinorGridCellWidth / 2) });
            }

            for (int i = 0; i < numFullHeightMinorGridCells; i++)
            {
                minorGrid.RowDefinitions.Add(new RowDefinition { Height = new GridLength(minorGridCellHeight) });
            }

            if (remainingMinorGridCellHeight > 0)
            {
                minorGrid.RowDefinitions.Insert(0, new RowDefinition { Height = new GridLength(remainingMinorGridCellHeight / 2) });
                minorGrid.RowDefinitions.Add(new RowDefinition { Height = new GridLength(remainingMinorGridCellHeight / 2) });
            }


            var lineBrush = GetGridLineBrush(page);
            var lineWidth = GetGridLineWidth(page);
            var opacity = GetGridLineOpacity(page);

            for (int row = 0; row < minorGrid.RowDefinitions.Count; row++)
            {
                for (int col = 0; col < minorGrid.ColumnDefinitions.Count; col++)
                {
                    var rect = new Rectangle
                    {
                        StrokeThickness = lineWidth / 2,
                        Opacity = opacity,
                    };

                    if (GetInverse(page))
                    {
                        rect.Fill = lineBrush;
                        rect.Stroke = new SolidColorBrush(Colors.Transparent);
                    }
                    else
                    {
                        rect.Stroke = lineBrush;

                    }

                    minorGrid.Children.Add(rect);
                    Grid.SetRow(rect, row);
                    Grid.SetColumn(rect, col);
                }
            }

            return minorGrid;
        }
    }
}
