package cenarioContato;

public class ContatoInternet extends AbstractContato {
    String email;

    public ContatoInternet(String nome, String email) {
        super(nome);
        this.email = email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContatoInternet{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
