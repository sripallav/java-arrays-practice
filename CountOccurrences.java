import java.util.Scanner;
public class CountOccurrences {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();

        System.out.println("enter a array elements: ");
        int [] arr = new int[size];

         for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter element x u want to find: ");
        int x = sc.nextInt();

       

        countocc oc = new countocc();
        System.out.print("The element occured : " + oc.countocc(arr, x) + " times");
    }
    
}

class countocc{
    public int countocc(int [] arr,int x){

        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                count++;

            }
        }

        return count;

    }
}
