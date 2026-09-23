import java.util.Scanner;
public class ElementExists {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();

        System.out.print("enter array elements: ");
        int [] arr = new int[size];
         for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("enter element which u want to find x: ");
        int x = sc.nextInt();

       
        
        element el = new element();
        System.out.print(el.element(arr, x));
    }
    
}

class element{
    public boolean element(int [] arr,int x){

        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return true;
            }
           
        }

        return false;


    }
}
