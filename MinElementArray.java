import java.util.Scanner;
public class MinElementArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }

        minarr ma = new minarr();

        System.out.print("minimum array element is: " + ma.minarr(arr));
    }
    
}

class minarr{
    public int minarr(int [] arr){
        int min = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];

            }
        }

        return min;

    }
}
