import java.util.Scanner;
public class ElementsGreaterThanK {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of Array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.print("enter k value: ");
        int k = sc.nextInt();


        System.out.print("Elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }

        greaterthank gtk = new greaterthank();
        gtk.greaterthank(arr,k);

    }

    
}

class greaterthank{
    public void greaterthank(int[] arr,int k){

       
       int values = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > k){

                System.out.print(arr[i] + " ");
               


            }
        }

        
    
        
    
    }
}
