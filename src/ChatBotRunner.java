import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ChatBot debbie = new ChatBot("Debbie", 5);

        System.out.println("What is your name?");
        String userName = input.nextLine();
        debbie.greeting(userName);
        debbie.weather();

        System.out.println("What is your favorite number?");
        int favNum = input.nextInt();
        double meters = debbie.convertFeetToMeters(favNum);
        System.out.println("Did you know that " + favNum + " feet is equal to " + meters + "?");
        debbie.favoriteNumber(favNum);

        System.out.println("Please enter an integer!");
        int one = input.nextInt();
        System.out.println("Please enter a second integer!");
        int two = input.nextInt();
        System.out.println("Please enter a final integer!");
        int three = input.nextInt();

        int sum = debbie.addNumbers(one,two,three);
        System.out.println("The sum of the three numbers are: " + sum);
        String goodbye = debbie.goodbye();
        System.out.println(goodbye);

        System.out.println("Please enter an integer!");
        int multOne = input.nextInt();
        System.out.println("Please enter a second integer!");
        int multTwo = input.nextInt();

        int product = debbie.multiplyNumbers(multOne,multTwo);
        System.out.println("The product of the two numbers are: " + product);

        String sentence = "Sample sentence";
        debbie.sampleMessage(sentence);

    }
}
