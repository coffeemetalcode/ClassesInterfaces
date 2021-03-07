package com.coffeemetalcode.calcengine;

import java.time.LocalDate;
import java.util.Scanner;
import static com.coffeemetalcode.calcengine.MathEquation.*;

public class Main {

    public static void main(String[] args) {
    Divider divider = new Divider();
    doCalculation(divider, 100.0d, 50.0d);

    Adder adder = new Adder();
    doCalculation(adder, 25.0d, 92.0d);
        // performCalculations();
    }

    static void doCalculation(CalculateBase calculation, double leftVal, double rightVal) {
        calculation.setLeftVal(leftVal);
        calculation.setRightVal(rightVal);
        calculation.calculate();

        System.out.println("Calculation result " + calculation.getResult());
    }

    static void performCalculations() {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation();
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for(MathEquation equation : equations) {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }

        System.out.println("average of results = " + getAverageResult());

        System.out.print("\nUsing execute overloads\n\n");

        MathEquation equationOverload = new MathEquation('d');
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("Overload result with doubles " + equationOverload.getResult());

        int leftInt = 9;
        int rightInt = 4;

        equationOverload.execute(leftInt, rightInt);
        System.out.println("Overload result with ints " + equationOverload.getResult());
    }
}