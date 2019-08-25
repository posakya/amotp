package com.kandktech.amotp;

public enum Operator {
    ADDITION("+") {
        @Override public double apply(double x1, double x2) {
            return x1 + x2;
        }
    },

    SUBTRACTION("-") {
        @Override public double apply(double x1, double x2) {
            return x1 - x2;
        }
    },

    MULTIPLICATION("*") {
        @Override
        public double apply(double x1, double x2) {
            return x1 * x2;
        }
    },

    DIVISION("/") {
        @Override public double apply(double x1, double x2) {
            return x1 / x2;
        }
    };


    private final String text;

    private Operator(String text) {
        this.text = text;
    }


    @Override public String toString() {
        return text;
    }

    public abstract double apply(double x1, double x2);
}
