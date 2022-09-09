
public class Estructura_datos {
    public static void main(String[] args) {
        Pila p = new Pila (3);
        Pila q = new Pila (3);
        System.out.println("Datos pila p");
        p.push(2);
        p.push(3);
        p.push(4);
        p.mostrar();
        System.out.println("datos pila q");
        q.push(1);
        q.push(2);
        q.push(3);
        q.mostrar();

        //suma de la tercera pila
        Pila r = new Pila(3);
        System.out.println("Mostrar la pila nueva");
        r.suma(p, q);
        r.mostrar();
    }
}
