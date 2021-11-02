class Solution {
    public double averageWaitingTime(int[][] customers) {
        double prevsum = customers[0][0] + customers[0][1];
        double wait = 0;
        for(int i = 1; i < customers.length; i++){
            if(customers[i][0] < prevsum){
                prevsum = prevsum + customers[i][1];
                wait = wait + (prevsum - customers[i][0]);
            } else {
                prevsum = customers[i][0] + customers[i][1];
                wait = wait + customers[i][1];
            }
           
        }
        
        return (customers[0][1] + wait) / customers.length;
    }
}