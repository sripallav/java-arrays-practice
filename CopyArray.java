import java.util.Arrays;
import java.util.Scanner;
public class CopyArray  {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.print("enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        arraycopy cp = new arraycopy();
        cp.arraycopy(arr);

    }
}

class arraycopy{
    public void arraycopy(int [] arr){
        int [] newarr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newarr[i] = arr[i] ;
        }

        System.out.print(Arrays.toString(newarr));
    }
}























