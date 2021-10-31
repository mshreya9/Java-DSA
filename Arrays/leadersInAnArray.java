public class leadersInAnArray {
    public static void leaderprint(int arr[], int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(arr[i] < arr[j]){
                    break;
                }
	
                if (j == n - 1)
                    System.out.println(arr[i]+" is a leader");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 7, 6, 4, 5, 0, 1 };
        int n = arr.length;
        leaderprint(arr, n);
    }
}

//Output
// 7 is a leader
// 6 is a leader
// 5 is a leader
// 1 is a leader
