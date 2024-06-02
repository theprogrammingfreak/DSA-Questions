class ApplyOprMakeGreater {
    public int minOperations(int k) {
        if(k==1) return 0;
        int num=0;
        int minopr=Integer.MAX_VALUE;
        int div=0;
        while(num<k/2){
            num++;
            div=k/num;
            if(k%num==0) div--;
            minopr=Math.min(minopr,(num+div)-1);
        }
        return minopr;
    }
}