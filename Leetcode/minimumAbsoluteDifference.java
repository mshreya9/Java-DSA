class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < len-1; i++){
            if(arr[i+1] - arr[i] < min){
                min = arr[i+1] - arr[i];
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < len-1; i++){
            if(arr[i+1] - arr[i] == min){
                ArrayList<Integer> l = new ArrayList<>();
                l.add(arr[i]);
                l.add(arr[i+1]);
                list.add(l);
            }
        }
        return list;
    }
}