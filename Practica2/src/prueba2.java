public class prueba2 {
    public static void main(String[] args) {
        Cola cEntrada = new Cola(4);
        cEntrada.insertar("5");
        cEntrada.insertar("-");
        cEntrada.insertar("+");
        cEntrada.insertar("8");
        System.out.println("NOTACION POSTFIJA");
        postfija p = new postfija(cEntrada);
        p.evaluar();
        cEntrada.mostrar();

        //String x= c.extraer();
        //postfija p = new postfija(c);


        //int op = p.operador(x);
      //  if (op==1) System.out.println("Es un operador");
      //  else {
        //    int res = Integer.valueOf(x);
         //   System.out.println("es un numero "+res);
         //   System.out.println("---------------------------");

        //}

    }
}
