import java.util.*;

public class mathsInString{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.charAt(s.length()-1) == 'x'){
            String l = "", m = "";
            int i;
            for(i = 0; i < s.length(); i++){
                if(s.charAt(i) == '+'){
                    break;
                }
                l += s.charAt(i);
            }
            
            for(int j = i+1; j < s.length(); j++){
                if(s.charAt(j) == '='){
                    break;
                }
                m += s.charAt(j);
            }
            
            int p = Integer.valueOf(l);
            int q = Integer.valueOf(m);
            System.out.println(p+q);
        }
        else{
            if(s.charAt(0) == 'x'){
                int i;
                String l = "";
                for(i = 2; i < s.length(); i++){
                    if(s.charAt(i) == '='){
                        break;
                    }
                    l += s.charAt(i);
                }
                
                String m = s.substring(i+1, s.length());
                int p = Integer.valueOf(l);
                int q = Integer.valueOf(m);
                System.out.println(q-p);
            }
            else{
                String l = "";
                int i;
                for(i = 0; i < s.length(); i++){
                    if(s.charAt(i) == '+'){
                        break;
                    }
                    l += s.charAt(i);
                }
                String m = s.substring(i+3, s.length());
                int p = Integer.valueOf(l);
                int q = Integer.valueOf(m);
                System.out.println(q-p);
            }
        }
    }
}

//Input: 578+x=723
//Output: 145

//Input: 578+723=x
//Output: 1301

//Input: x+578=723
//Ouput: 145