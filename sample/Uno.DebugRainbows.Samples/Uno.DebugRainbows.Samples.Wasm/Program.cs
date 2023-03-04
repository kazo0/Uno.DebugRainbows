using System;
using Microsoft.UI.Xaml;

namespace Uno.DebugRainbows.Samples.Wasm
{
	public sealed class Program
	{
		private static App _app;

		static int Main(string[] args)
		{
			Microsoft.UI.Xaml.Application.Start(_ => _app = new AppHead());

			return 0;
		}
	}
}
