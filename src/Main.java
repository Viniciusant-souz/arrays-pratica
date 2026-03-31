public class Main {
    public static void main(String[] args) {

        System.out.println("=== PRIMEIRO ARRAY ===");

        // Array com os dias da semana
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};

        System.out.println("Total de dias: " + dias.length);
        System.out.println();

        // Percorrendo o array
        for (int i = 0; i < dias.length; i++) {
            System.out.println("Dia " + (i + 1) + ": " + dias[i]);
        }

        System.out.println("\nFim do programa!");  // ← agora dentro do método main!
    }
}