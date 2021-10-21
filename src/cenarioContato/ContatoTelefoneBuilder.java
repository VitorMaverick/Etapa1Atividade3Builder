package cenarioContato;

public class ContatoTelefoneBuilder {
    ContatoTelefone telefone;

    public ContatoTelefoneBuilder() {
    }
    public static ContatoTelefoneBuilder umContatoTelefone() {
        ContatoTelefoneBuilder builder = new ContatoTelefoneBuilder();
        builder.telefone = new ContatoTelefone("Usuario1", "vazio");
        return builder;
    }
    public ContatoTelefoneBuilder comNome(String nome) {
        this.telefone.setNome(nome);
        return this;
    }

    public ContatoTelefoneBuilder comTelefone(String telefone) {
        this.telefone.setTelefone(telefone);
        return this;
    }
    public ContatoTelefone constroi(){
        return telefone;
    }
}
