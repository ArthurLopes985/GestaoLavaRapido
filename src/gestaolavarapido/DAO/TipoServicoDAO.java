
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
}
