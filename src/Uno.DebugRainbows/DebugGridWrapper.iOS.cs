#if __IOS__
using CoreAnimation;
using CoreGraphics;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using UIKit;
using Windows.UI;

namespace Uno.DebugRainbows
{
    //The following code has been modified, but mostly left as is, from https://github.com/sthewissen/Xamarin.Forms.DebugRainbows
    partial class DebugGridWrapper
    {
        private CALayer _gridLayer;
        private CALayer _majorGridLayer;

        private CGColor[] rainbowColors = {
                        Color.FromArgb(255,243,133,91),
                        Color.FromArgb(255,251,207,147),
                        Color.FromArgb(255,251,233,96),
                        Color.FromArgb(255,160,230,122),
                        Color.FromArgb(255,51,198,238),
                        Color.FromArgb(255,198,82,186),
                        Color.FromArgb(255,239,83,178)
                    };

        partial void PartialCtor()
        {
            BackgroundColor = UIColor.Clear;
            ContentMode = UIViewContentMode.Redraw;
        }


        private void DrawGrid(CGRect rect)
        {
            if (Inverse)
            {
                DrawInverseGridLayer(rect);
            }
            else
            {
                DrawNormalGridLayer(_gridLayer, false);
                DrawNormalGridLayer(_majorGridLayer, true);
            }
        }

        private void DrawInverseGridLayer(CGRect rect)
        {
            var context = UIGraphics.GetCurrentContext();

            context.SetFillColor(GridLineBrush.Color);
            context.SetAlpha((nfloat)GridLineOpacity);

            if (GridOrigin == DebugGridOrigin.TopLeft)
            {
                var horizontalTotal = 0;

                for (int i = 1; horizontalTotal < Bounds.Size.Width; i++)
                {
                    var verticalTotal = 0;
                    var horizontalSpacerSize = MajorGridLineInterval > 0 && i % MajorGridLineInterval == 0 ? MajorGridLineWidth : GridLineWidth;

                    for (int j = 1; verticalTotal < Bounds.Size.Height; j++)
                    {
                        var verticalSpacerSize = MajorGridLineInterval > 0 && j % MajorGridLineInterval == 0 ? MajorGridLineWidth : GridLineWidth;
                        var rectangle = new CGRect(horizontalTotal, verticalTotal, HorizontalItemSize, VerticalItemSize);

                        if (MakeGridRainbows)
                        {
                            var color = rainbowColors[(i + j) % rainbowColors.Length];
                            context.SetFillColor(color);
                        }

                        context.FillRect(rectangle);

                        verticalTotal += (int)(VerticalItemSize + verticalSpacerSize);
                    }

                    horizontalTotal += (int)(HorizontalItemSize + horizontalSpacerSize);
                }
            }
            else if (GridOrigin == DebugGridOrigin.Center)
            {
                var horizontalRightTotal = (Bounds.Size.Width / 2) + ((MajorGridLineInterval > 0 ? MajorGridLineWidth : GridLineWidth) / 2);
                var horizontalLeftTotal = (Bounds.Size.Width / 2) - (int)(HorizontalItemSize + ((MajorGridLineInterval > 0 ? MajorGridLineWidth : GridLineWidth) / 2));

                for (int i = 1; horizontalRightTotal < Bounds.Size.Width; i++)
                {
                    var horizontalSpacerSize = MajorGridLineInterval > 0 && i % MajorGridLineInterval == 0 ? MajorGridLineWidth : GridLineWidth;
                    var verticalBottomTotal = (Bounds.Size.Height / 2) + ((MajorGridLineInterval > 0 ? MajorGridLineWidth : GridLineWidth) / 2);
                    var verticalTopTotal = (Bounds.Size.Height / 2) - (int)(VerticalItemSize + ((MajorGridLineInterval > 0 ? MajorGridLineWidth : GridLineWidth) / 2));

                    for (int j = 1; verticalBottomTotal < Bounds.Size.Height; j++)
                    {
                        if (MakeGridRainbows)
                        {
                            var color = rainbowColors[(i + j) % rainbowColors.Length];
                            context.SetFillColor(color);
                        }

                        var verticalSpacerSize = MajorGridLineInterval > 0 && j % MajorGridLineInterval == 0 ? MajorGridLineWidth : GridLineWidth;

                        var rectangle = new CGRect(horizontalRightTotal, verticalBottomTotal, HorizontalItemSize, VerticalItemSize);
                        context.FillRect(rectangle);

                        var rectangle2 = new CGRect(horizontalLeftTotal, verticalTopTotal, HorizontalItemSize, VerticalItemSize);
                        context.FillRect(rectangle2);

                        var rectangle3 = new CGRect(horizontalRightTotal, verticalTopTotal, HorizontalItemSize, VerticalItemSize);
                        context.FillRect(rectangle3);

                        var rectangle4 = new CGRect(horizontalLeftTotal, verticalBottomTotal, HorizontalItemSize, VerticalItemSize);
                        context.FillRect(rectangle4);

                        verticalTopTotal -= (int)(VerticalItemSize + verticalSpacerSize);
                        verticalBottomTotal += (int)(VerticalItemSize + verticalSpacerSize);
                    }

                    horizontalRightTotal += (int)(HorizontalItemSize + horizontalSpacerSize);
                    horizontalLeftTotal -= (int)(HorizontalItemSize + horizontalSpacerSize);
                }
            }
        }

        private void DrawNormalGridLayer(CALayer layer, bool isMajor)
        {
            if (isMajor && MajorGridLineInterval == 0)
                return;

            using (var path = CreatePath(isMajor ? MajorGridLineInterval : 0))
            {
                layer = new CAShapeLayer
                {
                    LineWidth = isMajor ? (nfloat)MajorGridLineWidth : (nfloat)GridLineWidth,
                    Path = path.CGPath,
                    StrokeColor = isMajor ? MajorGridLineBrush.Color : GridLineBrush.Color,
                    Opacity = isMajor ? (float)MajorGridLineOpacity : (float)GridLineOpacity,
                    Frame = new CGRect(0, 0, Bounds.Size.Width, Bounds.Size.Height)
                };

                if (!MakeGridRainbows)
                {
                    this.Layer.AddSublayer(layer);
                }
                else
                {
                    var gradientLayer = new CAGradientLayer
                    {
                        StartPoint = new CGPoint(0.5, 0.0),
                        EndPoint = new CGPoint(0.5, 1.0),
                        Frame = new CGRect(0, 0, Bounds.Size.Width, Bounds.Size.Height),
                        Colors = rainbowColors,
                        Mask = layer
                    };

                    this.Layer.AddSublayer(gradientLayer);
                }
            }
        }

        private UIBezierPath CreatePath(int interval = 0)
        {
            var path = new UIBezierPath();
            var gridLinesHorizontal = Bounds.Width / HorizontalItemSize;
            var gridLinesVertical = Bounds.Height / VerticalItemSize;

            if (GridOrigin == DebugGridOrigin.TopLeft)
            {
                for (int i = 0; i < gridLinesHorizontal; i++)
                {
                    if (interval == 0 || i % interval == 0)
                    {
                        var start = new CGPoint(x: (nfloat)i * HorizontalItemSize, y: 0);
                        var end = new CGPoint(x: (nfloat)i * HorizontalItemSize, y: Bounds.Height);
                        path.MoveTo(start);
                        path.AddLineTo(end);
                    }
                }

                for (int i = 0; i < gridLinesVertical; i++)
                {
                    if (interval == 0 || i % interval == 0)
                    {
                        var start = new CGPoint(x: 0, y: (nfloat)i * VerticalItemSize);
                        var end = new CGPoint(x: Bounds.Width, y: (nfloat)i * VerticalItemSize);
                        path.MoveTo(start);
                        path.AddLineTo(end);
                    }
                }

                path.ClosePath();
            }
            else if (GridOrigin == DebugGridOrigin.Center)
            {
                var gridLinesHorizontalCenter = Bounds.Width / 2;
                var gridLinesVerticalCenter = Bounds.Height / 2;

                for (int i = 0; i < (gridLinesHorizontal / 2); i++)
                {
                    if (interval == 0 || i % interval == 0)
                    {
                        var startRight = new CGPoint(x: gridLinesHorizontalCenter + ((nfloat)i * HorizontalItemSize), y: 0);
                        var endRight = new CGPoint(x: gridLinesHorizontalCenter + ((nfloat)i * HorizontalItemSize), y: Bounds.Height);
                        path.MoveTo(startRight);
                        path.AddLineTo(endRight);

                        var startLeft = new CGPoint(x: gridLinesHorizontalCenter - ((nfloat)i * HorizontalItemSize), y: 0);
                        var endLeft = new CGPoint(x: gridLinesHorizontalCenter - ((nfloat)i * HorizontalItemSize), y: Bounds.Height);
                        path.MoveTo(startLeft);
                        path.AddLineTo(endLeft);
                    }
                }

                for (int i = 0; i < (gridLinesVertical / 2); i++)
                {
                    if (interval == 0 || i % interval == 0)
                    {
                        var startBottom = new CGPoint(x: 0, y: gridLinesVerticalCenter + ((nfloat)i * VerticalItemSize));
                        var endBottom = new CGPoint(x: Bounds.Width, y: gridLinesVerticalCenter + ((nfloat)i * VerticalItemSize));
                        path.MoveTo(startBottom);
                        path.AddLineTo(endBottom);

                        var startTop = new CGPoint(x: 0, y: gridLinesVerticalCenter - ((nfloat)i * VerticalItemSize));
                        var endTop = new CGPoint(x: Bounds.Width, y: gridLinesVerticalCenter - ((nfloat)i * VerticalItemSize));
                        path.MoveTo(startTop);
                        path.AddLineTo(endTop);
                    }
                }
            }

            return path;
        }

        public override void Draw(CGRect rect)
        {
            DrawGrid(rect);
        }
    }
}
#endif