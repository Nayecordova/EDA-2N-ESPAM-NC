public class PilaLIFO {
    private int[] datos;
    private int cima;
    private int capacidad;

    public PilaLIFO(int capacidad) {
        this.capacidad = capacidad;
        datos = new int[capacidad];
        cima = -1; // Underflow inicial
    }

    public void push(int valor) {
        if (cima == capacidad - 1) {
            System.out.println("Desbordamiento (Overflow): Pila llena."); //
            return;
        }
        datos[++cima] = valor;
    }

    public int pop() {
        if (cima == -1) {
            System.out.println("Subdesbordamiento (Underflow): Pila vacía."); //
            return -1;
        }
        return datos[cima--];
    }
 
    
}
