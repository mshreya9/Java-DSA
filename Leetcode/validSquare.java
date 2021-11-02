class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        long[] distances = new long[] {distance(p1, p2), distance(p1, p3), distance(p1, p4),
                                      distance(p2, p4), distance(p2, p3), distance(p3, p4)};
        
        long sides = Integer.MAX_VALUE, diag = 0, count = 0;
        
        for(long dist : distances){
            diag = Math.max(diag, dist);
            sides = Math.min(sides, dist);
        }
        
        for (long dist : distances) {
            if (dist == diag) {
                count++;
            } 
            else if (dist != sides) {
                return false;
            }
        }
        return count == 2;
    }
    
    private long distance(int[] p1, int[] p2){
        return (long) Math.pow(p1[0] - p2[0], 2) + (long) Math.pow(p1[1] - p2[1], 2);
    }
}