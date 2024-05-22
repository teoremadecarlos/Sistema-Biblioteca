package Classes;
import java.util.Date;

public class Livro {
    private int tombo;
    private String titulo;
    private String autor;
    private String categoria;
    private String editora;
    private int ano;
    private Date dataCadastro;
    private String situacao;

    // Construtor padrão
    public Livro() {

    }

    // Construtor
    public Livro(int tombo, String titulo, String autor, String categoria, String editora,
                 int ano, Date dataCadastro, String situacao) {
        this.tombo = tombo;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.editora = editora;
        this.ano = ano;
        this.dataCadastro = dataCadastro;
        this.situacao = situacao;
    }

    // Getters e Setters
    public int getTombo() {
        return tombo;
    }

    public void setTombo(int tombo) {
        this.tombo = tombo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
