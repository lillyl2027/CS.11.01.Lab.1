import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your age? ");
        int age = scanner.nextInt();
        System.out.println(age + "-year olds should date somebody who is at least " + (age / 2 + 7) + " years old.");
    }


}

