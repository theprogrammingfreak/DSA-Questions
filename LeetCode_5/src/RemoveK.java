import java.util.Stack;

public class RemoveK {
    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for(char number : num.toCharArray()){
            if(!stack.isEmpty()){
                while(number < stack.peek() && k>0) {
                    stack.pop();
                    k--;
                }
            }
            stack.push(number);
        }

        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();

        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        return sb.length()>0?sb.toString():"0";
    }

}
