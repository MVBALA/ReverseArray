import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array={1,5,3,7,11,9,15,20};
        System.out.println("Arrray ="+Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed Array ="+Arrays.toString(array));
    }
    private static void reverse(int[] array){
       int maxIndex=array.length-1;
       int halfIndex=array.length/2;
        for(int i=0;i< halfIndex;i++){
        int temp=array[i];
        array[i]=array[maxIndex-i];
        array[maxIndex-i]=temp;
        }
    }
}
