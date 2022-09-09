
public class Pila {
    int tope;
    int tamano;
    int datos [];
    
        public Pila (int t){
           tope=0;
           tamano =t;
           datos= new int [t];
        }
        public void push (int x){
        datos[tope] = x;
        tope++;
        }
        public int pop(){
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

    public int[] getDatos() {
        return datos;
    }

    public void setDatos(int[] datos) {
        this.datos = datos;
    }
    
    
       
    public void suma (Pila a, Pila b){
        Pila suma = new Pila(tamano);
        
        while (a.llena() != 1){
            a.push(0);
        }
        
        while (b.llena() != 1){
            b.push(0);
        }
        
        int i;
        for (i = 0; i<suma.getTamano(); i++){
            suma.push(a.pop() + b.pop());
        }
        
        for (i = 0; i<suma.getTamano(); i++){
            push(suma.pop());
        }
        
    }
}
