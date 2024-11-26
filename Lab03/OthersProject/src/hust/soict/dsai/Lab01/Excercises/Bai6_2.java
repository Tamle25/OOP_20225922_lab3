import java.util.Scanner;

public class Bai6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        String Name = sc.nextLine();
        System.out.println("How old are you?");
        int Age= sc.nextInt();
        System.out.println("How tall are you (m)");
        double Height= sc.nextDouble();

        System.out.println("Mrs/Ms, "+ Name + "," + Age +" years old. "+ "Your height is "+ Height+".");
    }
}