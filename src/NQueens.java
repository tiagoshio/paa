static final int N = 4;

void printSolution(int[][] board) {
    for(int i = 0; i < N; i++) {
        for(int j = 0; j < N; j++) {
            if(board[i][j] == 1) {
                IO.print("Q ");
            } else {
                IO.print(". ");
            }
        }
        IO.println();
    }
}

boolean isSafe(int[][] board, int row, int col) {
    for(int i = 0; i < N; i++) {
        if(board[row][i] == 1) {
            return false;
        }
    }

    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        if (board[i][j] == 1) return false;
    }

    for (int i = row + 1, j = col - 1; i < N && j >= 0; i++, j--) {
        if (board[i][j] == 1) return false;
    }

    return true;
}

boolean solveNQueens(int[][] board, int col) {
    if(col >= N) {
        return true;
    }

    for(int i = 0; i < N; i++) {
        if(isSafe(board, i, col)) {
            board[i][col] = 1;
            if(solveNQueens(board, col + 1)) {
                return true;
            }
            board[i][col] = 0;
        }
    }

    return false;
}

void main() {
    int[][] board = new int[N][N];
    solveNQueens(board, 0);
    printSolution(board);
}