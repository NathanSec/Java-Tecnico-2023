public class Livros {

    String titulo;
    String autor;
    int numeroDePaginas;
    int anoDePublicacao;

    // Método Construção

    public Livros(String titulo, String autor, int numeroDePaginas, int anoDePublicacao) {

        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDePublicacao = anoDePublicacao;
    }

    public void exibirInformacoes() {

        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroDePaginas);
        System.out.println("Ano da publicação: " + anoDePublicacao);

        if (anoDePublicacao < 2000) {
            System.out.println("Este livro é antigo.");
        }

    }

}
