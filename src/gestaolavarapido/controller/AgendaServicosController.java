
package gestaolavarapido.controller;

import gestaolavarapido.model.AgendaServicos;
import java.util.Date;


public class AgendaServicosController extends AgendaServicos {
    // conexão com agendaservicos model
    public AgendaServicosController(int id, Date data, String status, int id_cliente, int id_tipo_servico) {
        super(id, data, status, id_cliente, id_tipo_servico);
    }
    
}
