package cenarioContato;

public class ContatoCompleto extends AbstractContato {
    String endereco, telefone, email;

    public ContatoCompleto(String nome, String endereço, String telefone, String email) {
        super(nome);
        this.endereco = endereço;
        this.telefone = telefone;
        this.email = email;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContatoCompleto{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
