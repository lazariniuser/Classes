import java.util.Scanner;

public class TarefaClasses {

    public static void main(String[] args) {

        System.out.println(
                "Olá! Você está indo para Ubatuba, irá percorrer uma distância de 150km. Escolha o seu carro digitando o seu respectivo número.");

        System.out.println("Carros disponíveis:  1 - Palio; 2 - Gol; 3 - Prisma; 4 - Uno.");
        Scanner scanner = new Scanner(System.in);
        String escolha = scanner.nextLine();
        scanner.close();

        if (escolha.equalsIgnoreCase("1")) {
            ICarro palio = new Palio();

            palio.acelerar();

        }

        if (escolha.equalsIgnoreCase("2")) {
            ICarro gol = new Gol();

            gol.acelerar();

        }

        if (escolha.equalsIgnoreCase("3")) {
            ICarro prisma = new Prisma();

            prisma.acelerar();

        }

        if (escolha.equalsIgnoreCase("4")) {
            ICarro uno = new Uno();

            uno.acelerar();

        }

    }

}