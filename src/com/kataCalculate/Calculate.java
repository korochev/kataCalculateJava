package com.kataCalculate;

import java.util.InputMismatchException;

public class Calculate {
    expression expression;

    Calculate(expression expression){
        this.expression = expression;
    }

    public byte getValue() {

        byte res = 0;
        if(this.expression.operand.equals("plus")) {
            res = (byte) (this.expression.firstOperator + this.expression.secondOperator);
        } else if(this.expression.operand.equals("minus")) {
            res = (byte) (this.expression.firstOperator - this.expression.secondOperator);
        } else if(this.expression.operand.equals("separate")) {
            res = (byte) (this.expression.firstOperator / this.expression.secondOperator);
        } else if(this.expression.operand.equals("increase")) {
            res = (byte) (this.expression.firstOperator * this.expression.secondOperator);
        }

        return res;
    }

    public String convertToRome(byte res) {

        if(res < 1) {
            throw new InputMismatchException("The Roman numeral system provides only positive values.");
        }

        String[] numOfRome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        return numOfRome[res-1];
    }
}
