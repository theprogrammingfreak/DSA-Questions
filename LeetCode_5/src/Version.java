import java.util.*;
class Version {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        while(sc.hasNext()){
            int num=sc.nextInt();
            if(num==-1) break;
            ans^=num;
        }
        System.out.print(ans);
    }
}