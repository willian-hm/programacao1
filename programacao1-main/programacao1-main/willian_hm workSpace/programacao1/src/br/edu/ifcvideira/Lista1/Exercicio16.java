/* 16 – Desenvolva um programa para resolver um exercício da disciplina de física do
conteúdo que está sendo trabalhado atualmente. Deixe o enunciado descrito no
topo do arquivo de código-fonte. 

MACKENZIE-SP ) Um calorímetro de capacidade térmica 40 cal/°C contém 110g de água (calor especifico=1cal/g°C) a 20°C,  
Que massa de alumínio (calor específico = 0,2 cal/g.ºC), a 20º C, devemos colocar nesse colorímetro para esfriar a água a 80°C? */

package br.edu.ifcvideira.Lista1;

public class Exercicio16 {
    public static void main(String[] args) {
        
        System.out.println("Um calorímetro de capacidade térmica 40 cal/°C contém 110g de água (calor especifico=1cal/g°C) a 20°C, \r\n" + //
                        "Que massa de alumínio (calor específico = 0,2 cal/g.ºC), a 20º C, devemos colocar nesse colorímetro para esfriar a água a 80°C?");

        double Ccalorimetro;
        double cagua;
        double caluminio;
        double tagua;
        double magua;
        double taluminio;
        double taluminio1;
        double maluminio;
        double Qcalorimetro;
        double Qagua;
        double Qaluminio;

        Ccalorimetro = 40;
        taluminio = 80;
        tagua = 90;
        magua = 110;
        cagua = 1;
        caluminio = 0.2;
        taluminio1 = 20;

        Qcalorimetro = Ccalorimetro*(taluminio-tagua);
        Qagua = magua*cagua*(taluminio-tagua);
        Qaluminio = caluminio*(taluminio-taluminio1);

        maluminio = (Qcalorimetro + Qagua)/-Qaluminio;

        System.out.println("Quantidade de calor do calorimetro: " + Qcalorimetro);
        System.out.println("Quantidade de calor da água: " + Qagua);
        System.out.println("Quantidade de calor do alumínio: " + Qaluminio + "m (massa não identificada)");
        System.out.println(maluminio + "g de alumínio para esfriar a água a 80°C");
    }
}
