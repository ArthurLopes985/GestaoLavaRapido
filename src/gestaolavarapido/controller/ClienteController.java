
package gestaolavarapido.controller;

import gestaolavarapido.model.Cliente;


public class ClienteController extends Cliente {
    // conexão com cliente model
    public ClienteController(int id, String nome, String cpf, String telefone, String email, String placa_do_veiculo) {
        super(id, nome, cpf, telefone, email, placa_do_veiculo);
    }
    
}
