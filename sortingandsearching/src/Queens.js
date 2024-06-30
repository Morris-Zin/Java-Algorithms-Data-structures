let board = [];

for (let i = 0; i < 8; i++) {
  board[i] = Array(8).fill("0");
}

const generateRandomQueenPosition = (board) => {
  for (let i = 0; i < 5; i++) {
    const randomRow = Math.floor(Math.random() * 8);
    const randomCol = Math.floor(Math.random() * 8);
    board[randomRow][randomCol] = "Q";
  }
};

const determineCoveredSquares = (board) => {
  const coveredSquares = [];

  for (let i = 0; i < 8; i++) {
    for (let j = 0; j < 8; j++) {
      if (board[i][j] === "Q") {
        for (let k = 0; k < 8; k++) {
          coveredSquares.push([i, k]);
        }

        for (let k = 0; k < 8; k++) {
          coveredSquares.push([k, j]);
        }

        for (let k = 0; k < 8; k++) {
          coveredSquares.push([i + k, j + k]);
          coveredSquares.push([i - k, j - k]);
          coveredSquares.push([i + k, j - k]);
          coveredSquares.push([i - k, j + k]);
        }
      }
    }
  }

  return coveredSquares;
};

const isAllSquaresCovered = (board) => {
  const totalSquares = 8 * 8;
  const coveredSquares = determineCoveredSquares(board);
  const uniqueCoveredSquares = Array.from(
    new Set(coveredSquares.map(JSON.stringify))
  ).map(JSON.parse);

  return uniqueCoveredSquares.length === totalSquares;
};

let iterations = 0;

while (!isAllSquaresCovered(board)) {
  generateRandomQueenPosition(board);
  iterations++;
}

console.log("Chessboard after", iterations, "iterations:");
console.log(board);
console.log("\nAll Squares Covered:", isAllSquaresCovered(board));
