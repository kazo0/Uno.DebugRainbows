#if __WASM__
using System;
using System.Collections.Generic;
using System.Text;
using Uno.Foundation;
using Uno.UI.Runtime.WebAssembly;
using Windows.UI;
using Windows.UI.Xaml;

namespace Uno.DebugRainbows
{
	[HtmlElement("canvas")]
	partial class DebugGridWrapper
	{
		partial void PartialCtor()
		{
			Loaded += DebugGridWrapper_Loaded;
			;
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
				$"#{MajorGridLineBrush.Color.R:X2}{MajorGridLineBrush.Color.G:X2}{MajorGridLineBrush.Color.B:X2}",
				"\",gridLineBrush:\"",
				$"#{GridLineBrush.Color.R:X2}{GridLineBrush.Color.G:X2}{GridLineBrush.Color.B:X2}",
				"\",majorGridLineOpacity:",
				MajorGridLineOpacity.ToString(),
				",gridLineOpacity:",
				GridLineOpacity.ToString(),
				",majorGridLineWidth:",
				MajorGridLineWidth.ToString(),
				",gridLineWidth:",
				GridLineWidth.ToString(),
				",inverse:\"",
				Inverse.ToString(),
				"\",makeGridRainbows:\"",
				MakeGridRainbows.ToString(),
				"\",gridOrigin:",
				((int)GridOrigin).ToString(),
				"});",
				"wrapper.drawGrid(",
				"document.getElementById('",
				this.GetHtmlId(),
				"'));"
			};
			WebAssemblyRuntime.InvokeJS(string.Concat(js));
		}
	}
}
#endif