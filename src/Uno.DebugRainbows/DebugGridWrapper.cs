using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Media;

namespace Uno.DebugRainbows
{
	
	public partial class DebugGridWrapper : Grid
	{
		public double HorizontalItemSize { get; set; }
		public double VerticalItemSize { get; set; }

		public int MajorGridLineInterval { get; set; }
		public SolidColorBrush MajorGridLineBrush { get; set; }
		public SolidColorBrush GridLineBrush { get; set; }
		public double MajorGridLineOpacity { get; set; }
		public double GridLineOpacity { get; set; }
		public double MajorGridLineWidth { get; set; }
		public double GridLineWidth { get; set; }
		public bool Inverse { get; set; }
		public bool MakeGridRainbows { get; set; }
		public DebugGridOrigin GridOrigin { get; set; }


		partial void PartialCtor();
		public DebugGridWrapper()
		{
			IsHitTestVisible = false;
			PartialCtor();
		}
	}
}
