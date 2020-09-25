import java.util.*;

class Solution {
    private static class Pair{
        int first, second;

        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public static int maxAreaHistogram(int[] arr){
        ArrayList<Integer> list1 = nsl(arr);
        ArrayList<Integer> list2 = nsr(arr);

        //fill left and right array
        Integer[] left = new Integer[list1.size()]; 
        left = list1.toArray(left); 

        Integer[] right = new Integer[list2.size()]; 
        right = list2.toArray(right); 

        //create width arry
        int[] width = new int[arr.length];

        //fill width array
        for(int i = 0; i < arr.length; i++){
            width[i] = right[i] - left[i] - 1;
        }

        //area array
        int[] area = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            area[i] = arr[i] * width[i];
        }

        //Find max in area array
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < area.length; i++){
            if(area[i] > max){
                max = area[i];
            }
        }
        return max;
    }

    public static ArrayList<Integer> nsl(int[] arr){
        ArrayList<Integer> left = new ArrayList<>();
        Stack<Pair> st = new Stack<>();
        int pseudoIndex = -1;

        for(int i = 0; i < arr.length; i++){
            if(st.size() == 0){
                left.add(pseudoIndex);
            }
            else if(st.size() > 0 && st.peek().first < arr[i]){
                left.add(st.peek().second);
            }
            else if(st.size() > 0 && st.peek().first >= arr[i]){
                while(st.size() > 0 && st.peek().first >= arr[i]){
                    st.pop();
                }
                
                if(st.size() == 0){
                    left.add(pseudoIndex);
                }
                else{
                    left.add(st.peek().second);
                }
            }
            st.push(new Pair(arr[i], i));
        }
        return left;
    }

    public static ArrayList<Integer> nsr(int[] arr){
        ArrayList<Integer> right = new ArrayList<>();
        Stack<Pair> st = new Stack<>();
        int pseudoIndex = arr.length;

        for(int i = arr.length-1; i >= 0; i--){
            if(st.size() == 0){
                right.add(pseudoIndex);
            }
            else if(st.size() > 0 && st.peek().first < arr[i]){
                right.add(st.peek().second);
            }
            else if(st.size() > 0 && st.peek().first >= arr[i]){
                while(st.size() > 0 && st.peek().first >= arr[i]){
                    st.pop();
                }
                
                if(st.size() == 0){
                    right.add(pseudoIndex);
                }
                else{
                    right.add(st.peek().second);
                }
            }
            st.push(new Pair(arr[i], i));
        }
        Collections.reverse(right);
        return right;
    }

    public static void main(String[] args) {
        int[] arr = {6,2,5,4,5,1,6};
        System.out.println(maxAreaHistogram(arr));
    }
}

//Output
//12