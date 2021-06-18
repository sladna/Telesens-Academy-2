package com.annasladkykh.lesson7.homework;

/*
4) Создайте лямбда-выражение, которое удаляет все пробелы из заданной строки и возвращает результат.
	Продемонстрируйте работу лямбда-выражения.
	"Helen Abdel Leon abc array var jMeter Selenium Yaguar" => "HelenAbdelLeonabcarrayvarjMeterSeleniumYaguar"
*/

public class LambdaTask4Demo {
    public static void main(String[] args) {
        String demoStr = "Helen Abdel Leon abc array var jMeter Selenium Yaguar";
        TrimOperation removeSpaces = initialString -> initialString.replaceAll("\\s", "");
        System.out.println(removeSpaces.stringWithoutSpaces(demoStr));
    }

}
