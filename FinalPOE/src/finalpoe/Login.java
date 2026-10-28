/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalpoe;

/**
 *
 * @author Student
 */
public class Login extends Registration{
    
   public boolean loginUser(String name , String password){
       if(name.equals(userName) && password.equals(passWord)){
           return true;
           
           
       }else{
           return false;
       }
       
   } 
  public String returnLoginStatus(boolean LoginStatus){
      if(LoginStatus){
          return "Login Success";
          
      }else{
          return "Login failed";
      }
  }  
    
}
