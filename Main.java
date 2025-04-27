package package3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chatbot chatbot = new Chatbot();

        System.out.println("🤖 Welcome to ChatBot 1.0!");
        System.out.println("Type 'bye' anytime to end the chat.\n");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("goodbye")) {
                System.out.println("ChatBot: " + chatbot.getResponse(userInput));
                break;
            }

            String botResponse = chatbot.getResponse(userInput);
            System.out.println("ChatBot: " + botResponse);
        }

        scanner.close();
    }
}