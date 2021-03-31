class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> minInRow = new ArrayList<>();
        List<Integer> maxInCol = new ArrayList<>();
       
        for(int i = 0; i < matrix.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
            minInRow.add(min);
        }
        
        for(int i = 0; i < matrix[0].length; i++){
            List<Integer> l = new ArrayList<>();
            for(int j = 0; j < matrix.length; j++){
                l.add(matrix[j][i]);
            }
            int max = Collections.max(l);
            maxInCol.add(max);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < minInRow.size(); i++){
            int k = minInRow.get(i);
            for(int j = 0; j < maxInCol.size(); j++){
                int m = maxInCol.get(j);
                if(k == m){
                    list.add(k);
                    break;
                }
            }
        }
        return list;
    }
}