public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DE ESTRUCTURAS DE DATOS LINEALES ===");
        
        // Simulación del Caso del Foro (Matriz)
        CasoForo cine = new CasoForo(3, 3);
        cine.mostrarMapa();
        cine.reservarAsiento(1, 1);
        cine.mostrarMapa();
        
        // Demostración de Pila y Cola
        PilaLIFO pila = new PilaLIFO(5);
        pila.push(10);
        System.out.println("Pila pop: " + pila.pop());
        
        ColaCircular cola = new ColaCircular(3);
        cola.enqueue(100);
        System.out.println("Cola dequeue: " + cola.dequeue());
    }

}
