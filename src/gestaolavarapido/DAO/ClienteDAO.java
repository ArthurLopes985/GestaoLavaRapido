
package gestaolavarapido.DAO;

import gestaolavarapido.model.Cliente;
import gestaolavarapido.util.ConnectionFactory;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class ClienteDAO {
    public boolean cadastrarCliente(Cliente cliente) throws ClassNotFoundException {
        String sql = "{CALL novo_cliente(?, ?, ?, ?, ?)}";
        boolean sucesso = false;

        try (Connection conn = ConnectionFactory.getConexao();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getPlaca_do_veiculo());

            sucesso = stmt.executeUpdate() > 0;
        //executa com os dados digitados a stored procedure do bd para cadastrar cliente.
        } catch (SQLException e) {
            e.printStackTrace();
        }//tratamento de erros.

        return sucesso;
    }//retorna apenas se operação for bem sucedida.
}
