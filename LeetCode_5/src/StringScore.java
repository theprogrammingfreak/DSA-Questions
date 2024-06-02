public class StringScore {
    public static int scoreOfString(String s) {
        int ans=0;
        for(int i=1;i<s.length();i++){
            int curr=(int)s.charAt(i);
            int prev=(int)s.charAt(i-1);
            ans+=Math.abs(curr-prev);
        }
        return ans;
    }
    public static void main(String[] args){
        String s="zaz";
        System.out.println(scoreOfString(s));
    }
}
