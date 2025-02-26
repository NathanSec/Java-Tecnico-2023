
public class testaProduto {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setNome("Caixa Misteriosa");
        produto.setValor(2);
        produto.setQntdStack(10);

        Produto produto1 = new Produto();
        produto.setNome("Pula-Pula");
        produto.setValor(2);
        produto.setQntdStack(10);

        Produto produto2 = new Produto();
        produto.setNome("LOL");
        produto.setValor(2);
        produto.setQntdStack(10);

        System.out.println("**  ==  Compra da Caixinha Misteriosa  ==  **");
        System.out.println("Produto disponivel: "+produto.getNome());
        System.out.println("Preço: "+produto.getValor());
        System.out.println(produto.getQntdStack());

        System.out.println("**  ==  Compra da Caixinha Misteriosa  ==  **");
        System.out.println("Produto disponivel: "+produto1.getNome());
        System.out.println("Preço: "+produto1.getValor());
        System.out.println(produto1.getQntdStack());

        System.out.println("**  ==  Compra da Caixinha Misteriosa  ==  **");
        System.out.println("Produto disponivel: "+produto2.getNome());
        System.out.println("Preço: "+produto2.getValor());
        System.out.println(produto2.getQntdStack());
        
    }
    
}