public class TestaLivros {
    public static void main(String[] args) {

        Livros livro1 = new Livros("A sociedade do anel", "J. R .R Tolkien", 576, 1954);
        Livros livro2 = new Livros("A última batalha", "C. S Lewis", 152, 1956);
        Livros livro3 = new Livros("O pequeno príncipe", "Saint Exupéry", 96, 1943);
        Livros livro4 = new Livros("O ladão de raios", "Rick Riordan", 400, 2005);

        System.out.println("\nLivro 1: ");
        livro1.exibirInformacoes();

        System.out.println("\nLivro 2: ");
        livro2.exibirInformacoes();

        System.out.println("\nLivro 3: ");
        livro3.exibirInformacoes();

        System.out.println("\nLivro 4: ");
        livro4.exibirInformacoes();

    }
}
