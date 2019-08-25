package com.kandktech.amotp;

public class Calculate {
    public static String doCalcualtion(Operator op, String x1, String x2)
    {

        if (op == Operator.DIVISION && Double.parseDouble(x2) == 0){

            return "Second Value can not be Zero in Division";

        }

        return String.format("Result is : %.2f ",op.apply(Double.parseDouble(x1), Double.parseDouble(x2)));
    }
}
