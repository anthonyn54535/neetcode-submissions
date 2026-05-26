class Solution {
    public boolean isValidSudoku(char[][] board) {
        // traverse through each column
        for(int i = 0; i < board[0].length; i++){
            Set<Character> noDup = new HashSet<>();
            for(int j = 0; j<board.length; j++){
                if(noDup.contains(board[j][i])){
                    return false;
                }else if(board[j][i]== '.'){
                    continue;
                }else{
                    noDup.add(board[j][i]);
                }
            }
        }
        // traverse through each row first
        for(int i = 0; i < board.length; i++){
            Set<Character> noDup = new HashSet<>();
            for(int j = 0; j<board[i].length; j++){
                if(noDup.contains(board[i][j])){
                    return false;
                }else if(board[i][j]=='.'){
                    continue;
                }else{
                    noDup.add(board[i][j]);
                }
            }
        }
        for (int square = 0; square < 9; square++) {
            Set<Character> noDup = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.'){
                        continue;
                    }
                    if (noDup.contains(board[row][col])){
                         return false;
                    }
                    noDup.add(board[row][col]);
                }
             }
        }
        return true;
    }
}
