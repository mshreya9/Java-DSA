class Solution {
    public int calPoints(String[] ops) {
        int[] scores = new int[ops.length];
        int sum = 0;
        int index = 0;
        for(int i = 0; i < ops.length; i++){
            if(ops[i].equals("+")){
                scores[index] = scores[index - 1] + scores[index - 2];
                sum += scores[index];
                index++;
            } 
            else if(ops[i].equals("D")){
                scores[index] = 2 * scores[index - 1];
                sum += scores[index];
                index++;
            } 
            else if(ops[i].equals("C")){
                sum -= scores[index - 1];
                index--;
            } 
            else {
                scores[index] = Integer.parseInt(ops[i]);
                sum += scores[index];
                index++;
            }
        }
        return sum;
    }
}