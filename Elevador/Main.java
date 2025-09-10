public class Main {
    public static void main(String[] args) {
        Elevador e = new Elevador((byte) 9, (byte) 6);

        System.out.println("Estado inicial:");
        e.setPessoasPresentes((byte) 2);
        System.out.println("Pessoas: " + e.getPessoasPresentes());
        e.setAndarAtual((byte) 3);
        System.out.println("Andar inicial: "+ e.getAndarAtual());
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
