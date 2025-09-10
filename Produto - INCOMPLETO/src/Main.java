public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("8XZ", 11, 25.4f);
        Produto p2 = new Produto("9MS", 7, 21f);
        Produto p3 = new Produto("7OP", 5, 30f);
        Produto p4 = new Produto("6UY", 15, 45.7f);
        Produto p5 = new Produto("999", 13, 12.3f);

        Produto[] produtos = {p1, p2, p3, p4, p5};

        int resultado = condicaoProduto(produtos);
        System.out.println("Produtos com peso > 10 e preço < 50: " + resultado);

        float media = mediaPesos(produtos);
        System.out.println("Média dos pesos: " + media);
    }


    public static int condicaoProduto(Produto[] produtos) {
        byte contador = 0;
        for (byte i = 0; i < produtos.length; i++) {
            if (produtos[i].getPeso() > 10 && produtos[i].getPreco() < 50) {
                contador++;
            }
        }
        return contador;
    }
    public static float mediaPesos(Produto[] produtos) {
        float somaPesos = 0;
        for (byte i = 0; i < produtos.length; i++) {
            somaPesos = produtos[i].getPeso() + somaPesos;

        }
        return somaPesos/5;
    }

}