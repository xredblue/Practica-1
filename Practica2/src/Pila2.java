import java.lang.*;
public class Pila2 {
    int tope;
    int tamano;
    String datos [];

    public Pila2 (int t){
        tope=0;
        tamano =t;
        datos= new String[t];
    }
    public void push (String x){
        datos[tope] = x;
        tope++;
    }
    public String pop(){
        tope --;
        return datos[tope];
    }

    public int vacia (){
        if(tope==0) return 1;
        else return 0;
    }
    public int llena(){
        if(tope==tamano) return 1;
        else return 0;
    }

    public void mostrar(){
        for(int i=tope-1;i>=0; i--){
            System.out.println(datos[i]);
        }
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String[] getDatos() {
        return datos;
    }

    public void setDatos(String[] datos) {
        this.datos = datos;
    }
}
