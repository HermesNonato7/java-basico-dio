package Ex3_sobrecargaReturn;

public class Main {
    public static void main(String[] args) {
        
        // Retorno
        System.out.println("Exerc�cio Retornos");

        double areaQuadrado = Quadrilatero2.area(3);
        System.out.println("�rea do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero2.area(5,5);
        System.out.println("�rea do ret�ngulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero2.area(7,8,9);
        System.out.println("�rea trap�zio: " + areaTrapezio);

    }
}
