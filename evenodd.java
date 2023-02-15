import java.util.*;
public class evenodd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Type the elements: ");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array is: ");
        for(int j=0; j<n; j++){
            System.out.print(a[j]+" ");
        }
        System.out.println();
        for(int k=0; k<n; k++){
            if(a[k]%2==0){  
                int even=a[k];
                System.out.print("Even:");
                System.out.print(even+" ");
            }
            else {
                int odd=a[k];
                System.out.print("Odd:");
                System.out.print(odd+" ");
            }
        }
    }
}
