
package gestaolavarapido.controller;

import gestaolavarapido.model.TipoServico;

public class TipoServicoController extends TipoServico {
    // conexão com tiposervico model
    public TipoServicoController(int id, String nome, String descricao, double preco) {
        super(id, nome, descricao, preco);
    }
    
}
