package Classes;
import java.util.Date;

public class Emprestimo {
    private int codigoReserva;
    private Livro livro;
    private Usuario usuario;
    private Date dataReserva;
    private Date dataDevolucao;

    public Emprestimo() {

    }
    
    // Construtor
    public Emprestimo(int codigoReserva, Livro livro, Usuario usuario, Date dataReserva, Date dataDevolucao) {
        this.codigoReserva = codigoReserva;
        this.livro = livro;
        this.usuario = usuario;
        this.dataReserva = dataReserva;
        this.dataDevolucao = dataDevolucao;
    }

    // Getters e Setters
    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
