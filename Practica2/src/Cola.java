import java.lang.*;
public class Cola {
    int entrada, salida, tam;
    String datos [];

    public Cola(int t) {
        tam = t;
        entrada = 0;
        salida =0;
        datos = new String[t];
    }
    public void insertar (String x){
        datos[entrada]=x;
        entrada++;
    }

    public String extraer (){
        String x= datos[salida];
        salida++;
        return x;
    }
    public int vacia (){
        if (entrada == salida)
            return 1;
        else return 0;
    }
    public int llena(){
        if (entrada==tam)
            return 1;
        else return 0;
    }
    public void mostrar(){
        for (int i=salida; i<entrada;i++)
        System.out.print(datos[i]);
        System.out.println("");
    }

}
