/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Diego Filipe
 */
public class ConexaoBanco {
   public Connection getConnection(){
       try {
           return DriverManager.getConnection("jdbc:mysql://localhost:3306/solar", "root","");
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Erro de conexão");
           return null;
       }
   }
}