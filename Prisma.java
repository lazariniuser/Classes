public class Prisma implements ICarro {

    int gasolina = 80;
    int distancia = 150;
    double potencia = 1.4;
    double res = 0;

    public void acelerar() {
        for (int i = 0; i < gasolina; i++) {
            gasolina--;
            distancia--;
            res = potencia * distancia;

        }
    }

    public void re() {
        for (int i = 0; i < distancia; i++) {
            gasolina--;
            distancia++;
        }
    }

}
