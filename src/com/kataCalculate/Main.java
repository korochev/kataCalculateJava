package com.kataCalculate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Console calculator for Arabic and Roman numbers v. 1.0.0");
        //Kata Java educational project

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - run\n2 - info");
        int cmd = Integer.parseInt(scanner.nextLine());
        if(cmd == 1){
            while (true) {
                System.out.println("Input");
                Calculate calc = new Calculate(renderStr(scanner.nextLine()));
                byte value = calc.getValue();
                String result = String.valueOf(value);
                if (calc.expression.typeOfNum.equals("Rome")) result = calc.convertToRome(value);
                System.out.println("Output:\n" + result);
                System.out.println("1 - repeat\n0 - exit");
                if(Integer.parseInt(scanner.nextLine()) == 0){
                    System.exit(1);
                }
            }
        } else if(cmd == 2) {
            /*Required format:
              - value is transferred in one line,
              - only addition, subtraction, separate, and increase (ex. a+b, a-b, a/b, a*b),
              - Arabic and Roman numbers: 1, 2, ... 5... or I, II, ... V
              - 1-10 characters*/

            System.out.println("Required format:\n- value is transferred in one line,\n- only addition, subtraction, separate, and increase (ex. a+b, a-b, a/b, a*b),\n- Arabic and Roman numbers: 1, 2, ... 5... or I, II, ... V\n- 1-10 characters");
            System.out.println("1 - proceed\n0 - exit");
            cmd = scanner.nextInt();
            if(cmd == 1){
                String[] a = {""};
                Main.main(a);
            } else if(cmd == 0) {
                System.exit(1);
            }

        }

    }

    private static expression renderStr(String input) {
        expression expression;
        String[] plus = input.split("\\+");
        String[] minus = input.split("-");
        String[] separate = input.split("/");
        String[] increase = input.split("\\*");
        
        if(plus.length == 2){
            expression = new expression(plus[0], plus[1], "plus");
        } else if(minus.length == 2){
            expression = new expression(minus[0], minus[1], "minus");
        } else if(separate.length == 2){
            expression = new expression(separate[0], separate[1], "separate");
        } else if(increase.length == 2){
            expression = new expression(increase[0], increase[1], "increase");
        } else {
            throw new InputMismatchException("Arithmetic operand isn`t supported.");
        }
        return expression;
    }
}
