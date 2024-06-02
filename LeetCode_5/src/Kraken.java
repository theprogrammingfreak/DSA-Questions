import java.util.*;

public class Kraken {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=4;
        int k=5;
        int[] arr={1,2,4,3};
        System.out.println(attack(arr,k,n));
    }
    private static int attack(int[] d,int k,int n){
        int first=0;
        int last=n-1;
        int flag=0;
        int count=0;
        while(k!=0){
            if(flag==0){
                d[first]--;
                flag=1;
                if(d[first]==0){
                    first++;
                    count++;
                }
            }
            else if(flag==1){
                d[last]--;
                flag=0;
                if(d[last]==0){
                    last--;
                    count++;
                }
            }
            k--;
        }
        return count;
    }
}