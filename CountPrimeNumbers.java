import java.util.*;
public class CountPrimeNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.print("enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }

        countpri cp = new countpri();
        System.out.print(cp.countpri(arr));

    }

    
}

class countpri{
    public int countpri(int [] arr){
        
        int primes = 0;
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j==0){
                    count++;
                }
            }

            if(count==2){
                primes++;

                
            }

           
        
        }
         return primes;
       

        
        
    }

    
}