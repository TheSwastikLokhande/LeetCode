public class _58_Length_of_Last_Word {
    public static void main(String[] args) {
        String s= "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        char[] a = s.toCharArray();
      int length = 0;
      boolean foundWord = false;

      for (int i = a.length - 1; i >= 0; i--) {
          if (a[i] != ' ') {
              length++;
              foundWord = true;
          } else if (foundWord) {
              break;
          }
      }

      return length;
      
  }
}
