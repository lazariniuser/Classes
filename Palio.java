public class Palio implements ICarro {

    public int gasolina = 100;
    public int distancia = 150;
    public double potencia = 1.5;
    public double res = potencia * gasolina;
    double saldo = distancia / res;

    public void acelerar() {
        for (int i = 0; i <= res; i++) {
            saldo--;
            distancia--;

        }
        if (distancia > 0) {
            System.out.println(
                    "Você escolheu o Palio! Infelizmente acabou a gasolina antes de chegarmos ao Ubatuba. Ainda faltam "
                            + distancia + "KM para concluirmos a viagem.");
        } else {
            System.out.println("Você escolheu o Palio e A viagem foi concluída com sucesso!");

        }
    }

    public void re() {
        for (int i = 0; i < distancia; i++) {
            gasolina--;
            distancia++;
        }
    }

}
