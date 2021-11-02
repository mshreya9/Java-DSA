class Solution {
    public void setZeroes(int[][] matrix) {
        List<Pair> list = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    list.add(new Pair(i, j));
                }
            }
        }
        
        for(Pair p : list){
            makeZero(matrix, p.row, p.col);
        }
    }
    
    private void makeZero(int[][] matrix, int row, int col){
        //make row zero
        for(int j = 0; j < matrix[row].length; j++){
            matrix[row][j] = 0;
        }  
           
        //make col zero
        for(int i = 0; i < matrix.length; i++){
            matrix[i][col] = 0;
        }  
    }
}

class Pair{
    int row;
    int col;
    
    public Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}