/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepartone;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Messages {
     ArrayList<String> messageids = new ArrayList<>();
    ArrayList<String> recipientNumber = new ArrayList<>();
    ArrayList<String> messages = new ArrayList<>();
    ArrayList<String> msgHash = new ArrayList<>();
    ArrayList<String> messageStatus = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    int numMessageSent = 0;

    public void sendingMessage() {

   
        
        System.out.println("how many messages do you want to send?");
        int numberofMessages = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= numberofMessages; i++) {
            System.out.println("MESSAGE:" + i);
            String messageID = generateMessageID();

            System.out.println("enter recipient cell number");

            String recipient = input.nextLine();
            String recipientResult = checkRecipientCell(recipient);

            if (!recipientResult.equals("valid number")) {
                System.out.println(recipientResult);
                i = 1 - 1;
                continue;
            }

            recipientNumber.add(recipient);

            System.out.println("enter your message!!");
            String messageText = input.nextLine();
            if (messageText.length() > 250 || messageText.trim().isEmpty()) {
                System.out.println(" message length should between 1 and 250");
                i--;
                continue;
            }
            messages.add(messageText);
            {
                String messageHash = createMessageHash(messageID, messages.size(), messageText);
                msgHash.add(messageHash);

                String status = SentMessage();
                messageStatus.add(status);

                if (status.equals("sent")) {

                    numMessageSent++;

                }

            }

            printMessages();

            System.out.println("total messgas sent:" + returnTotalMessages());

        }

    }
    public void storeMessages(String messageID, String recipient, String messageText, String messageHash) {
    try {
        FileWriter writer = new FileWriter("message.json");
        String jsonMessage = "{\n" +
            "\"Message ID\": \"" + messageID + "\",\n" +
            "\"Recipient\": \"" + recipient + "\",\n" +
            "\"Message\": \"" + messageText + "\",\n" +
            "\"Message Hash\": \"" + messageHash + "\"\n" +
            "}\n";

        storedMessages.add(jsonMessage);

        writer.write("[\n");
        for (int i = 0; i < messageStatus.size(); i++) {
            writer.write(messageStatus.get(i));
            if (i < messageStatus.size() - 1) {
                writer.write(",\n");
            }
        }
        writer.write("]");
        writer.close();
    } catch (IOException e) {
        System.out.println("Error storing message");
    }
}

    public int returnTotalMessages() {

        return numMessageSent;
    }

    public String generateMessageID() {
        String messageID;

        do {
            long number = 1000000000L + random.nextLong(9000000000L);
            messageID = String.valueOf(number);

        } while (messageids.contains(messageID));

        messageids.add(messageID);

        return messageID;

    }

    public String checkRecipientCell(String recipient) {

        if (recipient.matches("^//+27[0-9]{9}$") || recipient.matches("^0[0-9]{9}$")) {
            return "valid number";
        } else {
            return "invalid number enter valid number";
        }

    }

    public String createMessageHash(String messageID, int messageNumber, String messageText) {

        String firstTwoNumbers = messageID.substring(0, 2);
        String trimmedMessage = messageText.trim();
        String[] words = trimmedMessage.split("//s+");
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        String hash = firstTwoNumbers + ":" + messageNumber + ":" + firstWord + lastWord;

        return hash.toUpperCase();
    }

    public String SentMessage() {

        System.out.println("/n Chooose what you want to do with this message/n");
        System.out.println("1. send message");
        System.out.println("2. disregard message");
        System.out.println("3. store message to send later");
        System.out.println("enter option:");

        int choice = input.nextInt();

        switch (choice) {

            case 1 -> {
                System.out.println("message successfully sent");
                return "Sent";

            }
            case 2 -> {
                System.out.println("Press 0 to delete the message");
                int deleteChoice = input.nextInt();
                input.nextLine();

                if (deleteChoice == 0) {
                    System.out.println("message deleted");

                    int lastIndex = messages.size() - 1;

                    messageids.remove(lastIndex);
                    recipientNumber.remove(lastIndex);
                    messages.remove(lastIndex);
                    msgHash.remove(lastIndex);

                    return "disregard";

                } else {
                    System.out.println("invalid option");
                    return "disregarded";
                }

            }

            case 3 -> {
                System.out.println("message successfully stored");
                return "stored";

            }

            default -> {
                System.out.println("invalid option");
                return "disregarded";

            }

        }

    }

    public String printMessages() {

        StringBuilder allMessages = new StringBuilder();

        System.out.println("/n===== All messages=====/n");

        for (int i = 0; i < messages.size(); i++) {
            allMessages.append("/nmessage number:").append(i + 1);
            allMessages.append("/nmessage id :").append(messageids.get(i));
            allMessages.append("/nrecipient:").append(recipientNumber.get(i));
            allMessages.append("/nmessage").append(messages.get(i));
            allMessages.append("/nmessage hash:").append(msgHash.get(i));
            allMessages.append("/nstatus:").append(messageStatus.get(i));

            System.out.println("/n message number: " + (i + 1));
            System.out.println("message id :" + messageids.get(i));
            System.out.println("recipient :" + recipientNumber.get(i));
            System.out.println("message :" + messages.get(i));
            System.out.println("message hash:" + msgHash.get(i));
            System.out.println("message status :" + messageStatus.get(i));

        }
        return allMessages.toString();
    
}
}