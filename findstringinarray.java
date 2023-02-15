import java.util.*;
public class findstringinarray {
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number of elements: ");
        int n = sc.nextInt();
        String[] a = new String[n];
        System.out.println("Type the Strings in arrays:");
        for(int i=0; i<n; i++){
            a[i] = sc.next();
        }
        System.out.println("Strings in arrays are: ");
        for(int j=0; j<n; j++){
            System.out.print(a[j]+" ");
        }
        System.out.println();
        System.out.print("Type the String you want to find: ");
        String st = sc.next();
        if(Arrays.asList(a).contains(st)){
            System.out.println("String is present.");
        }
        else{
            System.out.println("String is not present.");
        }
        
    }
}
