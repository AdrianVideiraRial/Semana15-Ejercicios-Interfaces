package FormasGeometricas;

public interface Forma {

    public void dibujar_puntos ();

    public void rellenar_forma ();

    public double calcular_area();

    public double calcular_perimetro();

    public String establece_nombre();

    /**
     * ATEINCION:
     * La unica forma que encontre de hacer que un metodo de una interface devuelva un valor es
     * colocando el modificador de acceso static o default delante del metodo. Sin estas palabras clave, el metodo da error.
     * Además de que tampoco he encontrado la forma de sobreescribir estos métodos desde otra clase.
     * Estos dos métodos get_calcular_area y get_calcular_perimetro son accesibles desde la clase en la que son implementados.
     */

    default public double get_alcular_area (){
        return 0.0;
    }
    default public double get_calcular_perimetro (){
        return 0.0;
    }

}
