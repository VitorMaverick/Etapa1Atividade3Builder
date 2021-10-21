package cenarioContato;

public abstract class AbstractContato {
    String nome;
    public AbstractContato(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
