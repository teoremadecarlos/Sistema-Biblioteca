package Classes;

import java.util.Date;

public class Usuario extends Pessoa {
    private int idUsuario;
    private String nomeUsuario;
    private String senhaUsuario;
    private int limiteLivros;

    // Construtor padrão
    public Usuario() {
        super();
    }

    // Construtor com parâmetros
    public Usuario(String id, String nome, String logradouro, String bairro, String cidade, String estado, String cep,
            String cpf, String rg, String telefone, String email, Date dataCadastro, Date dataNascimento, int idUsuario,
            String nomeUsuario, String senhaUsuario, int limiteLivros) {
        super(id, nome, logradouro, bairro, cidade, estado, cep, cpf, rg, telefone, email, dataCadastro,
                dataNascimento);
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
        this.limiteLivros = limiteLivros;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public int getLimiteLivros() {
        return limiteLivros;
    }

    public void setLimiteLivros(int limiteLivros) {
        this.limiteLivros = limiteLivros;
    }

}
