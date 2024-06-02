import java.util.Stack;

public class MinRemove {
    public static String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        // char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        Stack<Integer> idx = new Stack<>();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==')'){
                if(stack.isEmpty()){
                    sb.deleteCharAt(i);
                    i=i-1;
                }
                else{
                    stack.pop();
                    idx.pop();
                }
            }
            else if(sb.charAt(i)=='('){
                stack.push('(');
                idx.push(i);
            }
        }
        while(!stack.isEmpty()){
            sb.deleteCharAt(idx.pop());
            stack.pop();
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s="))((";
        System.out.println(minRemoveToMakeValid(s));
    }
}
