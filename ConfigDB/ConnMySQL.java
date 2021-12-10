package ConfigDB;


import java.sql.*;

public class ConnMySQL {
    public static Connection conectar(){
        
        String server = "localhost";
        String port = "3306";
        String database = "aluguel_de_carros_db";
        String user = "root";
        String pass = "";
        
        String url = "jdbc:mysql://" + server + ":" + port + "/" + database;
        
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //carregando a classe na memória
            conn = DriverManager.getConnection(url,user,pass);
            
        }catch(ClassNotFoundException | SQLException e){
           
            e.printStackTrace();
        }
        
        return conn;
    }
}

