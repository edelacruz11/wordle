public class Tablero {
    int alto;
    int ancho;
    String[][] tablero;

    public Tablero () {
        this.alto = 6;
        this. ancho = 5;

        tablero = new String[alto][ancho];

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                tablero[i][j] = "_";
            }
        }
    }

    public void mostrarTablero() {

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
