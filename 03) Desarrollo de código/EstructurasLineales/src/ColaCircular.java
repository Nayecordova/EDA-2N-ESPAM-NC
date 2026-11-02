public class ColaCircular {
    private int[] cola;
    private int frente, finalCola, tamanio, capacidad;

    public ColaCircular(int capacidad) {
        this.capacidad = capacidad;
        cola = new int[capacidad];
        frente = 0;
        finalCola = -1;
        tamanio = 0;
    }

    public void enqueue(int valor) {
        if (tamanio == capacidad) {
            System.out.println("Cola llena (Overflow)");
            return;
        }
        // Avance modular O(1) requerido
        finalCola = (finalCola + 1) % capacidad; //
        cola[finalCola] = valor;
        tamanio++;
    }

    public int dequeue() {
        if (tamanio == 0) {
            System.out.println("Cola vacía (Underflow)");
            return -1;
        }
        int valor = cola[frente];
        frente = (frente + 1) % capacidad; // Avance modular
        tamanio--;
        return valor;
    }
 
    
}
