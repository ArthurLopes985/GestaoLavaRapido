
package gestaolavarapido.controller;

import gestaolavarapido.model.AgendaServicos;
import java.util.Date;


public class AgendaServicosController extends AgendaServicos {
    // conexão com agendaservicos model
    public AgendaServicosController(Date data, String status, int id_cliente, int id_tipo_servico) {
        super(data, status, id_cliente, id_tipo_servico);
    }
    
}
