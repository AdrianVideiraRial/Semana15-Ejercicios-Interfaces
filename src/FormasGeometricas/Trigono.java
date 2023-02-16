package FormasGeometricas;

public abstract class Trigono {
    /**
     * Variables.
     * Creamos una variables de clase Punto.
     */

    private Punto [] vertices = new Punto[3];

    //-----------------------------------------------------------------------------------------

    /**
     * Constructores
     */

    public Trigono (){

    }

    /**
     * Métodos
     */

    public void setPuntos(Punto [] vertices){
        this.vertices = vertices;
    }

    public Punto[] getVertices (){
        return this.vertices;
    }

    //Asigna cada punto a un índice del array
    public void setVertices(Punto p1, Punto p2, Punto p3){

    }



}
