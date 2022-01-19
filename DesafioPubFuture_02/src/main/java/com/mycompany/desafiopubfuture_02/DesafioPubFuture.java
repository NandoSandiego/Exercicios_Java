/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.desafiopubfuture_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fxzkh
 */
public class DesafioPubFuture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        
        
        
        
// CONEXAO JAVA COM MYSQL        
        try {
            Class.forName("com.mysql.jdbc.Driver ");
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/desafiopubfuture", "root", "");
            ResultSet financasPessoais = conexao.createStatement().executeQuery("SELECT FROM * Desafiopubfuture");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados nao localizado");
        } catch (SQLException ex) {
            
            System.out.println("Ocorreu um erro ao acessar o banco"+ ex.getMessage());
            
        }
        
    }
    
}
