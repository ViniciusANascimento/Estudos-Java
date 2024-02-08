/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabanco;

import java.util.Scanner;

/**
 *
 * @author dev10
 */
public class ContaTerminal {

    public static void main(String[] args) {
        //variaveis
        Scanner sc = new Scanner(System.in);
        double saldo = 237.48%2;
        String nomeCliente, nomeBanco, numeroConta, numeroAgencia;
        
        System.out.println("Ola, digite seu nome: ");
        nomeCliente = sc.next();
        
        System.out.println(String.format("Prazer %s, qual o seu banco ? ",nomeCliente));
        nomeBanco = sc.next();
        
        System.out.println("Certo, qual o sua agencia? ");
        numeroAgencia = sc.next();
        
        System.out.println("Agora insira o numero da sua conta: ");
        numeroConta = sc.next();
        
        System.out.println(String.format("Ola %s, obrigado por criar sua conta em nosso banco, sua agencia é %s, conta %s, com saldo disponivel %f para saque!",
                                            nomeCliente,numeroAgencia,numeroConta,saldo));
        
        System.out.print(String.format("O banco %s agradece sua atenção", nomeBanco));
    }
}
