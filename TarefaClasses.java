import java.util.Scanner;

public class TarefaClasses {

    public static void main(String[] args) {

        System.out.println(
                "Olá! Você está indo para Ubatuba, irá percorrer uma distância de 150km. Escolha o seu carro.");
        Scanner scanner = new Scanner(System.in);
        String escolha = scanner.nextLine();
        scanner.close();

        if (escolha.equalsIgnoreCase("palio")) {
            ICarro corrida = new Palio();

            corrida.acelerar();
            if (gasolina < distancia) {
                System.out.println("Você escolheu o" + escolha
                        + "! Infelizmente acabou a gasolina antes de chegarmos ao Ubatuba. Ainda faltam " + distancia
                        + "KM para concluirmos a viagem.");
            }

        }

    }

}