package FormasGeometricas;

public class Main {
    public static void main(String[] args) {

        Cuadrado Cuadrado_1 = new Cuadrado(0.0,0.0,10,17);
        Rectangulo Rectangulo_1 = new Rectangulo(0,4,14,28,0,10,1,18);
        Triangulo Tringulo_1 = new Triangulo(5.0,5.0,20.0,15.0);

        Forma miArray [] = new Forma[3];
        miArray[0]=Cuadrado_1;
        miArray[1]=Rectangulo_1;
        miArray[2]=Tringulo_1;

        for(int i=0; i< miArray.length;i++){
            System.out.println("Numero de objeto: "+i);
            System.out.println("Nombre del personaje:" + miArray[i].establece_nombre());
            System.out.println("Calculo area: " + miArray[i].calcular_area());
            System.out.println("Calculo perímetro: " + miArray[i].calcular_perimetro());
            System.out.println("----------------------------------------------------------");

        }



    }

}