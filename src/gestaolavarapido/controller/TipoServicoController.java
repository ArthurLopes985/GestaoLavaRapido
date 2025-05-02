
package gestaolavarapido.controller;

import gestaolavarapido.DAO.TipoServicoDAO;
import gestaolavarapido.model.TipoServico;

public class TipoServicoController extends TipoServico {
    private TipoServicoDAO dao = new TipoServicoDAO();//conexão com tiposervicodao
    // conexão com tiposervico model
    public TipoServicoController(int id, String nome, String descricao, double preco) {
        super(id, nome, descricao, preco);
    }
    public void cadastrarTipo(TipoServico tipo) throws ClassNotFoundException {
        dao.cadastrarTipo(tipo);//passa os dados digitados na view, passados pra ca, para a dao.
    }
    public void editarTipo(TipoServico tipo) throws ClassNotFoundException {
        dao.editarTipo(tipo);//passa os dados digitados na view, passados pra ca, para a dao.
    }
    public void apagarTipo(TipoServico tipo) throws ClassNotFoundException {
        dao.apagarTipo(tipo);//passa os dados digitados na view, passados pra ca, para a dao.
    }
}
