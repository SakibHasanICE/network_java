package myFirstjava;



import java.sql.*; 
public class dbConnection {
    public static void main(String[] args){
          try{
              Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");//Loading Driver
              @SuppressWarnings("unused")
			Connection connection= DriverManager.getConnection("jdbc:ucanaccess://D:\\Java program\\java_code\\src\\Lab18.accdb");//Establishing Connection
             System.out.println("Connected Successfully");
 
          }catch(Exception e){
              System.out.println("Error in connection"+e);
 
          }
 
    }
}