package FormasGeometricas;

public class Triangulo extends Trigono implements Forma{
    /**
     * Variables
     */

    double lado;
    double base;
    double altura;
    String nombre_figura = "Triangulo";

    //-----------------------------------------------------------------------------------------

    /**
     * Constructor
     * Partiremos de la base que son triangulos con lados iguales para no complicar el ejericio.
     */

    public Triangulo (){

    }

    public Triangulo (double x1, double y1, double x2, double y2){

        /**
         * Lado = Raiz cuadrada de ((x2-x1)2 + (y2-y1)2).
         * Usamos la funcion Math.sqrt para la raiz cuadrada.
         * Usamo la funcion Math.pow para elevar a una potencia un número.
         */

        lado = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2-y1),2));
        base = lado;

        /**
         * Usamo el teorema de pitagoras para calcular la altura h2=c2+c2
         * Entendiendo que hablamos de un triangulo rectangulo lo dividimos a la mitad y despejamos la altura que sería uno de los catetos.
         */
        altura = Math.sqrt(Math.pow(lado,2)- Math.pow((lado/2),2)); //Hipotenusa2=Cateto2+Cateto2

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
        return (base*altura)/2;
    }

    @Override
    public double calcular_perimetro(){
        return lado+lado+lado;
    }

    @Override
    public String establece_nombre(){
        return nombre_figura;
    }


}
