/* Julius Caesar protected his confidential information by encrypting it in a cipher. Caesar's cipher rotated every letter in a string by a fixed number, K, 
making it unreadable by his enemies. Given a string, S, and a number, K, encrypt S and print the resulting string.
Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.
*/

public class caesarCipher {
    public static void main(String[] args) {
        String s = "middle-Outz";
        int k = 2;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 65 && c <= 90){
                sb.append((char)((int)(c+k-65)%26 + 65));
            }
            else if(c >= 97 && c <= 122){
                sb.append((char)((int)(c+k-97)%26 + 97));
            } 
            else{
                sb.append(c);
            }
        }
        
        System.out.println(sb.toString());
    }
}

//Output: okffng-Qwvb