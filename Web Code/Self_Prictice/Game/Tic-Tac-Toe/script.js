document.addEventListener("DOMContentLoaded", function () {
    const board = document.getElementById("board");
    const cells = document.querySelectorAll(".cell");
    const message = document.getElementById("message");
    const resultScreen = document.getElementById("resultScreen");
    const resultMessage = document.getElementById("resultMessage");
    const restartBtn = document.getElementById("restartBtn");
    const newGameBtn = document.getElementById("newGameBtn");
  
    let currentPlayer = "X";
    let gameBoard = ["", "", "", "", "", "", "", "", ""];
    let gameActive = true;
  
    function checkWinner() {
      const winPatterns = [
        [0, 1, 2],
        [3, 4, 5],
        [6, 7, 8],
        [0, 3, 6],
        [1, 4, 7],
        [2, 5, 8],
        [0, 4, 8],
        [2, 4, 6]
      ];
  
      for (let pattern of winPatterns) {
        const [a, b, c] = pattern;
        if (
          gameBoard[a] &&
          gameBoard[a] === gameBoard[b] &&
          gameBoard[a] === gameBoard[c]
        ) {
          return gameBoard[a];
        }
      }
  
      return null;
    }
  
    function checkDraw() {
      return !gameBoard.includes("");
    }
  
    function showResultScreen(result) {
      resultMessage.innerText =
        result === "draw" ? "It's a draw!" : `Player ${result} wins!`;
      resultScreen.style.display = "flex";
    }
  
    function handleClick(index) {
      if (!gameBoard[index] && gameActive) {
        gameBoard[index] = currentPlayer;
        cells[index].innerText = currentPlayer;
  
        const winner = checkWinner();
        if (winner) {
          showResultScreen(winner);
          gameActive = false;
        } else if (checkDraw()) {
          showResultScreen("draw");
          gameActive = false;
        } else {
          currentPlayer = currentPlayer === "X" ? "O" : "X";
        }
      }
    }
  
    function restartGame() {
      gameBoard = ["", "", "", "", "", "", "", "", ""];
      gameActive = true;
      currentPlayer = "X";
      resultScreen.style.display = "none";
      resultMessage.innerText = "";
      cells.forEach((cell) => {
        cell.innerText = "";
      });
    }
  
    cells.forEach((cell, index) => {
      cell.addEventListener("click", () => handleClick(index));
    });
  
    restartBtn.addEventListener("click", restartGame);
    newGameBtn.addEventListener("click", restartGame);
  });
  