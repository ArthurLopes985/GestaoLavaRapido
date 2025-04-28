
package gestaolavarapido.model;

public class Cliente {
    protected int id;
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected String email;
    protected String placa_do_veiculo;
    //criação dos atriubtos de cliente.
    
    public Cliente(int id, String nome, String cpf, String telefone, String email, String placa_do_veiculo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.placa_do_veiculo = placa_do_veiculo;
    }//criacao do construtor

    //criacao dos getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlaca_do_veiculo() {
        return placa_do_veiculo;
    }

    public void setPlaca_do_veiculo(String placa_do_veiculo) {
        this.placa_do_veiculo = placa_do_veiculo;
    }
    
    
}
