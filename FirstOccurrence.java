import java.util.Scanner;
public class FirstOccurrence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }

        System.out.print("Enter the element x u want find first occurance: ");
        int x = sc.nextInt();
        
        firstocc foc = new firstocc();
        System.out.print(foc.firstocc(arr, x));
    }
    
}

class firstocc{
    public int firstocc(int [] arr,int x){
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                index = i;
                break;
            }

        }

        return index;
    }
}
