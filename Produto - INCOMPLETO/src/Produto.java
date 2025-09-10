public class Produto {

    private String codigo;
    private float peso;
    private float preco;

    public Produto (String codigo, float peso, float preco){
        this.codigo = codigo;
        this.peso = peso;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public float getPeso() {
        return peso;
    }

    public void setPeso (float peso) {
        this.peso = peso;
    }

    public float getPreco () {
        return preco;
    }

    public void setPreco (float preco) {
        this.preco = preco;
    }

    public void mostraInfo() {
        System.out.println("Código: " + codigo + ", Peso: " + peso + " e Preço " + preco);
    }

}
