package codigo_java;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ultimoDigito;

        System.out.print("Digite o último dígito da placa do veículo: ");
        String placa = input.next();
        ultimoDigito = placa.charAt(0);

        switch (ultimoDigito) {
            case '1':
            case '2':
                System.out.println("O veículo pode circular às segundas.");
                break;
            case '3':
            case '4':
                System.out.println("O veículo pode circular às terças.");
                break;
            case '5':
            case '6':
                System.out.println("O veículo pode circular às quartas.");
                break;
            case '7':
            case '8':
                System.out.println("O veículo pode circular às quintas.");
                break;
            case '9':
            case '0':
                System.out.println("O veículo pode circular às sextas.");
                break;
            default:
                System.out.println("Dígito inválido. Por favor, insira um dígito de 0 a 9.");
        }
        input.close();
    }
}