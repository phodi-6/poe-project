/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalpoe;

import javax.swing.JOptionPane;

/**
 *
 * @author Student
 */
public class FinalPOE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Login register = new Login();

        Message msg = new Message();

        JOptionPane.showMessageDialog(null, "===== Register =====", "Registration", JOptionPane.INFORMATION_MESSAGE);

        String name = JOptionPane.showInputDialog(null, "please enter username");

        String password = JOptionPane.showInputDialog(null, "please enter password");

        String cellphone = JOptionPane.showInputDialog(null, "please enter cellphone");

        JOptionPane.showMessageDialog(null, register.registerUser(name, password, cellphone));

        if (!register.registerStatus(name, password, cellphone)) {
            return;
        }

        JOptionPane.showMessageDialog(null, "===== Login =====", "log in", JOptionPane.INFORMATION_MESSAGE);

        String loginusername = JOptionPane.showInputDialog(null, "Enter username: ");

        String loginpassword = JOptionPane.showInputDialog(null, "Enter password: ");

        boolean status = register.loginUser(loginusername, loginpassword);

        JOptionPane.showMessageDialog(null, register.returnLoginStatus(status));

        if (status == true) {

            int option;

            do {
                String menu = "===== Select any of the option below =====" + "1.Send message" + "2. message management" + "3. Exit" + "select an option";

                String input = JOptionPane.showInputDialog(null, menu, "main menu", JOptionPane.QUESTION_MESSAGE);

                if (input == null) {
                    option = 3;
                } else {

                    try {
                        option = Integer.parseInt(input);

                        switch (option) {
                            case 1 ->
                                msg.sendingMessages();
                            case 2 ->
                                msg.messageManagementMenu();
                            case 3 ->
                                JOptionPane.showMessageDialog(null,"Good bye!!" );
                               
                            default ->
                                JOptionPane.showMessageDialog(null,"Invalid option!!","error",JOptionPane.ERROR_MESSAGE );
                               
                        }

                    } catch (NumberFormatException e) {
                        
                    option = 0;    

                     JOptionPane.showMessageDialog(null, "plese enter valid number","input error",JOptionPane.WARNING_MESSAGE);
                        
                    }
                }

            } while (option != 3);
        }
    }
    
}
