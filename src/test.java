
public class test {
    public static void main(String[] args){
        Cuboid one = new Cuboid();
        System.out.println(one.getHeight());
        one.setDimensions(5, 5, 5);
        System.out.println(one.getHeight());
        System.out.println(one.get2DArea());
        System.out.println(one.getArea());


        float negInf = Float.NEGATIVE_INFINITY;
        int[] toSort = {4, 7, 1, 12, 3, 6, 5, 11, 2};
        for(int i = 0; i <= toSort.length - 1; i++){
            int sub;
            for(int j = 1; j <= toSort.length - 1; j++){
                if(toSort[j - 1] > toSort[j]){
                    sub = toSort[j - 1];
                    toSort[j-1] = toSort[j];
                    toSort[j] = sub;
                }
            }
        }
        for(int i = 0; i <= toSort.length - 1; i++){
            System.out.println(toSort[i]);
        }

        int[] binarySrch = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int sr = 16;
        int location = 0;
        int ini = 0;
        int en = 19;
        int m = 0;
        while(ini < en){
            m = (ini + en)/2;
            if(sr > binarySrch[m]){
                ini = m+1;
            }else {
                en = m;
            }
        }
        if(binarySrch[m] == sr){
            location = m;
            System.out.println(location);
        }else{
            System.out.println(-1);
        }
    }
}
