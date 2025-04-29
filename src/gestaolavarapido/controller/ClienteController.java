
package gestaolavarapido.controller;

import gestaolavarapido.model.Cliente;


public class ClienteController extends Cliente {
    // conexão com cliente model
    public ClienteController(String nome, String cpf, String telefone, String email, String placa_do_veiculo) {
        super(nome, cpf, telefone, email, placa_do_veiculo);
    }
    
}
