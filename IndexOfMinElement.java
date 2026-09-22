import java.util.Scanner;
public class IndexOfMinElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        indexofmin ind = new indexofmin();
        System.out.print("index of min element is: " + ind.indexofmin(arr));
    }

    
}

class indexofmin{
    public int indexofmin(int [] arr){
        
        int min = arr[0];
        int index = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                index = i;
            }
        }

        return index;
    }
}