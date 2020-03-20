package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {
    //método responsavel por estabelecer a conexao com o banco

    public static Connection conector() {
        java.sql.Connection conexao = null;
        //chamando o driver importado da biblioteca
        //String driver = "com.mysql.cj.jdbc.Driver";
        //Armazenando informacoes referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //Estabelecendo a conexao com o banco
        try {
           // Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
