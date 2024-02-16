import java.util.Stack;

public class _20_Valid_Parentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
                if(c=='('|| c=='{'||c=='['){
                    st.push(c);
                }else{
                    if (st.isEmpty() || !isValidPair(st.pop(), c)) {
                        return false;
                    }
                }
        }
        return st.isEmpty();
    }
    private static boolean isValidPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
