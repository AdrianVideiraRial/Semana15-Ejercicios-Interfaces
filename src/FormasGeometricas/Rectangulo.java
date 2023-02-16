package FormasGeometricas;

public class Rectangulo extends Cuadrilatero implements Forma{
    /**
     * Variables
     */

    double base;
    double altura;
    String nombre_figura = "Rectangulo";

    //-----------------------------------------------------------------------------------------

    /**
     * Constructor
     */
    public Rectangulo (){

    }

    public Rectangulo (double x1, double x2, double y1, double y2, double x3, double x4, double y3, double y4){
        base = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2-y1),2));
        altura = Math.sqrt(Math.pow((x4 - x3),2) + Math.pow((y4-y3),2));
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
        return base*altura;
    }

    @Override
    public double calcular_perimetro(){
        return 2*(base+altura);
    }

    @Override

    public String establece_nombre(){
        return nombre_figura;
    }


}
