import java.util.Scanner;

public class i1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int [] arr = new int[50];
        System.out.println("Enter values for the array");
        for(int i = 0;i<n;i++ ){
            arr[i] = sc.nextInt();
        }
      
        System.out.println("Enter the array index from where you want to remove element ");
        int removeindex = sc.nextInt();

        for(int i = removeindex;i<n;i++){
            arr[i]  = arr[i+1];
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");

        }

        
    }
    
}
