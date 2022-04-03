package com.kataCalculate;

import java.util.InputMismatchException;

public class expression {
    byte firstOperator;
    byte secondOperator;
    String operand;
    String typeOfNum = "";

    expression(String firstOperator, String secondOperator, String operand){

        this.firstOperator = toByte(firstOperator.trim());
        this.secondOperator = toByte(secondOperator.trim());
        this.operand = operand;

        String string = "First operator: " + this.firstOperator + "\nSecond operator: " + this.secondOperator
                + "\nOperand: " + this.operand + "\nType: " + this.typeOfNum;
        System.out.println(string);
    }

    private byte toByte(String operator) {
        try {
            byte number = Byte.parseByte(operator);
            if(!this.typeOfNum.equals("Rome") && number < 11 && number > 0) {
                if(this.typeOfNum.equals("")) {
                    this.typeOfNum = "Arabic";
                }
                return number;
            }

        }
        catch(NumberFormatException e){
            if (!this.typeOfNum.equals("Arabic")){
                if(this.typeOfNum.equals("")) {
                    this.typeOfNum = "Rome";
                }
                switch (operator.toLowerCase()) {
                    case "i" -> {
                        return 1;
                    }
                    case "ii" -> {
                        return 2;
                    }
                    case "iii" -> {
                        return 3;
                    }
                    case "iv" -> {
                        return 4;
                    }
                    case "v" -> {
                        return 5;
                    }
                    case "vi" -> {
                        return 6;
                    }
                    case "vii" -> {
                        return 7;
                    }
                    case "viii" -> {
                        return 8;
                    }
                    case "ix" -> {
                        return 9;
                    }
                    case "x" -> {
                        return 10;
                    }
                }
            }
        }

        throw new InputMismatchException("Invalid arithmetic operator input format.");
    }
}
