import java.util.*;
public class findcharinstring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the String: ");
        String st = sc.nextLine();
        System.out.print("Type the char you want to search:");
        char ch = sc.next().charAt(0);
        for(int i=0; i<st.length(); i++){
            if(ch==st.charAt(i)){
                System.out.println(ch+" is presents at "+i);                
            }
        }
    }
}
