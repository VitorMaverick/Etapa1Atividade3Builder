package cenarioContato;

public class ContatoCompletoBuilder {
    ContatoCompleto completo;

    public ContatoCompletoBuilder() {
    }
    public static ContatoCompletoBuilder umContatoCompleto() {
        ContatoCompletoBuilder builder = new ContatoCompletoBuilder();
        builder.completo = new ContatoCompleto("Usuario1", "vazio", "vazio", "vazio");
        return builder;
    }
    public ContatoCompletoBuilder comNome(String nome) {
        this.completo.setNome(nome);
        return this;
    }
    public ContatoCompletoBuilder comTelefone(String telefone) {
        this.completo.setTelefone(telefone);
        return this;
    }
    public ContatoCompletoBuilder comEmail(String email) {
        this.completo.setEmail(email);
        return this;
    }
    public ContatoCompletoBuilder comEndereco(String endereco) {
        this.completo.setEndereco(endereco);
        return this;
    }
    public ContatoCompleto constroi(){
        return completo;
    }
}
