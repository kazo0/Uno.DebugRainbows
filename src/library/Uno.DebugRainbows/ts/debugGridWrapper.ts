
namespace Uno.DebugRainbows {
	export interface IDebugGridWrapper {
		horizontalItemSize: number;
		verticalItemSize: number;
		majorGridLineInterval: number;
		majorGridLineBrush: string;
		gridLineBrush: string;
		majorGridLineOpacity: number;
		gridLineOpacity: number;
		majorGridLineWidth: number;
		gridLineWidth: number;
		inverse: boolean;
		makeGridRainbows: boolean;
		gridOrigin: number;
	}

	export class DebugGridWrapper implements IDebugGridWrapper {
		public horizontalItemSize: number;
		public verticalItemSize: number;
		public majorGridLineInterval: number;
		public majorGridLineBrush: string;
		public gridLineBrush: string;
		public majorGridLineOpacity: number;
		public gridLineOpacity: number;
		public majorGridLineWidth: number;
		public gridLineWidth: number;
		public inverse: boolean;
		public makeGridRainbows: boolean;
		public gridOrigin: number;

		public constructor(init?: Partial<DebugGridWrapper>) {
			(<any>Object).assign(this, init);
		}


		public drawGrid(canvas: HTMLCanvasElement) {
			const context = canvas.getContext("2d");

			const colors = ["#f3855b", "#fbcf93", "#fbe960", "#a0e67a", "#33c6ee", "#c652ba"];
			console.log(`${this.makeGridRainbows}`);
			if (this.inverse === true) {
				this.drawInverse(context, colors);
			} else {
				this.drawNormal(context, colors);
			}
		}

		public drawNormal(context: CanvasRenderingContext2D, colors: string[]) {
			const screenWidth = window.innerWidth;
			const screenHeight = window.innerHeight;


			if (this.gridOrigin === 1) {
				let verticalPosition = 0;
				let i = 0;
				while (verticalPosition <= window.innerHeight) {
					this.majorGridLineInterval > 0 && i % this.majorGridLineInterval == 0 ? this.setMajor(context) : this.setMinor(context);

					context.beginPath();
					context.moveTo(0, verticalPosition);
					context.lineTo(window.innerWidth, verticalPosition)
					context.stroke();

					verticalPosition += this.verticalItemSize;
					i++;
				}

				let horizontalPosition = 0;
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
			} else if (this.gridOrigin === 0) {
				let gridLinesHorizontalCenter = screenWidth / 2;
				let gridLinesVerticalCenter = screenHeight / 2;
				let amountOfVerticalLines = screenWidth / this.horizontalItemSize;
				let amountOfHorizontalLines = screenHeight / this.verticalItemSize;

				// Draw the horizontal lines.
				for (let i = 0; i < (amountOfHorizontalLines / 2); i++) {
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
				for (let i = 0; i < (amountOfVerticalLines / 2); i++) {
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
		}

		public drawInverse(context: CanvasRenderingContext2D, colors: string[]) {
			const screenWidth = window.innerWidth;
			const screenHeight = window.innerHeight;

			context.lineWidth = 0;
			context.fillStyle = this.gridLineBrush;

			if (this.gridOrigin === 1) {
				let horizontalTotal = 0;
				for (let i = 1; horizontalTotal < screenWidth; i++) {
					let verticalTotal = 0;
					let horizontalSpacerSize = this.majorGridLineInterval > 0 && i % this.majorGridLineInterval == 0 ? this.majorGridLineWidth : this.gridLineWidth;

					for (let j = 1; verticalTotal < screenHeight; j++) {
						let verticalSpacerSize = this.majorGridLineInterval > 0 && j % this.majorGridLineInterval == 0 ? this.majorGridLineWidth : this.gridLineWidth;

						if (this.makeGridRainbows === true) {
							let color = colors[(i + j) % colors.length];
							context.fillStyle = color;
						}
						context.fillRect(horizontalTotal, verticalTotal, horizontalTotal + this.horizontalItemSize, verticalTotal + this.verticalItemSize)

						verticalTotal += (this.verticalItemSize + verticalSpacerSize);
					}

					horizontalTotal += (this.horizontalItemSize + horizontalSpacerSize);
				}
			} else if (this.gridOrigin === 0) {
				let horizontalRightTotal = (screenWidth / 2) + ((this.majorGridLineInterval > 0 ? this.majorGridLineWidth : this.gridLineWidth) / 2);
				let horizontalLeftTotal = (screenWidth / 2) - (this.horizontalItemSize + ((this.majorGridLineInterval > 0 ? this.majorGridLineWidth : this.gridLineWidth) / 2));

				for (let i = 1; horizontalRightTotal < screenWidth; i++) {
					let horizontalSpacerSize = this.majorGridLineInterval > 0 && i % this.majorGridLineInterval == 0 ? this.majorGridLineWidth : this.gridLineWidth;
					let verticalBottomTotal = (screenHeight / 2) + ((this.majorGridLineInterval > 0 ? this.majorGridLineWidth : this.gridLineWidth) / 2);
					let verticalTopTotal = (screenHeight / 2) - (this.verticalItemSize + ((this.majorGridLineInterval > 0 ? this.majorGridLineWidth : this.gridLineWidth) / 2));

					for (let j = 1; verticalBottomTotal < screenHeight; j++) {
						if (this.makeGridRainbows === true) {
							let color = colors[(i + j) % colors.length];
							context.fillStyle = color;
						}

						let verticalSpacerSize = this.majorGridLineInterval > 0 && j % this.majorGridLineInterval == 0 ? this.majorGridLineWidth : this.gridLineWidth;

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
		}

		private setMajor(context: CanvasRenderingContext2D) {
			context.lineWidth = this.majorGridLineWidth;
			context.strokeStyle = this.majorGridLineBrush;
		}

		private setMinor(context: CanvasRenderingContext2D) {
			context.lineWidth = this.gridLineWidth;
			context.strokeStyle = this.gridLineBrush;
		}
	}
}