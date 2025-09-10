public class Elevador {
    private byte andarAtual;
    private byte totalDeAndares;
    private byte capacidade;
    private byte pessoasPresentes;

    public Elevador(byte totalDeAndares, byte capacidade) {

        this.totalDeAndares = totalDeAndares;
        this.capacidade = capacidade;
        this.pessoasPresentes = 0;
        this.andarAtual = 0;

    }

    public byte getAndarAtual() {
        return andarAtual;
    }

    public byte getCapacidade() {
        return capacidade;
    }

    public byte getPessoasPresentes() {
        return pessoasPresentes;
    }

    public byte getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setAndarAtual(byte andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setCapacidade(byte capacidade) {
        this.capacidade = capacidade;
    }

    public void setPessoasPresentes(byte pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public void setTotalDeAndares(byte totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public byte entra() {
        if (capacidade > pessoasPresentes) {
            pessoasPresentes ++;
        }
        return pessoasPresentes;
    }

    public byte sai(){
        if (pessoasPresentes != 0) {
            pessoasPresentes --;
        }
        return pessoasPresentes;
    }

    public byte sobe(){
        if (andarAtual < totalDeAndares) {
            andarAtual ++;
        }
        return andarAtual;
    }

    public byte desce(){
        if (andarAtual != 0) {
            andarAtual --;
        }
        return andarAtual;
    }
}
