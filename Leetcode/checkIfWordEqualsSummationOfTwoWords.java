class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        StringBuilder fw = new StringBuilder();
        for(int i = 0; i < firstWord.length(); i++){
            fw.append((int)(firstWord.charAt(i) - 'a'));
        }
        
        StringBuilder sw = new StringBuilder();
        for(int i = 0; i < secondWord.length(); i++){
            sw.append((int)(secondWord.charAt(i) - 'a'));
        }
        
        StringBuilder tw = new StringBuilder();
        for(int i = 0; i < targetWord.length(); i++){
            tw.append((int)(targetWord.charAt(i) - 'a'));
        }
        
        int a = Integer.valueOf(fw.toString());
        int b = Integer.valueOf(sw.toString());
        int c = Integer.valueOf(tw.toString());
        
        if(a+b == c){
            return true;
        }
        return false;
    }
}