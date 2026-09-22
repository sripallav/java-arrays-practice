import java.util.Scanner;
public class IndexOfMaxElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        Imele Ime = new Imele();
        System.out.print("The max element index is: " + Ime.Imele(arr));
    } 

    
}

class Imele{
    public int Imele(int [] arr){
        int max = arr[0];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;

            }

        }
        return index;
    }
}
