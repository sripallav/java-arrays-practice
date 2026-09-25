
import java.util.Scanner;
public class ReverseArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.print("enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]  = sc.nextInt();
        }

        reversearr ra = new reversearr();
        ra.reversearr(arr);

    }
    
}

class reversearr{
    public void reversearr(int [] arr){

        int left = 0;
        int right = arr.length-1;

        
        while(left<right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left ++;
            right --;
        }


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }








        

}
}
