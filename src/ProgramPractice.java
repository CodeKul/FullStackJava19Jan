import java.util.Scanner;

public class ProgramPractice {

    public static void main(String[] args) {

        int num;
        int fact=1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        num = scanner.nextInt();

        for (int i=1;i<=num;i++){
            fact = fact* i;
        }
        System.out.println(fact);
    }
}

//      *
//     * *
//    * * *