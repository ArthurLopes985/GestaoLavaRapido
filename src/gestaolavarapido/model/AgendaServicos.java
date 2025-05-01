
package gestaolavarapido.model;

import java.time.LocalDate;
import java.util.Date;


public class AgendaServicos {
   protected int id;
   protected String cliente;
   protected LocalDate data;
   protected String tipo_servico;
   protected String status;
   //criação dos atriubtos de agendaServico.

    public AgendaServicos(String cliente, LocalDate data, String tipo_servico, String status) {
        this.cliente = cliente;
        this.data = data;
        this.tipo_servico = tipo_servico;
        this.status = status;
    }//criacao do construtor

    //criacao dos getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTipo_servico() {
        return tipo_servico;
    }

    public void setTipo_servico(String tipo_servico) {
        this.tipo_servico = tipo_servico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
