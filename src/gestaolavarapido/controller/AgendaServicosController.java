
package gestaolavarapido.controller;

import gestaolavarapido.DAO.AgendaServicosDAO;
import gestaolavarapido.model.AgendaServicos;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;


public class AgendaServicosController extends AgendaServicos {
    private AgendaServicosDAO dao = new AgendaServicosDAO(); //conexão com agendaservicosdao.
    public AgendaServicosController(String cliente, LocalDate data, String tipo_servico, String status) {
        super(cliente, data, tipo_servico, status);
    }// conexão com agendaservicos model

    public void agendarServico(AgendaServicos agenda) throws SQLException, ClassNotFoundException {
        dao.agendarServico(agenda); //passa dados digitados na view e passados pro controller pra dao.
    }
}
