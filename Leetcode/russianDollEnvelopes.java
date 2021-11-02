class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        List<Pair> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new Pair(envelopes[i][0], envelopes[i][1]));
        }
        
        Collections.sort(list);
        
        int[] harr = new int[n];
        for(int i = 0; i < n; i++){
            harr[i] = list.get(i).height;
        }
        
        return LISBU(harr);
    }
    
    public static int LISBU(int[] arr){
        int[] le = new int[arr.length];
        le[0] = arr[0];
        int len = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > le[len-1]){
                le[len] = arr[i];
                len++;
            }
            else{
                int idx = binarySearch(le, 0, len-1, arr[i]);
                le[idx] = arr[i];
            }
        }
        return len;
    }

    public static int binarySearch(int[] le, int si, int ei, int item){
        int low = si;
        int high = ei;
        while(low <= high){
            int mid = (low + high) / 2;
            if(item > le[mid]){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return low;
    }
}

class Pair implements Comparable<Pair> {
    int width;
    int height;
    
    public Pair(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    public int compareTo(Pair o){
        if(this.width == o.width){
            return o.height - this.height;
        }
        return this.width - o.width;
    }
}