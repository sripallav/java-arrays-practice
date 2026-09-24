import java.util.Scanner;
public class ReplaceNegativeWithZero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        replaceneg neg = new replaceneg();
        neg.repplaceneg(arr);
        

    }
  
}

class replaceneg{
    public void repplaceneg(int [] arr){

        

        for(int i=0;i<arr.length;i++){

            if(arr[i]<0){
                arr[i] = 0;
            }

            System.out.print(arr[i] + " ");
        }


          

        

        


    }
}


