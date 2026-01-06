class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for(int row = 0 ; row < 9 ; row++){
            for(int cols = 0 ; cols < 9 ; cols++){
                char num = board[row][cols];
                if(num == '.') continue; 
                if(!set.add(num + "in rows" + row)) return false;
                if(!set.add(num + "in cols" + cols)) return false;
                if(!set.add(num + "in box" + (row/3) + "-" + (cols/3))) return false;
            }
        }
        return true;
    }
}