import org.w3c.dom.ls.LSOutput;

public class postfija {
    Cola colaEntrada;

    postfija(Cola centrada){
        colaEntrada =centrada;
    }


    public void evaluar(){
        int i = 0;
    }

        String dato = colaEntrada.extraer();

        int op = operador(dato);
        if(op==1) //no entiendo porque me marca error este if
        else {
           String res = dato;
           // int res = Integer.valueOf(dato);
          //  System.out.println("es un numero "+res);
            Cola fu = new Cola(colaEntrada.tam);
            fu.insertar(res);
            fu.mostrar();
        }

    public  int operador (String cad){
        switch (cad)
        {
            case "+":
            case "-":
            case "*":
            case "/":
                return 1;
        }
        return 0;
    }
}
