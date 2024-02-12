import java.util.*;

public class Valid_Anaram {
    public static void main(String[] args) {
       System.out.println( vAna("swas", "qaws"));
    }

    private static boolean vAna(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] sChar=s.toCharArray();
        char[] tChar=t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
          




        return Arrays.equals(sChar, tChar);
       
    }
}
