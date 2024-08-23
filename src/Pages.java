import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {

        //Credit: Thanks to Jim Cohoon at The University of Virginia

        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your age? ");
        int age = scanner.nextInt();
        System.out.println(age + "-year olds should read at least " + (100-age) + " pages before giving up on a book.");
    }
}