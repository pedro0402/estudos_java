package PooJiraya.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoiNumeros(){
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int a, int b) {
        System.out.println(a * b);
    }

    public double divideDoisNumeros(double a, double b){
        if (b == 0){
            return 0;
        }
        return a / b;
    }

}
