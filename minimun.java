import java.util.*;
public class minimun {
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
        int num = a[0];
        for(int k=0; k<n; k++){
            if(a[k]<num){  //if you want to find max just type(a[k]>num)
                num=a[k];
            }
        }
        System.out.println("Minimum number is:"+num);
    }
}
