#if __ANDROID__
using Android.App;
using Android.Content;
using Android.Graphics;
using Android.Util;
using Android.Views;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Uno.UI;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Media;

namespace Uno.DebugRainbows
{
    //The following code has been modified, but mostly left as is, from https://github.com/sthewissen/Xamarin.Forms.DebugRainbows
    partial class DebugGridWrapper
    {
        private int screenWidth;
        private int screenHeight;

        partial void PartialCtor()
        {
            SetWillNotDraw(false);
            Init(); 
        }

        public void Init()
        {
            GetScreenDimensions();
        }

        private void GetScreenDimensions()
        {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity)Context).WindowManager.DefaultDisplay.GetMetrics(displayMetrics);
            screenWidth = displayMetrics.WidthPixels;
            screenHeight = displayMetrics.HeightPixels;
        }

        protected override void OnDraw(Android.Graphics.Canvas canvas)
        {
            base.OnDraw(canvas);

            var majorPaint = new Paint();
            var minorPaint = new Paint();

            var colors = new[] {
                Color.ParseColor("#f3855b"),
                Color.ParseColor("#fbcf93"),
                Color.ParseColor("#fbe960"),
                Color.ParseColor("#a0e67a"),
                Color.ParseColor("#33c6ee"),
                Color.ParseColor("#c652ba")
            };

            // Make these into true pixels from DP.
            HorizontalItemSize = ViewHelper.LogicalToPhysicalPixels(HorizontalItemSize);
            VerticalItemSize = ViewHelper.LogicalToPhysicalPixels(VerticalItemSize);
            MajorGridLineWidth = ViewHelper.LogicalToPhysicalPixels(MajorGridLineWidth);
            GridLineWidth = ViewHelper.LogicalToPhysicalPixels(GridLineWidth);

            if (Inverse)
            {
                DrawInverse(canvas, majorPaint, colors);
            }
            else
            {
                if (MakeGridRainbows)
                {
                    var a = canvas.Width * Math.Pow(Math.Sin(2 * Math.PI * ((90 + 0.75) / 2)), 2);
                    var b = canvas.Height * Math.Pow(Math.Sin(2 * Math.PI * ((90 + 0.0) / 2)), 2);
                    var c = canvas.Width * Math.Pow(Math.Sin(2 * Math.PI * ((90 + 0.25) / 2)), 2);
                    var d = canvas.Height * Math.Pow(Math.Sin(2 * Math.PI * ((90 + 0.5) / 2)), 2);

                    var locations = new float[] { 0, 0.2f, 0.4f, 0.6f, 0.8f, 1 };
                    var shader = new LinearGradient(canvas.Width - (float)a, (float)b, canvas.Width - (float)c, (float)d, colors.Select(x => (int)x.ToArgb()).ToArray(), locations, Shader.TileMode.Clamp);

                    minorPaint.SetShader(shader);
                    majorPaint.SetShader(shader);
                }

                DrawNormal(canvas, majorPaint, minorPaint);
            }
        }

        private void DrawNormal(Android.Graphics.Canvas canvas, Paint majorPaint, Paint minorPaint)
        {
            majorPaint.StrokeWidth = (float)MajorGridLineWidth;
            majorPaint.Color = MajorGridLineBrush.Color;
            majorPaint.Alpha = (int)(255 * MajorGridLineOpacity);

            minorPaint.StrokeWidth = (float)GridLineWidth;
            minorPaint.Color = GridLineBrush.Color;
            minorPaint.Alpha = (int)(255 * GridLineOpacity);

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
                        startX: 0,
                        startY: gridLinesVerticalCenter + (i * (float)VerticalItemSize),
                        stopX: screenWidth,
                        stopY: gridLinesVerticalCenter + (i * (float)VerticalItemSize),
                        paint: MajorGridLineInterval > 0 && i % MajorGridLineInterval == 0 ? majorPaint : minorPaint
                    );

                    canvas.DrawLine(
                        startX: 0,
                        startY: gridLinesVerticalCenter - (i * (float)VerticalItemSize),
                        stopX: screenWidth,
                        stopY: gridLinesVerticalCenter - (i * (float)VerticalItemSize),
                        paint: MajorGridLineInterval > 0 && i % MajorGridLineInterval == 0 ? majorPaint : minorPaint
                    );
                }

                // Draw vertical lines.
                for (int i = 0; i < (amountOfVerticalLines / 2); i++)
                {
                    canvas.DrawLine(
                        startX: gridLinesHorizontalCenter + (i * (float)HorizontalItemSize),
                        startY: 0,
                        stopX: gridLinesHorizontalCenter + (i * (float)HorizontalItemSize),
                        stopY: screenHeight,
                        paint: MajorGridLineInterval > 0 && i % MajorGridLineInterval == 0 ? majorPaint : minorPaint
                    );

                    canvas.DrawLine(
                        startX: gridLinesHorizontalCenter - (i * (float)HorizontalItemSize),
                        startY: 0,
                        stopX: gridLinesHorizontalCenter - (i * (float)HorizontalItemSize),
                        stopY: screenHeight,
                        paint: MajorGridLineInterval > 0 && i % MajorGridLineInterval == 0 ? majorPaint : minorPaint
                    );
                }
            }
        }

        private void DrawInverse(Android.Graphics.Canvas canvas, Paint majorPaint, global::Android.Graphics.Color[] colors)
        {
            majorPaint.StrokeWidth = 0;
            majorPaint.Color = GridLineBrush.Color;
            majorPaint.Alpha = (int)(255 * GridLineOpacity);

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

                        var rectangle = new Rect(
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

                        var rectangle = new Rect(horizontalRightTotal, verticalBottomTotal, (int)(horizontalRightTotal + HorizontalItemSize), (int)(verticalBottomTotal + VerticalItemSize));
                        canvas.DrawRect(rectangle, majorPaint);

                        var rectangle2 = new Rect(horizontalLeftTotal, verticalTopTotal, (int)(horizontalLeftTotal + HorizontalItemSize), (int)(verticalTopTotal + VerticalItemSize));
                        canvas.DrawRect(rectangle2, majorPaint);

                        var rectangle3 = new Rect(horizontalRightTotal, verticalTopTotal, (int)(horizontalRightTotal + HorizontalItemSize), (int)(verticalTopTotal + VerticalItemSize));
                        canvas.DrawRect(rectangle3, majorPaint);

                        var rectangle4 = new Rect(horizontalLeftTotal, verticalBottomTotal, (int)(horizontalLeftTotal + HorizontalItemSize), (int)(verticalBottomTotal + VerticalItemSize));
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
#endif