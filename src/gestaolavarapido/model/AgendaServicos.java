
package gestaolavarapido.model;

import java.util.Date;


public class AgendaServicos {
   protected int id;
   protected Date data;
   protected String status;
   protected int id_cliente;
   protected int id_tipo_servico;
   //criação dos atriubtos de agendaServico.
   
    public AgendaServicos(Date data, String status, int id_cliente, int id_tipo_servico) {
        this.data = data;
        this.status = status;
        this.id_cliente = id_cliente;
        this.id_tipo_servico = id_tipo_servico;
    } //criacao do construtor

    //criacao dos getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_tipo_servico() {
        return id_tipo_servico;
    }

    public void setId_tipo_servico(int id_tipo_servico) {
        this.id_tipo_servico = id_tipo_servico;
    }
   
   
}
