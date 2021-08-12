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
public class TerminalBanco {
    
    public static void main(String[] args) {
        
        Conta conta1 = new Conta(1,123,"Patrick",500);
        
    
        
        Conta conta2 = new Conta(1,333,"Juca",1000);
        

        

        conta1.sacar(50);

        conta1.deposito(1000);
        System.out.println(conta1.toString());
        conta1.transfere(conta2, 50);
        System.out.println(conta1.toString());
        System.out.println(conta2.toString());


    }
}