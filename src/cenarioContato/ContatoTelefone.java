package cenarioContato;

public class ContatoTelefone extends AbstractContato {
    String telefone;

    public ContatoTelefone(String nome, String telefone) {
        super(nome);
        this.telefone = telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "ContatoTelefone{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
