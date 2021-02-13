#if __WASM__
using System;
using System.Collections.Generic;
using System.Text;
using Uno.Foundation;
using Uno.UI.Runtime.WebAssembly;
using Windows.UI;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;

namespace Uno.DebugRainbows
{
	[HtmlElement("canvas")]
	partial class DebugGridWrapper
	{
		partial void PartialCtor()
		{
			Loaded += DebugGridWrapper_Loaded;

			this.ClearCssStyle("height", "width");
			this.SetHtmlAttribute(("height", $"{((Frame)Window.Current.Content).ActualHeight}"), ("width", $"{((Frame)Window.Current.Content).ActualWidth}"));
		}

		private void DebugGridWrapper_Loaded(object sender, RoutedEventArgs e)
		{
			var js = new string[]
			{
				"var wrapper = new Uno.DebugRainbows.DebugGridWrapper({",
				"horizontalItemSize:",
				HorizontalItemSize.ToString(),
				",verticalItemSize:",
				VerticalItemSize.ToString(),
				",majorGridLineInterval:",
				MajorGridLineInterval.ToString(),
				",majorGridLineBrush:\"",
				$"#{MajorGridLineBrush.Color.R:X2}{MajorGridLineBrush.Color.G:X2}{MajorGridLineBrush.Color.B:X2}{(int)(255 * MajorGridLineOpacity):X2}",
				"\",gridLineBrush:\"",
				$"#{GridLineBrush.Color.R:X2}{GridLineBrush.Color.G:X2}{GridLineBrush.Color.B:X2}{(int)(255 * GridLineOpacity):X2}",
				"\",majorGridLineOpacity:",
				MajorGridLineOpacity.ToString(),
				",gridLineOpacity:",
				GridLineOpacity.ToString(),
				",majorGridLineWidth:",
				MajorGridLineWidth.ToString(),
				",gridLineWidth:",
				GridLineWidth.ToString(),
				",inverse:",
				Inverse.ToString().ToLower(),
				",makeGridRainbows:",
				MakeGridRainbows.ToString().ToLower(),
				",gridOrigin:",
				((int)GridOrigin).ToString(),
				"});",
				"wrapper.drawGrid(",
				"document.getElementById('",
				this.GetHtmlId(),
				"'));"
			};
			Console.WriteLine(string.Concat(js));
			WebAssemblyRuntime.InvokeJS(string.Concat(js));
		}
	}
}
#endif