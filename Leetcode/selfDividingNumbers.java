class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int n = left; n <= right; n++){
            boolean val = selfDivide(n);
            if(val == true){
                list.add(n);
            }
        }
        return list;
    }
    
    public boolean selfDivide(int num){
        int temp = num;
        while(temp != 0){
            int k = temp % 10;
            if(k == 0){
                return false;
            }
            else if(num % k != 0){
                return false;
            }
            temp = temp / 10;
        }
        return true;
    }
}