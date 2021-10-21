package cenarioContato;

public class ContatoInternetBuilder {
    ContatoInternet contato;

    public ContatoInternetBuilder() {
    }

    public static ContatoInternetBuilder umContatoInternet() {
        ContatoInternetBuilder builder = new ContatoInternetBuilder();
        builder.contato = new ContatoInternet("Usuario1", "vazio");
        return builder;
    }


    public ContatoInternetBuilder comNome(String nome) {
        this.contato.setNome(nome);
        return this;
    }

    public ContatoInternetBuilder comEmail(String email) {
        this.contato.setEmail(email);
        return this;
    }
    public ContatoInternet constroi(){
        return contato;
    }
}
