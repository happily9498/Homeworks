
public class Loops {

    public static void main(String[] args) {
        int[] array = {3,5,7,8,0,234,56};

        System.out.println("Max Number by For Loop: "+ maxByForLoop(array) );
        System.out.println("Max Number by While Loop: "+ maxByWhile(array) );
        System.out.println("Max Number by Do-While Loop: "+ maxByDoWhile(array) );
        System.out.println("Max Number by ForEach Loop: "+ maxByForEach(array) );
    }

    public static int maxByForLoop(int[] arry){
        int max = arry[0];
        for(int i=0;i<arry.length;i++){
            if(max<arry[i]){
                max=arry[i];
            }
        }
        return max;
    }

    public static int maxByWhile(int[] arry){
        int max = arry[0];
        int i=0;
        while( i<arry.length){
            if(max<arry[i]){
                max=arry[i];
            }
            i++;
        }
        return max;
    }

    public static int maxByDoWhile(int[] arry){
        int max = arry[0];
        int i =0;
        do{
            if(max<arry[i]){
                max=arry[i];
            }
            i++;
        }while (i<arry.length);


        return max;
    }

    public static int maxByForEach(int[] array){
        int max = array[0];
        for(int i:array){
            if(max<i){
                max=i;;
            }
        }
        return max;
    }
    
}
