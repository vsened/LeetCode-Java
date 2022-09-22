package RemoveAllAdjacentDuplicatesInString;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static String removeDuplicates(String s) {
        var stack = new Stack<Character>();
        String result = "";

        for(int i = 0; i < s.length(); i++){
            if (stack.isEmpty())
                stack.push(s.charAt(i));
            else{
                var t = stack.peek();
                if (t == s.charAt(i))
                    stack.pop();
                else
                    stack.push(s.charAt(i));
            }
        }
        for (var c : stack) {
            result += c;
        }
        return result;
    }
    public String removeDuplicates2(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(sb.length()==0)
                sb.append(s.charAt(i));
            else if(sb.charAt(sb.length()-1)==s.charAt(i))
                sb.setLength(sb.length()-1);
            else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
