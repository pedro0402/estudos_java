package PooJiraya.Aintroducaoclasses.test;

import PooJiraya.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.nome = "HB20";
        carro1.ano = 2024;
        carro1.modelo = "Sedan";

        Carro carro2 = new Carro();
        carro2.nome = "Corolla";
        carro2.ano = 2021;
        carro2.modelo = "Sedan";

        System.out.println("Carro 1: ");
        System.out.println("Nome: " + carro1.nome + " Ano: " + carro1.ano + " Modelo: " + carro1.modelo);
        System.out.println("\nCarro 2: ");
        System.out.println("Nome: " + carro2.nome + " Ano: " + carro2.ano + " Modelo: " + carro2.modelo);

    }
}
