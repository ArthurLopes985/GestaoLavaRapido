
package gestaolavarapido.DAO;

import gestaolavarapido.model.AgendaServicos;
import gestaolavarapido.model.TipoServico;
import gestaolavarapido.util.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class TipoServicoDAO {
    public List<TipoServico> listartipos() throws ClassNotFoundException {
        List<TipoServico> lista = new ArrayList<>();

        String sql = "SELECT * FROM tipo_servico";

        try (Connection conn = ConnectionFactory.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql);) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String descricao = rs.getString("descricao");
                double preco = rs.getDouble("preco");

                TipoServico tipos = new TipoServico(id, nome, descricao, preco);
                lista.add(tipos);
            }//seleciona e adicona a uma lista todos tipos de servicos localizados no banco de dados.

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao listar tipos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }//tratamento de erros.

        return lista;
    }//retorna a lista declarada no metodo.
    
    public boolean cadastrarTipo(TipoServico tipo) throws ClassNotFoundException {
        String sql = "{CALL cadastrar_tipo_servico(?, ?, ?)}";
        boolean sucesso = false;

        try (Connection conn = ConnectionFactory.getConexao();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(1, tipo.getNome());
            stmt.setString(2, tipo.getDescricao());
            stmt.setDouble(3, tipo.getPreco());

            sucesso = stmt.executeUpdate() > 0;
        //executa com os dados digitados a stored procedure do bd para cadastrar tipo.
        } catch (SQLException e) {
            e.printStackTrace();
        }//tratamento de erros.

        return sucesso;
    }//retorna apenas se operação for bem sucedida.
    public boolean editarTipo(TipoServico tipo) throws ClassNotFoundException {
        String sql = "{CALL editar_tipo_servico(?, ?, ?, ?)}";
        boolean sucesso = false;

        try (Connection conn = ConnectionFactory.getConexao();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(2, tipo.getNome());
            stmt.setString(3, tipo.getDescricao());
            stmt.setDouble(4, tipo.getPreco());
            stmt.setInt(1, tipo.getId());

            sucesso = stmt.executeUpdate() > 0;
        //executa com os dados digitados a stored procedure do bd para editar tipo.
        } catch (SQLException e) {
            e.printStackTrace();
        }//tratamento de erros.

        return sucesso;
    }//retorna apenas se operação for bem sucedida.
    
     public boolean apagarTipo(TipoServico tipo) throws ClassNotFoundException {
        String sql = "{CALL apagar_tipo_servico(?)}";
        boolean sucesso = false;

        try (Connection conn = ConnectionFactory.getConexao();
             CallableStatement stmt = conn.prepareCall(sql)) {
            
            stmt.setInt(1, tipo.getId());

            sucesso = stmt.executeUpdate() > 0;
        //executa com os dados digitados a stored procedure do bd para apagar tipo.
        } catch (SQLException e) {
            e.printStackTrace();
        }//tratamento de erros.

        return sucesso;
    }//retorna apenas se operação for bem sucedida.
}
