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
                console.log("" + this.makeGridRainbows);
                if (this.inverse) {
                    this.drawInverse(context, colors);
                }
                else {
                    this.drawNormal(context, colors);
                }
            };
            DebugGridWrapper.prototype.drawNormal = function (context, colors) {
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
                    for (var i = 0; i < (amountOfHorizontalLines / 2); i++) {
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
                    for (var i = 0; i < (amountOfVerticalLines / 2); i++) {
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
            DebugGridWrapper.prototype.drawInverse = function (context, colors) {
                var screenWidth = window.innerWidth;
                var screenHeight = window.innerHeight;
                context.lineWidth = 0;
                context.fillStyle = this.gridLineBrush;
                if (this.gridOrigin === 1) {
                    var horizontalTotal = 0;
                    for (var i = 1; horizontalTotal < screenWidth; i++) {
                        var verticalTotal = 0;
                        var horizontalSpacerSize = this.majorGridLineInterval > 0 && i % this.majorGridLineInterval == 0 ? this.majorGridLineWidth : this.gridLineWidth;
                        for (var j = 1; verticalTotal < screenHeight; j++) {
                            var verticalSpacerSize = this.majorGridLineInterval > 0 && j % this.majorGridLineInterval == 0 ? this.majorGridLineWidth : this.gridLineWidth;
                            if (this.makeGridRainbows === true) {
                                var color = colors[(i + j) % colors.length];
                                context.fillStyle = color;
                            }
                            context.fillRect(horizontalTotal, verticalTotal, horizontalTotal + this.horizontalItemSize, verticalTotal + this.verticalItemSize);
                            verticalTotal += (this.verticalItemSize + verticalSpacerSize);
                        }
                        horizontalTotal += (this.horizontalItemSize + horizontalSpacerSize);
                    }
                }
                else if (this.gridOrigin === 0) {
                    var horizontalRightTotal = (screenWidth / 2) + ((this.majorGridLineInterval > 0 ? this.majorGridLineWidth : this.gridLineWidth) / 2);
                    var horizontalLeftTotal = (screenWidth / 2) - (this.horizontalItemSize + ((this.majorGridLineInterval > 0 ? this.majorGridLineWidth : this.gridLineWidth) / 2));
                    for (var i = 1; horizontalRightTotal < screenWidth; i++) {
                        var horizontalSpacerSize = this.majorGridLineInterval > 0 && i % this.majorGridLineInterval == 0 ? this.majorGridLineWidth : this.gridLineWidth;
                        var verticalBottomTotal = (screenHeight / 2) + ((this.majorGridLineInterval > 0 ? this.majorGridLineWidth : this.gridLineWidth) / 2);
                        var verticalTopTotal = (screenHeight / 2) - (this.verticalItemSize + ((this.majorGridLineInterval > 0 ? this.majorGridLineWidth : this.gridLineWidth) / 2));
                        for (var j = 1; verticalBottomTotal < screenHeight; j++) {
                            if (this.makeGridRainbows === true) {
                                var color = colors[(i + j) % colors.length];
                                context.fillStyle = color;
                            }
                            var verticalSpacerSize = this.majorGridLineInterval > 0 && j % this.majorGridLineInterval == 0 ? this.majorGridLineWidth : this.gridLineWidth;
                            context.fillRect(horizontalRightTotal, verticalBottomTotal, (horizontalRightTotal + this.horizontalItemSize), (verticalBottomTotal + this.verticalItemSize));
                            context.fillRect(horizontalLeftTotal, verticalTopTotal, (horizontalLeftTotal + this.horizontalItemSize), (verticalTopTotal + this.verticalItemSize));
                            context.fillRect(horizontalRightTotal, verticalTopTotal, (horizontalRightTotal + this.horizontalItemSize), (verticalTopTotal + this.verticalItemSize));
                            context.fillRect(horizontalLeftTotal, verticalBottomTotal, (horizontalLeftTotal + this.horizontalItemSize), (verticalBottomTotal + this.verticalItemSize));
                            verticalTopTotal -= (this.verticalItemSize + verticalSpacerSize);
                            verticalBottomTotal += (this.verticalItemSize + verticalSpacerSize);
                        }
                        horizontalRightTotal += (this.horizontalItemSize + horizontalSpacerSize);
                        horizontalLeftTotal -= (this.horizontalItemSize + horizontalSpacerSize);
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