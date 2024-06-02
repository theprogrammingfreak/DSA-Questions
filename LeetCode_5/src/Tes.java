import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        while(sc.hasNext()){
            int n=sc.nextInt();
            list.add(n);
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
    }
}
//import java.util.*;
//
//public class Solution {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        for(int i=0;i<t;i++){
//
//        }
//    }
//}
