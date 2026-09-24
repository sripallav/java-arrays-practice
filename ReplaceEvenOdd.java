//Replace even elements with 1 and odd elements with 0.

import java.util.Scanner;
public class ReplaceEvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        Replace rp = new Replace();
        rp.Replace(arr);



}
}

class Replace{
    public void Replace(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i] = 1;
            }
            else if(arr[i]%2!=0){
                arr[i] = 0;
            
            }  

            System.out.print(arr[i] + " ");

        }

        
    }
}
