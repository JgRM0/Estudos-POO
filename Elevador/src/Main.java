public class Main {
    public static void main(String[] args) {
        byte capacidade = 6;
        byte totalAndares = 13;
        Elevador e = new Elevador(capacidade, totalAndares);

        System.out.println("Estado inicial:");
        System.out.println("Andar: " + e.getAndarAtual());
        System.out.println("Pessoas: " + e.getPessoasPresentes());

        System.out.println("\nTestando entrada:");
        byte x = 0;
        for (x = 0; x < 3; x++){
            e.entra();
        }
        System.out.println("Pessoas após " + x + " entradas: " + e.getPessoasPresentes());

        System.out.println("\nTestando subir:");
        byte y = 0;
        for (y = 0; y < 4; y++){
            e.sobe();
        }
        System.out.println("Andar após subir " + y + "x: " + e.getAndarAtual());

        System.out.println("\nTestando descer:");
        byte z = 0;
        for (z = 0; z < 4; z++){
            e.desce();
        }
        System.out.println("Andar após descer " + z + "x: " + e.getAndarAtual());;
    }
}
