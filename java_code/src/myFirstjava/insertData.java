package myFirstjava;

import java.sql.*;
public class insertData {
    public static void main(String[] args){
          try{
        	  Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");//Loading Driver
              Connection connection= DriverManager.getConnection("jdbc:ucanaccess://D:\\Java program\\java_code\\src\\Lab18.accdb");//Establishing Connection
             System.out.println("Connected Successfully");
              //Crating PreparedStatement object
              PreparedStatement preparedStatement=connection.prepareStatement(""
              		+ "INSERT INTO Practice(Name,Email,Phone) VALUES (?, ?, ?)");
              //Setting values for Each Parameter
              preparedStatement.setString(1, "Rabbi");
              preparedStatement.setString(2, "rabbi.ru@gmail.com");
              preparedStatement.setString(3, "01722633140");
              //Executing Query
              preparedStatement.executeUpdate();
              System.out.println("data inserted successfully");
 
          }catch(Exception e){
              System.out.println("Error in connection");
 
          }
 
    }
}