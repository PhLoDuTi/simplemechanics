import java.lang.*;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Hello World! How's your day? \n (1 for \"Yes\", 0 for \"No\"): ");

        int a = sc.nextInt();  
        if (a == 0){
            System.out.println("Very good! Have a good one!");
        } else {
            System.out.println("Oh well, there's always tomorrow.");
        }
    }
}
