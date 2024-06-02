import java.util.Arrays;

public class CoverPoints {
    public static int MinRec(int[][] points,int w) {
        Arrays.sort(points, (a,b) -> a[0]-b[0]);
        int count=0;
        for(int i=0;i<points.length;i++)
        {
            int j=i;
            while((j < points.length) && (points[j][0] - points[i][0] <= w) && (points[i][1] >= 0))
            {
                j++;
            }
            count++;
            i=j-1;
        }
        return count;
    }
//        if(w==0) return points.length;
//        int count=0;
//        Set<Integer> sed=new HashSet<>();
//        for(int i=0;i<points.length;i++){
//            sed.add(points[i][0]);
//        }
//        if(sed.size()%(w+1)!=0){
//            count=sed.size()/(w+1)+1;
//        }
//        else count=sed.size()/(w+1);
//        return count;
    public static void main(String[] args){
        int[][] coor={{2,1},{1,0},{1,4},{1,8},{3,5},{4,6}};
        int w=1;
        System.out.print(MinRec(coor,w));
    }
}
