class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ini = new ArrayList<>();
        ini.add(arr[0][0]);
        ini.add(arr[0][1]);
        list.add(ini);
        int k = 0;
        int m = 1;
        int n = arr.length;
        for(int i = 1; i < n; i++){
            List<Integer> l = new ArrayList<>();
            if(list.get(k).get(m) < arr[i][0]){
                l.add(arr[i][0]);
                l.add(arr[i][1]);
                list.add(l);
                k++;
            } else{
                int x = list.get(k).get(m);
                 x = Math.max(x, arr[i][m]);
                list.get(k).set(m, x);
            }
        }
        
        int[][] ans = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }
        
        return ans;
    }
}