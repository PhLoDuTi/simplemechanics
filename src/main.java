import java.lang.*;
import java.util.*;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Hello World! How's your day? \n (1 for \"Yes\", 0 for \"No\"; 0 will be picked by default.): ");

        int a = sc.nextInt();  
        if (a == 0){
            System.out.println("Very good! Have a good one!");
        } else {
            System.out.println("Oh well, there's always tomorrow.");
        }
    }
}
