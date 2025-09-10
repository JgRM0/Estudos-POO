public class Turma {

    private String[] alunosNome;
    private byte[] alunosIdade;
    private float[] alunosMedia;

    public Turma(String[] alunosNome, byte[] alunosIdade, float[] alunosMedia) {
        this.alunosNome = alunosNome;
        this.alunosIdade = alunosIdade;
        this.alunosMedia = alunosMedia;
    }

    public float[] getAlunosMedia() {
        return alunosMedia;
    }

    public byte[] getAlunosIdade() {
        return alunosIdade;
    }

    public String[] getAlunosNome() {
        return alunosNome;
    }

    public void setAlunosIdade(byte[] alunosIdade) {
        this.alunosIdade = alunosIdade;
    }

    public void setAlunosMedia(float[] alunosMedia) {
        this.alunosMedia = alunosMedia;
    }

    public void setAlunosNome(String[] alunosNome) {
        this.alunosNome = alunosNome;
    }

    public int alunoMaisVelho(){
        int maiorIdade = alunosIdade[0];
        for(int i = 1; i < alunosIdade.length; i++){

            if(maiorIdade < alunosIdade[i]){
                maiorIdade = alunosIdade[i];
            }
        }
        return maiorIdade;
    }

    public String alunoMaisNovo(){
        int menorIdade = alunosIdade[0];
        int salvaI = 0;
        String nomeNovo = "Abner";
        for(int i = 1; i < alunosIdade.length; i++){
            if(menorIdade > alunosIdade[i]){
                menorIdade = alunosIdade[i];
                salvaI = i;

            }
        }
        nomeNovo = alunosNome[salvaI];
        return nomeNovo;
    }

    public byte alunosAprovados(){
        byte contadorAprovado = 0;
        for(byte i = 0; i < alunosMedia.length; i++){
            if(alunosMedia[i] >= 7.0f){
                contadorAprovado++;
            }
        }
        return contadorAprovado;
    }
}

