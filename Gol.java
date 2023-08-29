public class Gol implements ICarro {

    int gasolina = 90;
    int distancia = 150;
    double potencia = 1.0;
    public double res = potencia * gasolina;
    double saldo = distancia / res;

    public void acelerar() {
        for (int i = 0; i <= res; i++) {
            saldo--;
            distancia--;

        }
        if (distancia > 0) {
            System.out.println(
                    "Você escolheu o Gol! Infelizmente acabou a gasolina antes de chegarmos ao Ubatuba. Ainda faltam "
                            + distancia + "KM para concluirmos a viagem.");
        } else {
            System.out.println("Você escolheu o Gol e A viagem foi concluída com sucesso!");

        }
    }

    public void re() {
        for (int i = 0; i < distancia; i++) {
            gasolina--;
            distancia++;
        }
    }

}
