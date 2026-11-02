public class CasoForo {
    private String[][] auditorio;
    private int filas;
    private int columnas;

    public CasoForo(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        auditorio = new String[filas][columnas];
        inicializarAuditorio();
    }

    private void inicializarAuditorio() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                auditorio[i][j] = "[Libre]"; // O(1) inicialización
            }
        }
    }

    public void reservarAsiento(int fila, int col) {
        if (fila >= 0 && fila < filas && col >= 0 && col < columnas) {
            if (auditorio[fila][col].equals("[Libre]")) {
                auditorio[fila][col] = "[Ocupado]";
                System.out.println("Asiento " + fila + "-" + col + " reservado con éxito.");
            } else {
                System.out.println("El asiento ya está ocupado.");
            }
        } else {
            System.out.println("Coordenadas fuera de rango.");
        }
    }

    public void mostrarMapa() {
        System.out.println("--- MAPA DEL AUDITORIO ---");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(auditorio[i][j] + " ");
            }
            System.out.println();
        }
    }
}