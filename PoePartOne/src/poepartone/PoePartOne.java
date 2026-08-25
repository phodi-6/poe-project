
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepartone;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PoePartOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        login register = new login();

        Scanner scan = new Scanner(System.in);
        System.out.println("\n=====Register =====");

        // username checker
        System.out.println("enter username:");
        String name = scan.nextLine();

        //password checker 
        System.out.println("enter passwoprd");
        String password = scan.nextLine();

        System.out.println("enter cellphone");
        String cellphone = scan.nextLine();

        System.out.println(register.registerUser(name, password, cellphone));
        if (!register.registerStatus(name, password, cellphone)) {
            return;
        }

        System.out.println("\n=====Log In=====");
          // username checker
        System.out.println("enter username to log in:");
        String userName = scan.nextLine();

        //password checker 
        System.out.println("enter passwoprd to log in");
        String passWord = scan.nextLine();

        System.out.println(register.loginUser(userName , passWord));
        
            
      

    }
}
