package String;

public class String1 {
    public static void main(String[] args) {
        String s1 = "i love india";
        String s2 = "in";
        int f = 0;
        String n = " ";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    f = 1;
                }
            }
            if (f == 0) {
                n += s1.charAt(i);
            } else {
                f = 0;
            }
        }
        System.out.println(n);

    }
}
