
package gestaolavarapido.controller;

import gestaolavarapido.DAO.ClienteDAO;
import gestaolavarapido.model.Cliente;


public class ClienteController extends Cliente {
    private ClienteDAO dao = new ClienteDAO();//conexão com clientedao
    // conexão com cliente model
    public ClienteController(String nome, String cpf, String telefone, String email, String placa_do_veiculo) {
        super(nome, cpf, telefone, email, placa_do_veiculo);
    }
    public void cadastrarCliente(Cliente cliente) throws ClassNotFoundException {
        dao.cadastrarCliente(cliente);//passa os dados digitados na view, passados pra ca, para a dao.
    }
}
