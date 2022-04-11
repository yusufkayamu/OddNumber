import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        int number, total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Give a number=");
            number = input.nextInt();
            if (number %4 ==0) {
                total += number;
            }
        } while (number %2 !=1);
        System.out.println(total);


    }
}
