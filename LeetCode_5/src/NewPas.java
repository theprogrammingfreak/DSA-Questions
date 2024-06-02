import java.util.*;
class NewPas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
        int dis=3;
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(n>=0){
            if(i!=dis){
                int ch=i+'a';
                sb.append((char)ch);
                i++;
            }
            else if(i==dis){
                i=0;
            }
            n--;
        }
        System.out.println(sb.toString());
    }
}