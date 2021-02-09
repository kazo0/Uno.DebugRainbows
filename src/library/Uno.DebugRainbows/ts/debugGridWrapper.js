var Uno;
(function (Uno) {
    var DebugRainbows;
    (function (DebugRainbows) {
        var DebugGridWrapper = /** @class */ (function () {
            function DebugGridWrapper(init) {
                Object.assign(this, init);
            }
            DebugGridWrapper.prototype.drawGrid = function (canvas) {
                var context = canvas.getContext("2d");
                var colors = ["#f3855b", "#fbcf93", "#fbe960", "#a0e67a", "#33c6ee", "#c652ba"];
                this.drawNormal(context);
            };
            DebugGridWrapper.prototype.drawNormal = function (context) {
                var screenWidth = window.innerWidth;
                var screenHeight = window.innerHeight;
                if (this.gridOrigin === 1) {
                    var verticalPosition = 0;
                    var i = 0;
                    while (verticalPosition <= window.innerHeight) {
                        this.majorGridLineInterval > 0 && i % this.majorGridLineInterval == 0 ? this.setMajor(context) : this.setMinor(context);
                        context.beginPath();
                        context.moveTo(0, verticalPosition);
                        context.lineTo(window.innerWidth, verticalPosition);
                        context.stroke();
                        verticalPosition += this.verticalItemSize;
                        i++;
                    }
                    var horizontalPosition = 0;
                    i = 0;
                    while (horizontalPosition <= window.innerWidth) {
                        this.majorGridLineInterval > 0 && i % this.majorGridLineInterval == 0 ? this.setMajor(context) : this.setMinor(context);
                        context.beginPath();
                        context.moveTo(horizontalPosition, 0);
                        context.lineTo(horizontalPosition, window.innerHeight);
                        context.stroke();
                        horizontalPosition += this.horizontalItemSize;
                        i++;
                    }
                }
                else if (this.gridOrigin === 0) {
                    var gridLinesHorizontalCenter = screenWidth / 2;
                    var gridLinesVerticalCenter = screenHeight / 2;
                    var amountOfVerticalLines = screenWidth / this.horizontalItemSize;
                    var amountOfHorizontalLines = screenHeight / this.verticalItemSize;
                    // Draw the horizontal lines.
                    for (i = 0; i < (amountOfHorizontalLines / 2); i++) {
                        this.majorGridLineInterval > 0 && i % this.majorGridLineInterval == 0 ? this.setMajor(context) : this.setMinor(context);
                        context.beginPath();
                        context.moveTo(0, gridLinesVerticalCenter + (i * this.verticalItemSize));
                        context.lineTo(screenWidth, gridLinesVerticalCenter + (i * this.verticalItemSize));
                        context.stroke();
                        context.beginPath();
                        context.moveTo(0, gridLinesVerticalCenter - (i * this.verticalItemSize));
                        context.lineTo(screenWidth, gridLinesVerticalCenter - (i * this.verticalItemSize));
                        context.stroke();
                    }
                    // Draw vertical lines.
                    for (i = 0; i < (amountOfVerticalLines / 2); i++) {
                        this.majorGridLineInterval > 0 && i % this.majorGridLineInterval == 0 ? this.setMajor(context) : this.setMinor(context);
                        context.beginPath();
                        context.moveTo(gridLinesHorizontalCenter + (i * this.horizontalItemSize), 0);
                        context.lineTo(gridLinesHorizontalCenter + (i * this.horizontalItemSize), screenHeight);
                        context.stroke();
                        context.beginPath();
                        context.moveTo(gridLinesHorizontalCenter - (i * this.horizontalItemSize), 0);
                        context.lineTo(gridLinesHorizontalCenter - (i * this.horizontalItemSize), screenHeight);
                        context.stroke();
                    }
                }
            };
            DebugGridWrapper.prototype.setMajor = function (context) {
                context.lineWidth = this.majorGridLineWidth;
                context.strokeStyle = this.majorGridLineBrush;
            };
            DebugGridWrapper.prototype.setMinor = function (context) {
                context.lineWidth = this.gridLineWidth;
                context.strokeStyle = this.gridLineBrush;
            };
            return DebugGridWrapper;
        }());
        DebugRainbows.DebugGridWrapper = DebugGridWrapper;
    })(DebugRainbows = Uno.DebugRainbows || (Uno.DebugRainbows = {}));
})(Uno || (Uno = {}));
//# sourceMappingURL=debugGridWrapper.js.map