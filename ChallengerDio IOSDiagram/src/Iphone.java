import java.util.Scanner;

import aparelhoComunicacao.*;

public class Iphone{
    public static void main(String[] args) throws Exception {
        //variaveis
        AparelhoCelular iphonCelular = new AparelhoCelular();
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("Bem vindo ao IPHONE");
        System.out.println("O que deseja realizar?");
        System.out.println("1 - Ouvir Musica, 2 - Ligações, 3 - Internet");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                iphonCelular.selecionarMusica();                
                break;
            case 2:
                iphonCelular.iniciarCorreioVoz();
            case 3:
                iphonCelular.abrirPagina();
            default:
                break;
        }

    }
}
