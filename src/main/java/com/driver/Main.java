package com.driver;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.meth());
    }

    static class B extends A {
        B() {
        }

        String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    static class A {
        A() {
        }

        String meth() {
            return "Invoking method from class A";
        }
    }
}
