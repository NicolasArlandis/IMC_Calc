package IMC_Calc;

import java.util.Scanner;

public class IMCProgram {
    public void executar() {
        double peso, altura, imc;
        Scanner scanner = new Scanner(System.in);

        System.out.println("*************");
        System.out.print(" Cálculo IMC\n");
        System.out.println("*************");

        System.out.println("Insira seu peso em quilogramas: ");
        peso = Double.parseDouble(scanner.nextLine());

        System.out.println("Insira sua altura em metros: ");
        altura = Double.parseDouble(scanner.nextLine());

        imc = calcularPeso(peso, altura);

        System.out.printf("\nSeu índice de massa corporal é: %.2f kg/m²\n", imc);
        System.out.printf("Classificação: %s.\n", IMC_Calc.IMCCalculator.classificarIMC(imc));
    }

    private double calcularPeso(double peso, double altura) {
        return peso / (altura * altura);
    }
}
