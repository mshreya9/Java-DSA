class Solution {
    public String reorderSpaces(String text) {
        int countSpaces = 0;
        String space = " ";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                countSpaces++;
            }
        }
        if(countSpaces == 0){
            return text;
        }
        //System.out.println(countSpaces);
        String trimmedText = text.trim();
        String[] arr = trimmedText.split("\\s+");
        //if arr.length == 1, then return (text + countSpaces)
        if(arr.length == 1){
            sb.append(arr[0]);
            sb.append(space.repeat(countSpaces));
            return sb.toString();
        }
        //System.out.println(arr.length);
        //System.out.println(Arrays.toString(arr));
        int divideSpaces = countSpaces/(arr.length-1);
        //System.out.println(divideSpaces);
        int spaceLeft = countSpaces - (divideSpaces*(arr.length-1));
        if(spaceLeft == 0){
            //we can divide the spaces evenly in the string
            for(int i = 0; i < arr.length; i++){
                sb.append(arr[i]);
                if(i <= arr.length-2){
                    sb.append(space.repeat(divideSpaces));
                }
            }
        }
        else{
            //extra spaces would be kept in the end of string
            //System.out.println(spaceLeft);
            for(int i = 0; i < arr.length; i++){
                sb.append(arr[i]);
                if(i <= arr.length-2){
                    sb.append(space.repeat(divideSpaces));
                }
            }
            sb.append(space.repeat(spaceLeft));
        }
        return sb.toString();
    }
}