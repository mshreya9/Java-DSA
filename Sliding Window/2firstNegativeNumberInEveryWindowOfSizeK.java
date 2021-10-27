import java.util.*;

class firstNegativeNumberInEveryWindowOfSizeK {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        while(j < arr.length){
            if(arr[j] < 0){
                list.add(arr[j]);
            }

            if(j-i+1 < k){
                j++;
            }

            else if(j-i+1 == k){
                //calculation (adding negative numbers to the list)
                if(list.size() == 0){ //edge case when list is empty
                    ans.add(0);
                }

                //In the 'ans' list we'll add the first number of 'list' because that would be the first negative for that window
                else{
                    ans.add(list.get(0));
                    if(arr[i] == list.get(0)){
                        list.remove(0);
                    }
                }

                //slide the window
                i++;
                j++;
            }
        }

        System.out.println(ans.toString());
    }
}

//Output:
//[-1, -1, -7, -15, -15, 0]