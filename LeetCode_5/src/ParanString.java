public class ParanString {
//    public static boolean checkValidString(String s) {
//        Stack<Character> stack = new Stack<>();
//        int star=0;
//        char[] ch = s.toCharArray();
//        for(int i=0;i<s.length();i++){
//            if(ch[i]=='('){
//                stack.push('(');
//            }
//            else if(ch[i]==')'){
//                if(stack.isEmpty() && star==0){
//                    return false;
//                }
//                else if(stack.isEmpty() && star>0){
//                    star--;
//                }
//                else{
//                    stack.pop();
//                }
//            }
//            else if(ch[i]=='*'){
//                star++;
//            }
//        }
//        if(!stack.isEmpty()){
//            if(star == stack.size()) return true;
//            else return false;
//        }
//        return true;
//    }
public static boolean checkValidString(String s) {
    int open=0;
    int close=0;
    int star=0;
    char[] ch = s.toCharArray();
    for(int i=0;i<s.length();i++){
        if(ch[i]=='('){
            open++;
        }
        else if(ch[i]==')'){
            close++;
        }
        else{
            star++;
        }
    }
    if(Math.abs(open-close)!=0){
        if(Math.abs(open-close)<=star) return true;
        else return false;
    }
    return true;
}
    public static void main(String[] args){
        String s="(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        System.out.println(checkValidString(s));
    }
}
