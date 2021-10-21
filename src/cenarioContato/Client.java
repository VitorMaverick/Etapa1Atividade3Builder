package cenarioContato;

import static cenarioContato.ContatoTelefoneBuilder.umContatoTelefone;
import static cenarioContato.ContatoInternetBuilder.umContatoInternet;
import static cenarioContato.ContatoCompletoBuilder.umContatoCompleto;

public class Client {
    public static void main(String[] args) {
        AbstractContato vitor = umContatoInternet().comNome("Vitor").comEmail("vitor@rmail.com").constroi();
        AbstractContato maria = umContatoTelefone().comNome("Maria").comTelefone("98456479").constroi();
        AbstractContato jose = umContatoCompleto().comNome("Jose").comEmail("jose@email.com")
                .comTelefone("987466574").comEndereco("Maioba").constroi();
        Director director = new Director();
        director.imprimeContato(vitor);
        director.imprimeContato(maria);
        director.imprimeContato(jose);

    }

}
