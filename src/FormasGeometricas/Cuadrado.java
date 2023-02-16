package FormasGeometricas;

public class Cuadrado extends Cuadrilatero implements Forma{
    /**
     * Variables
     */

    double lado;
    String nombre_figura = "Cuadrado";

    //-----------------------------------------------------------------------------------------

    /**
     * Constructor
     */

    public Cuadrado (){

    }

    public Cuadrado (double x1, double y1, double x2, double y2){

        /**
         * Lado = Raiz cuadrada de ((x2-x1)2 + (y2-y1)2).
         * Usamos la funcion Math.sqrt para la raiz cuadrada.
         * Usamo la funcion Math.pow para elevar a una potencia un número.
         */

        lado = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2-y1),2));

    }


    //-----------------------------------------------------------------------------------------

    /**
     * Métodos
     */

    //Metodos propios de la clase.



    //Metodos heredados del interface FORMA.

    @Override
    public void dibujar_puntos (){
    }

    @Override
    public void rellenar_forma (){
    }

    @Override
    public double calcular_area(){
        return lado*lado;
    }

    @Override
    public double calcular_perimetro(){
        return lado*4;
    }

    @Override
    public String establece_nombre(){
        return nombre_figura;
    }


}
