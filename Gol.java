public class Gol implements ICarro {

    int gasolina = 90;
    int distancia = 150;
    double potencia = 1.0;

    public void acelerar() {
        for (int i = 0; i < gasolina; i++) {
            gasolina--;
            distancia--;

        }
    }

    public void re() {
        for (int i = 0; i < distancia; i++) {
            gasolina--;
            distancia++;
        }
    }

}
