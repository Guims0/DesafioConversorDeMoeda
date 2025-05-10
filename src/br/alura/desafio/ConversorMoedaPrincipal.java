package br.alura.desafio;

import java.util.*;

public class ConversorMoedaPrincipal {
    public static void main(String[] args) {
        Scanner escrito = new Scanner(System.in);
        Moeda moeda = new Moeda();
        MoedaEntrada moedaEntrada = new MoedaEntrada();
        Buscador busca = new Buscador();


        while (moedaEntrada.getEscolha()!= 7) {


            System.out.println("****************************************\n");
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda\n");

            System.out.println("1) Real brasileiro  =>>>>>>>>> Dolar");
            System.out.println("2) Dolar  =>>>>>>>>> Real brasileiro");
            System.out.println("3) Real brasileiro  =>>>>>>>>> Peso argentino");
            System.out.println("4)  Peso argentino =>>>>>>>>> Real brasileiro");
            System.out.println("5) Dolar  =>>>>>>>>>  Boliviano boliviano");
            System.out.println("6)  Peso colombiano  =>>>>>>>>> Dolar");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção valida");
            System.out.println("****************************************\n");
            moedaEntrada.setEscolha(escrito.nextInt());


            if (moedaEntrada.getEscolha() >= 1 && moedaEntrada.getEscolha() < 7) {
                System.out.println("Digite o valor que quer converter");
                moedaEntrada.setValor(escrito.nextDouble());
            } else if (moedaEntrada.getEscolha()> 7 ) {
                System.out.println("Escolha invalida");
                System.out.println("Tente novamente");
            }

            switch (moedaEntrada.getEscolha()) {
                case 1, 3:
                    moeda.setPalavraChave("BRL");
                    break;

                case 2, 5:
                    moeda.setPalavraChave("USD");
                    break;
                case 4:
                    moeda.setPalavraChave("ARS");
                    break;

                case 6:
                    moeda.setPalavraChave("COP");
                    break;
            }
            moeda = busca.busca(moeda);

            switch (moedaEntrada.getEscolha()) {

                case 1:

                    moedaEntrada.setValorFinal( moedaEntrada.getValor() * moeda.getConversion_rates().get("USD"));
                    System.out.println("O valor "+moedaEntrada.getValor() +" em, "+ moeda.getBase_code()+" corresponde ao valor final de =>>>>> "+moedaEntrada.getValorFinal()+" USD");
                    break;
                case 2:
                    moedaEntrada.setValorFinal( moedaEntrada.getValor() * moeda.getConversion_rates().get("BRL"));
                    System.out.println("O valor "+moedaEntrada.getValor() +" em, "+ moeda.getBase_code()+" corresponde ao valor final de =>>>>> "+moedaEntrada.getValorFinal()+" BRL");
                    break;
                case 3:
                    moedaEntrada.setValorFinal( moedaEntrada.getValor() * moeda.getConversion_rates().get("ARS"));
                    System.out.println("O valor "+moedaEntrada.getValor() +" em, "+ moeda.getBase_code()+" corresponde ao valor final de =>>>>> "+moedaEntrada.getValorFinal()+" ARS");
                    break;
                case 4:
                    moedaEntrada.setValorFinal( moedaEntrada.getValor() * moeda.getConversion_rates().get("BRL"));
                    System.out.println("O valor "+moedaEntrada.getValor() +" em, "+ moeda.getBase_code()+" corresponde ao valor final de =>>>>> "+moedaEntrada.getValorFinal()+" BRL");
                    break;
                case 5:
                    moedaEntrada.setValorFinal( moedaEntrada.getValor() * moeda.getConversion_rates().get("BOB"));
                    System.out.println("O valor "+moedaEntrada.getValor() +" em, "+ moeda.getBase_code()+" corresponde ao valor final de =>>>>> "+moedaEntrada.getValorFinal()+" BOB");
                    break;
                case 6:
                    moedaEntrada.setValorFinal( moedaEntrada.getValor() * moeda.getConversion_rates().get("USD"));
                    System.out.println("O valor "+moedaEntrada.getValor() +" em, "+ moeda.getBase_code()+" corresponde ao valor final de =>>>>> "+moedaEntrada.getValorFinal()+" USD");
                    break;
                case 7:
                    System.out.println("Tenha um otimo dia!!");
                    break;
            }
        }
    }
}
