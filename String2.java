package String;

public class String2 {
    public static void main(String[] args) {
        String s1 = "i love india";
        String s2 = " ";
        int count =0;
        
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)==s2.charAt(0)){
                count++;
            }
        }
        System.out.println(count);
    }
    
}

