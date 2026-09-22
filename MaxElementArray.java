import java.util.Scanner;
public class MaxElementArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        maxarr ma = new maxarr();
        System.out.print("maximum array element is: " + ma.maxarr(arr));
        
    }

}
class maxarr{
    public int maxarr(int [] arr){
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            
        }

        return max;
    }
}


