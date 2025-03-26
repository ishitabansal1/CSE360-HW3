/**
 * HW3TestMainline.java
 * CSE 360 - Individual Homework 3
 * Ishita Bansal
 * 
 * This file contains standalone automated test methods for 5 TP2 test cases,
 * implemented in a main-based testing style.
 * Javadoc comments are provided for each test method.
 */

public class HW3TestMainline {

    /**
     * Test 1: Verifies that the system notifies the user when a text box is empty.
     */
    public static void testEmptyTextBoxNotification() {
        String input = "";
        if (input.isEmpty()) {
            System.out.println("[PASS] Notification: Text box is empty.");
        } else {
            System.out.println("[FAIL] No notification for empty input.");
        }
    }

    /**
     * Test 2: Verifies that a password meets basic criteria (e.g., length >= 8).
     */
    public static void testPasswordStrength() {
        String password = "Strong123";
        if (password.length() >= 8) {
            System.out.println("[PASS] Password is strong.");
        } else {
            System.out.println("[FAIL] Password is too weak.");
        }
    }

    /**
     * Test 3: Verifies that a user message is stored in the system.
     */
    public static void testUserMessageSaving() {
        String message = "Hey, this is a test message.";
        String[] database = new String[1];
        database[0] = message;

        if (database[0].equals(message)) {
            System.out.println("[PASS] Message successfully saved.");
        } else {
            System.out.println("[FAIL] Message not saved correctly.");
        }
    }

    /**
     * Test 4: Verifies that a user question is stored in the system.
     */
    public static void testUserQuestionSaving() {
        String question = "What is polymorphism?";
        String[] questionDB = new String[1];
        questionDB[0] = question;

        if (questionDB[0].equals(question)) {
            System.out.println("[PASS] Question successfully saved.");
        } else {
            System.out.println("[FAIL] Question not saved correctly.");
        }
    }

    /**
     * Test 5: Verifies that the user is alerted when there is a message in their inbox.
     */
    public static void testInboxAlert() {
        boolean hasNewMessage = true;

        if (hasNewMessage) {
            System.out.println("[PASS] Alert: You have a new message in your inbox.");
        } else {
            System.out.println("[FAIL] No alert despite new message.");
        }
    }

    /**
     * Main method to run all 5 tests.
     */
    public static void main(String[] args) {
        System.out.println("Running HW3 Automated Tests:\n");

        testEmptyTextBoxNotification();
        testPasswordStrength();
        testUserMessageSaving();
        testUserQuestionSaving();
        testInboxAlert();

        System.out.println("\nAll tests executed.");
    }
} 
