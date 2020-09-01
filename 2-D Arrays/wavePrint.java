class Solution{
    public static void display(int[][] arr){
	    for(int i = 0; i < 4; i++){
	        if(i % 2 == 0){
	            for(int j = 0; j < 4; j++){
	                System.out.print(arr[i][j] + " ");
	            }
	        }
	        else{
	            for(int j = 3; j >= 0; j--){
	                System.out.print(arr[i][j] + " ");
	            }
            }  
        }
        System.out.println("END");
	}
    public static void main(String[] args) {
        int[][] arr = {{11,12,13,14}, {21,22,23,24}, {31,32,33,34}, {41,42,43,44}};
        display(arr);
    }
}

//Output
// 11 12 13 14 
// 24 23 22 21
// 31 32 33 34
// 44 43 42 41