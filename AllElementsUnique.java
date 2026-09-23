import java.util.Scanner;
public class AllElementsUnique {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.print("enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        uniqueele ue = new uniqueele();
        System.out.print(ue.uniqueele(arr));


    }
    
}

class uniqueele{
    public boolean uniqueele(int [] arr){

        int unique = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j])
                    return false;
            }

            
            
        }

        return true;

        
    }
}
