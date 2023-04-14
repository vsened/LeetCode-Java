package BackspaceStringCompare;

import java.util.ArrayDeque;
import java.util.Deque;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        return (createString(createStack(s))).equals(createString(createStack(t)));
    }

    public boolean backspaceCompare2(String s, String t) {
        var stackS = createStack(s);
        var stackT = createStack(t);
        if (stackT.size() != stackS.size()) {
            return false;
        } else {
            while (stackS.size() > 0) {
                if (stackS.removeLast() != stackT.removeLast()) {
                    return false;
                }
            }
        }
        return true;
    }

    private Deque<Character> createStack(String input) {
        var stack = new ArrayDeque<Character>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '#') {
                if (!stack.isEmpty()) {
                    stack.removeLast();
                }
            } else {
                stack.addLast(input.charAt(i));
            }
        }
        return stack;
    }

    private String createString(Deque<Character> stack) {
        var result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.removeLast());
        }
        return result.toString();
    }
}
