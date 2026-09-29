import java.util.Scanner;
public class CopyArray2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.print("enter array elements: ");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        cparr2 ele = new cparr2();
        ele.cparr2(arr);
    }
}

class cparr2{
    public void cparr2(int [] arr){

        int [] newarr = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            newarr[i] = arr[i];

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(newarr[i] + " ");
        }
    }
}

