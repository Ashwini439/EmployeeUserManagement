package Employeee;

import java.sql.*;

public class conn{
    
    public Connection c;
    public Statement s;
 
    //public static void main(String args[]){
      public  conn(){
        
    //     Connection c=null;
   //  Statement s;
        try{
           // Class.forName("com.mysql.jdbc.Driver");
           // c = DriverManager.getConnection("jdbc:mysql:///project3","root","");
             Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1234");
            
            
            
//            if(c!=null){
//                System.out.println("OK");
//            }else{
//                 System.out.println("EROOR");
//            }
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 
