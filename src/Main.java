/* public class Main {
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

 */

public class Main {
    public static void main(String[] args) {

        int [] numeros = {15, 8, 23, 42, 7, 19, 5};

        int i;

        // ************* Percorrer o Array **************

        //numeros.lenght chama a variavel numeros e conta quantas posições tem dentro do array, neste caso
        //o array tem 7 posições. Poderia também ficar assim: for (i = 0; i < 7; i++). Porém, o mais
        // recomendado é usar o lenght, pois nao precisamos ficar contando manualmente o número de arrays,
        // e não precisamos alterar o código caso o número de arrays seja alterado.

        for (i = 0; i < numeros.length; i++){

            System.out.println("A posição: " + i + " Corresponde ao valor: " + numeros[i]);
        }

        // ************* Calcular a soma dos números dentro do Array **************

        int soma = 0;

        for (i = 0; i < numeros.length; i++){
            soma = soma + numeros[i];
        }

        System.out.println("A soma de todos os valores é " + soma);

        // ************* Calcular a média dos números dentro do Array **************

        double media = 0;

        for (i = 0; i < numeros.length; i++) {
            media = (double) soma / numeros.length; //O loop for é desnecessário aqui! Está calculando a mesma coisa 7 vezes
        }

        // O Correto seria o cálculo da média aqui, fora do FOR

        System.out.println("A média de todos os números é " + media);

        // ************* Mostrar o maior dos números dentro do Array **************

        int maior = numeros[0];

        for (i = 0; i < numeros.length; i++) {

            if (maior <= numeros[i]) {
                maior = numeros[i];
            }


        }
        System.out.println("O maior número do Array é: " + maior);

        // ************* Mostrar o menor dos números dentro do Array **************

        int menor = numeros[0];

        for (i = 0; i < numeros.length; i++) {
            if (menor >= numeros[i]) {
                menor = numeros [i];
            }

        }
        System.out.println("O menor número do Array é: " + menor);
    }
}