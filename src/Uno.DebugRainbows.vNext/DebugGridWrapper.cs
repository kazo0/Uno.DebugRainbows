using SkiaSharp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Windows.Foundation;
using Windows.Graphics.Display;
using Microsoft.UI;
using Microsoft.UI.Xaml.Media;
using SkiaSharp.Views.Windows;

namespace Uno.DebugRainbows
{
	public partial class DebugGridWrapper : SKXamlCanvas
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

		protected override void OnPaintSurface(SKPaintSurfaceEventArgs e)
		{
			var canvas = e.Surface.Canvas;
			var info = e.Info;
			var size = new Size(info.Width, info.Height);

			var display = DisplayInformation.GetForCurrentView();
			var scale = display.LogicalDpi / 96.0f;
			var scaledSize = new SKSize((float)size.Width / scale, (float)size.Height / scale);

			// handle the device screen density
			canvas.Scale(scale);

			// make sure the canvas is blank
			canvas.Clear();

			var majorPaint = new SKPaint();
			var minorPaint = new SKPaint();

			var colors = new[] {
				SKColor.Parse("#f3855b"),
				SKColor.Parse("#fbcf93"),
				SKColor.Parse("#fbe960"),
				SKColor.Parse("#a0e67a"),
				SKColor.Parse("#33c6ee"),
				SKColor.Parse("#c652ba"),
			};

			if (Inverse)
			{
				DrawInverse(canvas, scaledSize, majorPaint, colors);
			}
			else
			{
				if (MakeGridRainbows)
				{
					var a = scaledSize.Width * Math.Pow(Math.Sin(2 * Math.PI * ((90 + 0.75) / 2)), 2);
					var b = scaledSize.Height * Math.Pow(Math.Sin(2 * Math.PI * ((90 + 0.0) / 2)), 2);
					var c = scaledSize.Width * Math.Pow(Math.Sin(2 * Math.PI * ((90 + 0.25) / 2)), 2);
					var d = scaledSize.Height * Math.Pow(Math.Sin(2 * Math.PI * ((90 + 0.5) / 2)), 2);

					var locations = new float[] { 0, 0.2f, 0.4f, 0.6f, 0.8f, 1 };

					var shader = SKShader.CreateLinearGradient(
						start: new SKPoint(scaledSize.Width - (float)a, (float)b),
						end: new SKPoint(scaledSize.Width - (float)c, (float)d),
						colors: colors,
						colorPos: locations,
						mode: SKShaderTileMode.Clamp
					);

					minorPaint.Shader = shader;
					majorPaint.Shader = shader;
				}

				DrawNormal(canvas, scaledSize, majorPaint, minorPaint);
			}
		}

		private void DrawNormal(SKCanvas canvas, SKSize scaledSize, SKPaint majorPaint, SKPaint minorPaint)
		{
			var screenWidth = scaledSize.Width;
			var screenHeight = scaledSize.Height;

			majorPaint.StrokeWidth = (float)MajorGridLineWidth;
			majorPaint.Color = MajorGridLineBrush.Color.ToSKColor().WithAlpha((byte)(255 * MajorGridLineOpacity));

			minorPaint.StrokeWidth = (float)GridLineWidth;
			minorPaint.Color = GridLineBrush.Color.ToSKColor();

			if (GridOrigin == DebugGridOrigin.TopLeft)
			{
				float verticalPosition = 0;
				int i = 0;
				while (verticalPosition <= screenHeight)
				{
					canvas.DrawLine(0, verticalPosition, screenWidth, verticalPosition, MajorGridLineInterval > 0 && i % MajorGridLineInterval == 0 ? majorPaint : minorPaint);
					verticalPosition += (float)VerticalItemSize;
					i++;
				}

				float horizontalPosition = 0;
				i = 0;
				while (horizontalPosition <= screenWidth)
				{
					canvas.DrawLine(horizontalPosition, 0, horizontalPosition, screenHeight, MajorGridLineInterval > 0 && i % MajorGridLineInterval == 0 ? majorPaint : minorPaint);
					horizontalPosition += (float)HorizontalItemSize;
					i++;
				}
			}
			else if (GridOrigin == DebugGridOrigin.Center)
			{
				var gridLinesHorizontalCenter = screenWidth / 2;
				var gridLinesVerticalCenter = screenHeight / 2;
				var amountOfVerticalLines = screenWidth / HorizontalItemSize;
				var amountOfHorizontalLines = screenHeight / VerticalItemSize;

				// Draw the horizontal lines.
				for (int i = 0; i < (amountOfHorizontalLines / 2); i++)
				{
					canvas.DrawLine(
						p0: new SKPoint(0, gridLinesVerticalCenter + (i * (float)VerticalItemSize)),
						p1: new SKPoint(screenWidth, gridLinesVerticalCenter + (i * (float)VerticalItemSize)),
						paint: MajorGridLineInterval > 0 && i % MajorGridLineInterval == 0 ? majorPaint : minorPaint
					);

					canvas.DrawLine(
						p0: new SKPoint(0, gridLinesVerticalCenter - (i * (float)VerticalItemSize)),
						p1: new SKPoint(screenWidth, gridLinesVerticalCenter - (i * (float)VerticalItemSize)),
						paint: MajorGridLineInterval > 0 && i % MajorGridLineInterval == 0 ? majorPaint : minorPaint
					);
				}

				// Draw vertical lines.
				for (int i = 0; i < (amountOfVerticalLines / 2); i++)
				{
					canvas.DrawLine(
						p0: new SKPoint(gridLinesHorizontalCenter + (i * (float)HorizontalItemSize), 0),
						p1: new SKPoint(gridLinesHorizontalCenter + (i * (float)HorizontalItemSize), screenHeight),
						paint: MajorGridLineInterval > 0 && i % MajorGridLineInterval == 0 ? majorPaint : minorPaint
					);

					canvas.DrawLine(
						p0: new SKPoint(gridLinesHorizontalCenter - (i * (float)HorizontalItemSize), 0),
						p1: new SKPoint(gridLinesHorizontalCenter - (i * (float)HorizontalItemSize), screenHeight),
						paint: MajorGridLineInterval > 0 && i % MajorGridLineInterval == 0 ? majorPaint : minorPaint
					);
				}
			}
		}

		private void DrawInverse(SKCanvas canvas, SKSize scaledSize, SKPaint majorPaint, SKColor[] colors)
		{
			var screenWidth = scaledSize.Width;
			var screenHeight = scaledSize.Height;
			majorPaint.StrokeWidth = 0;
			majorPaint.Color = GridLineBrush.Color.ToSKColor().WithAlpha((byte)(255 * GridLineOpacity)); ;
			//   majorPaint.Alpha = (int)(255 * GridLineOpacity);

			if (GridOrigin == DebugGridOrigin.TopLeft)
			{
				var horizontalTotal = 0;
				for (int i = 1; horizontalTotal < screenWidth; i++)
				{
					var verticalTotal = 0;
					var horizontalSpacerSize = MajorGridLineInterval > 0 && i % MajorGridLineInterval == 0 ? MajorGridLineWidth : GridLineWidth;

					for (int j = 1; verticalTotal < screenHeight; j++)
					{
						var verticalSpacerSize = MajorGridLineInterval > 0 && j % MajorGridLineInterval == 0 ? MajorGridLineWidth : GridLineWidth;

						var rectangle = new SKRect(
							(int)horizontalTotal,
							(int)verticalTotal,
							(int)(horizontalTotal + HorizontalItemSize),
							(int)(verticalTotal + VerticalItemSize)
						);

						if (MakeGridRainbows)
						{
							var color = colors[(i + j) % colors.Length];
							majorPaint.Color = color;
						}

						canvas.DrawRect(rectangle, majorPaint);

						verticalTotal += (int)(VerticalItemSize + verticalSpacerSize);
					}

					horizontalTotal += (int)(HorizontalItemSize + horizontalSpacerSize);
				}
			}
			else if (GridOrigin == DebugGridOrigin.Center)
			{
				var horizontalRightTotal = (screenWidth / 2) + (int)((MajorGridLineInterval > 0 ? MajorGridLineWidth : GridLineWidth) / 2);
				var horizontalLeftTotal = (screenWidth / 2) - (int)(HorizontalItemSize + ((MajorGridLineInterval > 0 ? MajorGridLineWidth : GridLineWidth) / 2));

				for (int i = 1; horizontalRightTotal < screenWidth; i++)
				{
					var horizontalSpacerSize = MajorGridLineInterval > 0 && i % MajorGridLineInterval == 0 ? MajorGridLineWidth : GridLineWidth;
					var verticalBottomTotal = (screenHeight / 2) + (int)((MajorGridLineInterval > 0 ? MajorGridLineWidth : GridLineWidth) / 2);
					var verticalTopTotal = (screenHeight / 2) - (int)(VerticalItemSize + ((MajorGridLineInterval > 0 ? MajorGridLineWidth : GridLineWidth) / 2));

					for (int j = 1; verticalBottomTotal < screenHeight; j++)
					{
						if (MakeGridRainbows)
						{
							var color = colors[(i + j) % colors.Length];
							majorPaint.Color = color;
						}

						var verticalSpacerSize = MajorGridLineInterval > 0 && j % MajorGridLineInterval == 0 ? MajorGridLineWidth : GridLineWidth;

						var rectangle = new SKRect(horizontalRightTotal, verticalBottomTotal, (int)(horizontalRightTotal + HorizontalItemSize), (int)(verticalBottomTotal + VerticalItemSize));
						canvas.DrawRect(rectangle, majorPaint);

						var rectangle2 = new SKRect(horizontalLeftTotal, verticalTopTotal, (int)(horizontalLeftTotal + HorizontalItemSize), (int)(verticalTopTotal + VerticalItemSize));
						canvas.DrawRect(rectangle2, majorPaint);

						var rectangle3 = new SKRect(horizontalRightTotal, verticalTopTotal, (int)(horizontalRightTotal + HorizontalItemSize), (int)(verticalTopTotal + VerticalItemSize));
						canvas.DrawRect(rectangle3, majorPaint);

						var rectangle4 = new SKRect(horizontalLeftTotal, verticalBottomTotal, (int)(horizontalLeftTotal + HorizontalItemSize), (int)(verticalBottomTotal + VerticalItemSize));
						canvas.DrawRect(rectangle4, majorPaint);

						verticalTopTotal -= (int)(VerticalItemSize + verticalSpacerSize);
						verticalBottomTotal += (int)(VerticalItemSize + verticalSpacerSize);
					}

					horizontalRightTotal += (int)(HorizontalItemSize + horizontalSpacerSize);
					horizontalLeftTotal -= (int)(HorizontalItemSize + horizontalSpacerSize);
				}
			}
		}
	}
}
