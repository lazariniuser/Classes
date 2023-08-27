public class Palio implements ICarro {

    int gasolina = 100;
    int distancia = 150;
    double potencia = 1.5;
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
