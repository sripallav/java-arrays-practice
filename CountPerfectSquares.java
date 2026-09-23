import java.util.Scanner;
public class CountPerfectSquares {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int size = sc.nextInt();

        System.out.println("enter a array elements: ");
        int [] arr = new int[size];

         for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        perfect pf = new perfect();
        System.out.print(pf.perfect(arr));
     
    }
    
}

class perfect{
    public int perfect(int [] arr){

        int count = 0;
        for(int i=0;i<arr.length;i++){

            int root = (int) Math.sqrt(arr[i]);

            if(root*root==arr[i]){
                count++;

            
            
        }


        }

        return count;

        
    }
    
}