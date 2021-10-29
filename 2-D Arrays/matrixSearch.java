class Solution {
    public static void main(String[] args) {
        int row = 3;
		int col = 3;
		int[][] arr = {{3,30,38}, {44,52,54}, {57,60,69}};
		int n = 62;
		boolean flag = false;
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				if(arr[i][j] == n){
					flag = true;
					break;
				}
			}
		}
		if(!flag){
			System.out.println("0");
		}
		else{
			System.out.println("1");
		}
    }
}

//Output
//0

//(For n = 52 -> Output = 1)