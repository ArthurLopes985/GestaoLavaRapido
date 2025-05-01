
package gestaolavarapido.DAO;

import gestaolavarapido.model.AgendaServicos;
import gestaolavarapido.util.ConnectionFactory;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class AgendaServicosDAO {
    public List<AgendaServicos> buscarServicosporCpf(String cpf) throws SQLException, ClassNotFoundException {
        List<AgendaServicos> lista = new ArrayList<>();

        String sql = "SELECT c.nome, a.data, t.nome AS servico, a.status " +
                     "FROM agenda_servicos a " +
                     "JOIN cliente c ON c.id = a.id_cliente " +
                     "JOIN tipo_servico t ON t.id = a.id_tipo_servico " +
                     "WHERE c.cpf = ?";

        try (Connection conn = ConnectionFactory.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String cliente = rs.getString("nome");
                LocalDate data = rs.getDate("data").toLocalDate();
                String servico = rs.getString("servico");
                String status = rs.getString("status");

                AgendaServicos agenda = new AgendaServicos(cliente, data, servico, status);
                lista.add(agenda);
            }// seleciona a agenda de certo cliente de acordo com o cpf digitado na view, envia os dados pra classe agendaservicos e adiciona a uma lista.

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar agenda por CPF: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }//tratamento de erros.

        return lista;//retorna a lista delcarada no metodo.
    }
    
        public boolean agendarServico(AgendaServicos agenda) throws SQLException, ClassNotFoundException {
        boolean sucesso = false;
        int idcliente = -1;
        int idtipo = -1;

        Connection con = ConnectionFactory.getConexao();

        // transforma o nome digitado na view em um id.
        String sql1 = "SELECT id FROM cliente WHERE nome = ?";
        try (PreparedStatement comando = con.prepareStatement(sql1)) {
            comando.setString(1, agenda.getCliente());
            ResultSet rs = comando.executeQuery();
            if (rs.next()) {
                idcliente = rs.getInt("id");
            } else {
                throw new SQLException("Cliente não encontrado.");//tratamento de erros.
            }
        }

        // transforma o nome do servico selecionado na view em um id.
        String sql2 = "SELECT id FROM tipo_servico WHERE nome = ?";
        try (PreparedStatement comando2 = con.prepareStatement(sql2)) {
            comando2.setString(1, agenda.getTipo_servico());
            ResultSet rs2 = comando2.executeQuery();
            if (rs2.next()) {
                idtipo = rs2.getInt("id");
            } else {
                throw new SQLException("Tipo de serviço não encontrado.");//tratamento de erros.
            }
        }

        // Chama a procedure adicionando os dados digitados na view, o id do nome digitado e o id do servioc selecionado no banco de dados.
        String sql = "{CALL agendar_servico(?, ?, ?, ?)}";
        try (CallableStatement stmt = con.prepareCall(sql)) {
            stmt.setObject(1, agenda.getData());
            stmt.setString(2, agenda.getStatus());
            stmt.setInt(3, idcliente);
            stmt.setInt(4, idtipo);

            sucesso = stmt.executeUpdate() > 0;
        }

        return sucesso;//retorna sucesso caso operação bem sucedida.
    }

}
