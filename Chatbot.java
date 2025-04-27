package package3;
public class Chatbot {
    



    // Simple method to get a response based on user input
    String getResponse(String userInput) {
        userInput = userInput.toLowerCase(); // Handle case-insensitivity

        // Basic NLP keyword-based response
        if (userInput.contains("hello") || userInput.contains("hi")) {
            return "Hello! How can I assist you today?";
        } else if (userInput.contains("how are you")) {
            return "I'm just a bunch of code, but thanks for asking! 😄 How about you?";
        } else if (userInput.contains("bye") || userInput.contains("goodbye")) {
            return "Goodbye! Have a wonderful day ahead! 👋";
        } else if (userInput.contains("your name")) {
            return "I'm ChatBot 1.0 — your virtual assistant.";
        } else if (userInput.contains("help")) {
            return "Sure! You can ask me about general queries, greetings, or say 'bye' to end the chat.";
        } else if (userInput.contains("weather")) {
            return "I'm not connected to real weather data yet, but it’s always sunny inside my code! ☀️";
        } else if (userInput.contains("thanks") || userInput.contains("thank you")) {
            return "You're welcome! Happy to help! 😊";
        } else {
            return "I'm sorry, I didn't understand that. Can you rephrase?";
        }
    }
}
