class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        placeQueen(new int[n][n], 0, new HashSet<>(), new HashSet<>(), new HashSet<>());
        return res;
    }
    
    public void placeQueen(int[][] board, int i, Set<Integer> diagonal, Set<Integer> diagonal2, Set<Integer> vertical)
    {
        if(i == board.length)
        {
            addToList(board);       // Calls the function that adds string
            return;
        }
        
        for(int j = 0; j < board.length; j++)
        {
            if(!diagonal.contains(j + i) && !diagonal2.contains(j - i) && !vertical.contains(j))
            {
                board[i][j] = 1;
                diagonal.add(j + i);
                diagonal2.add(j - i);
                vertical.add(j);
                placeQueen(board, i + 1, diagonal, diagonal2, vertical);
                board[i][j] = 0;
                diagonal.remove(j + i);
                diagonal2.remove(j - i);
                vertical.remove(j);
            }
        }
    }
    
    public void addToList(int[][] board)
    {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < board.length; i++)
        {
            String temp = "";
            for(int j = 0; j < board.length; j++)
            {
                if(board[i][j] == 0) temp += ".";
                else temp += "Q";
            }
            list.add(temp);
        }
        res.add(list);
    }
}
