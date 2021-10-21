package cenarioLivro;

import java.util.ArrayList;
import java.util.List;

public class LivroBuilder {
    private String nomeNacional;
    private int ano;
    private List<String> autores;
    private int edicao;
    private String cidade;
    private String editora;
    private String nomeOriginal;
    private List<String> tradutores;
    private int paginas;
    private long isbn;

    public LivroBuilder(String nome) {
        this.nomeNacional = nome;
        this.autores = new ArrayList<>();
        this.tradutores = new ArrayList<>();
    }

    public LivroBuilder publicadoEm(int ano) {
        this.ano = ano;
        return this;
    }
    public LivroBuilder dosAutores(String... autores) {
        for (String autor : autores) {
            this.autores.add(autor);
        }
        return this;
    }
    public LivroBuilder edicao(int edicao) {
        this.edicao = edicao;
        return this;
    }
    public LivroBuilder cidade(String cidade) {
        this.cidade = cidade;
        return this;
    }
    public LivroBuilder editora(String editora) {
        this.editora = editora;
        return this;
    }
    public LivroBuilder nomeOriginal(String nomeOriginal) {
        this.nomeOriginal = nomeOriginal;
        return this;
    }
    public LivroBuilder tradutores(String... tradutores) {
        for (String tradutor : tradutores) {
            this.tradutores.add(tradutor);
        }
        return this;
    }
    public LivroBuilder paginas(int paginas) {
        this.paginas = paginas;
        return this;
    }
    public LivroBuilder isbn(Long isbn) {
        this.isbn = isbn;
        return this;
    }

    public Livro build() {
        return new Livro(this.nomeNacional, this.ano, this.autores, this.edicao, this.cidade, this.editora,
                this.nomeOriginal, this.tradutores, this.paginas, this.isbn);
    }

}
