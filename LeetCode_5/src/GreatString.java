public class GreatString {
    public static String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for(int i = 1 ; i < sb.length() ; i++){
            if((sb.charAt(i)-'a'<0 && sb.charAt(i-1)-'a'>=0) || (sb.charAt(i)-'a'>=0 && sb.charAt(i-1)<0)){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                i=1;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s="abBAcC";
        System.out.println(makeGood(s));
    }
}
