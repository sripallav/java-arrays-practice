import java.util.Scanner;
public class EvenElementsArray2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.print("enter array elements: ");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        Evenele2 ele = new Evenele2();
        ele.Evenele2(arr);
    }
}

class Evenele2{
    public void Evenele2(int [] arr){

        int [] newarr = new int[arr.length];

        int newindex = 0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0){
                newarr[newindex] = arr[i];
                newindex++;
            }
            


        }

        for(int i=0;i<newindex;i++){
            System.out.print(newarr[i] + " ");
        }

        



        
    }
}














