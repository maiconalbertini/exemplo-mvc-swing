package br.jengcivil.modelo.bandodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoBancoDeDados {

    private static Connection conexao;

    private static final String CONNECTION_DRIVER = "org.hsqldb.jdbc.JDBCDriver";
    private static final String CONNECTION_DATABASE = "./dados/bancodedados";
    private static final String CONNECTION_USER = "ADMINISTRADOR";
    private static final String CONNECTION_PASSWORD = "ADMIN2022";

    public static Connection obterConexao() {
        try {
            if (conexao == null) {
                conexao = abrirConexao();
            } else if (conexao.isClosed()) {
                conexao = abrirConexao();
            }
            System.out.println("Conexão obtida com sucesso.");
            return conexao;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private static Connection abrirConexao() {
        conexao = null;
        try {
            Class.forName(CONNECTION_DRIVER);
            conexao = DriverManager.getConnection("jdbc:hsqldb:file:" + CONNECTION_DATABASE + ";create=true;hsqldb.lock_file=false", CONNECTION_USER, CONNECTION_PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoBancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexao;
    }

    public static void encerrarConexao() {
        try {
            conexao.close();
            conexao = DriverManager.getConnection("jdbc:hsqldb:file:" + CONNECTION_DATABASE + ";create=true", CONNECTION_USER, CONNECTION_PASSWORD);
            System.out.println("Conexão finalizada com sucesso.");
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void criarTabela() {

        Connection conexao = null;
        Statement instrucao = null;
        int resultado = 0;

        try {
            conexao = obterConexao();
            instrucao = conexao.createStatement();
            resultado = instrucao.executeUpdate("CREATE TABLE infologin ("
                    + "id INTEGER IDENTITY PRIMARY KEY, "
                    + "origem VARCHAR(150) NOT NULL, "
                    + "nome VARCHAR(150) NOT NULL, "
                    + "senha VARCHAR(100) NOT NULL, "
                    + "observacoes VARCHAR(300)"
                    + ");");
            encerrarConexao();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        System.out.println("Tabela foi criada com sucesso.");
    }

    // CONTINUA DAQUI...
    //https://www.tutorialspoint.com/hsqldb/hsqldb_drop_table.htm
    
    
    
    public static void main(String[] args) {
        criarTabela();
//        ConexaoBancoDeDados.obterConexao();
//        ConexaoBancoDeDados.encerrarConexao();
    }

}
