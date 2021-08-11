/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao;

/**
 *
 * @author patrick.dalferth
 */
public class Revisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        parImpar objeto = new parImpar();
        
        objeto.vereficaparImpar(5);
        objeto.vereficaparImpar(20);
        // Laço de repetição FOR - Tabuada
        int tabuada = 2;
        
        for (int i = 0; i <= 10; i++){
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
    }
        
        
        // Laço de repetição WHILE - Enquanto
        int contador = 0;
        while(contador < 100) {
            System.out.println("Contador é menor que 100 = (" + (contador) +")");
            contador+=3;
        }
        System.out.println("Terminou o WHILE");
        
        //Laço de repetição DO WHILE - Contador
        do {
            System.out.println("Contador é menor que 100 = (" + (contador) +")");
            contador+=3;
            
        }while(contador < 100);
        System.out.println("Terminou o DO WHILE");
        
        double a = 5.4;
        double b = 6;
        soma(a, b);


    
        double num1 = 10;
        double num2 = 10;
        double num3 = 10;
        double num4 = 10;
        double num5 = 10;         
        media(num1, num2, num3);
        media2(num1, num2, num3, num4, num5);
     
        
    
    }
    private static void soma (double num1, double num2){
        //Criar uma função de soma
        System.out.println("Soma = " + (num1 + num2));
        
    }
    
    private static void media (double num1, double num2, double num3){
            System.out.println("Média = " + ((num1 + num2 + num3)/3));
            
            
}

    private static void media2(double num1, double num2, double num3, double num4, double num5) {
        System.out.println("Média = " + ((num1 + num2 + num3 + num4 + num5 )/5));
    }
}
