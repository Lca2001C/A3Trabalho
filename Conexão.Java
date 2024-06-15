import java.sql.*;

/**
 * A classe Conexao gerencia a conexão com um banco de dados MySQL.
 * Permite abrir e fechar a conexão com o banco de dados, assim como executar queries SQL.
 */
public class Conexao {
    // URL do banco de dados
    static final String DB_URL = "jdbc:mysql://localhost:3306/drogaria_una";
    // Usuário do banco de dados
    static final String USER = "root";
    // Senha do banco de dados
    static final String PASS = "teste123!";

    // Conexão com o banco de dados
    private Connection dbconn = null;
    // Gerenciador de comandos SQL
    private Statement sqlmgr = null;

    /**
     * Abre a conexão com o banco de dados.
     * 
     * @return um objeto Connection representando a conexão com o banco de dados, ou null em caso de falha.
     */
    public Connection openDatabase() {
        try {
            dbconn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Conectado com sucesso");
            sqlmgr = dbconn.createStatement();
        } catch (Exception Error) {
            System.out.println("Erro ao conectar: " + Error.getMessage());
        }
        return dbconn;
    }

    /**
     * Fecha a conexão com o banco de dados e libera os recursos associados.
     * 
     * @throws SQLException se ocorrer um erro ao fechar a conexão ou o gerenciador de comandos SQL.
     */
    public void closeDatabase() throws SQLException {
        if (sqlmgr != null) {
            sqlmgr.close();
        }
        if (dbconn != null) {
            dbconn.close();
        }
    }

    /**
     * Executa uma query SQL de atualização (INSERT, UPDATE, DELETE).
     * 
     * @param sql a query SQL a ser executada.
     * @return o número de linhas afetadas pela query, ou -1 em caso de erro.
     */
    public int executarQuery(String sql) {
        try {
            return sqlmgr.executeUpdate(sql);
        } catch (Exception Error) {
            System.out.println("Erro ao executar query: " + Error.getMessage());
        }
        return -1;
    }
}
