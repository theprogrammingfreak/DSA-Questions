class MaxLen {
    public static int maximumLengthSubstring(String s) {
        int[] alpha=new int[26];
        char[] ch=s.toCharArray();
        int left=0,right=0,max=Integer.MIN_VALUE;
        while(right<s.length()){
            ++alpha[ch[right]-'a'];
            if(alpha[ch[right]-'a']>2){
                while(true){
                    if(ch[right]-'a'==ch[left]-'a'){
                        alpha[ch[left]-'a']--;
                        left++;
                        right++;
                        break;
                    }
                    alpha[ch[left]-'a']--;
                    left++;
                }
            }
            else{
                max=Math.max(max,(right-left)+1);
                right++;
            }

        }
        return max;
    }
    public static void main(String[] args){
        String s="bcbbbcba";
        System.out.println(maximumLengthSubstring(s));
    }
}