public class _0999_Available_Captures_for_Rook {
    public static int numRookCaptures(char[][] board) {
        int[] indexOfRook = new int[2];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    indexOfRook[0] = i;
                    indexOfRook[1] = j;
                    break;
                }
            }
        }
        int result = 0;

        for (int i = indexOfRook[0]; i >= 0; i--) {
            if (board[i][indexOfRook[1]] == 'B') {
                break;
            } else if (board[i][indexOfRook[1]] == 'p') {
                result++;
                break;
            }
        }

        for (int i = indexOfRook[0]; i < 8; i++) {
            if (board[i][indexOfRook[1]] == 'B') {
                break;
            } else if (board[i][indexOfRook[1]] == 'p') {
                result++;
                break;
            }
        }

        for (int i = indexOfRook[1]; i >= 0; i--) {
            if (board[indexOfRook[0]][i] == 'B') {
                break;
            } else if (board[indexOfRook[0]][i] == 'p') {
                result++;
                break;
            }
        }

        for (int i = indexOfRook[1]; i < 8; i++) {
            if (board[indexOfRook[0]][i] == 'B') {
                break;
            } else if (board[indexOfRook[0]][i] == 'p') {
                result++;
                break;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        char[][] board1 = {{'.', '.', '.', '.', '.', '.', '.', '.'
        }, {'.', '.', '.', 'p', '.', '.', '.', '.'
        }, {'.', '.', '.', 'R', '.', '.', '.', 'p'
        }, {'.', '.', '.', '.', '.', '.', '.', '.'
        }, {'.', '.', '.', '.', '.', '.', '.', '.'
        }, {'.', '.', '.', 'p', '.', '.', '.', '.'
        }, {'.', '.', '.', '.', '.', '.', '.', '.'
        }, {'.', '.', '.', '.', '.', '.', '.', '.'
        }};
        System.out.println(numRookCaptures(board1));

        char[][] board2 = {{'.', '.', '.', '.', '.', '.', '.', '.'
        }, {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'
        }, {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'
        }, {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'
        }, {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'
        }, {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'
        }, {'.', '.', '.', '.', '.', '.', '.', '.'
        }, {'.', '.', '.', '.', '.', '.', '.', '.'
        }};
        System.out.println(numRookCaptures(board2));

        char[][] board3 = {{'.', '.', '.', '.', '.', '.', '.', '.'
        }, {'.', '.', '.', 'p', '.', '.', '.', '.'
        }, {'.', '.', '.', 'p', '.', '.', '.', '.'
        }, {'p', 'p', '.', 'R', '.', 'p', 'B', '.'
        }, {'.', '.', '.', '.', '.', '.', '.', '.'
        }, {'.', '.', '.', 'B', '.', '.', '.', '.'
        }, {'.', '.', '.', 'p', '.', '.', '.', '.'
        }, {'.', '.', '.', '.', '.', '.', '.', '.'
        }};
        System.out.println(numRookCaptures(board3));
    }
}
