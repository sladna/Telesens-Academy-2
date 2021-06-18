package com.annasladkykh.lesson7.lambda;

import com.annasladkykh.lesson7.Boxer;
import com.annasladkykh.lesson7.Fighter;

public class LambdaDemo {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        Boxer fighter1 = new Fighter();

        fighter.boxing();
        fighter1.boxing();

        Boxer fighter3 = new BoxerStudent();
        fighter3.boxing();

        //анонимный класс - класс без названия
        Boxer fighter4 = new Boxer() {
            @Override
            public void boxing() {
                System.out.println("New boxing technique");
            }

        };
        fighter4.boxing();

        System.out.println("Лямбда выражения");
        Boxer fighter5 = ()->System.out.println("New boxing technique");
        fighter5.boxing();

        Operation calcSum = (n1, n2)-> n1 + n2;
        Operation calcDiff = (n1, n2)-> n1 - n2;
        Operation calcMult = (n1, n2)-> n1 * n2;

        System.out.println(calcSum.calc(3,4));
        System.out.println(calcDiff.calc(3,4));
        System.out.println(calcMult.calc(3,4));

        System.out.println("-----------------");
        Operation calcSumExt = (n1, n2)-> {
            System.out.println("Вычисляю сумму 2 чисел");
            return n1 + n2;
        };

        System.out.println(calcSumExt.calc(3,2));

        System.out.println("------------------");
        //Operation calcSumUsingMethod1 =
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }
}
