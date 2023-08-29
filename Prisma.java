public class Prisma implements ICarro {

    int gasolina = 80;
    int distancia = 150;
    double potencia = 1.4;
    public double res = potencia * gasolina;
    double saldo = distancia / res;

    public void acelerar() {
        for (int i = 0; i <= res; i++) {
            saldo--;
            distancia--;

        }
        if (distancia > 0) {
            System.out.println(
                    "Você escolheu o Prisma! Infelizmente acabou a gasolina antes de chegarmos ao Ubatuba. Ainda faltam "
                            + distancia + "KM para concluirmos a viagem.");
        } else {
            System.out.println("Você escolheu o Prisma e A viagem foi concluída com sucesso!");

        }

    }

    public void re() {
        for (int i = 0; i < distancia; i++) {
            gasolina--;
            distancia++;
        }
    }

}
