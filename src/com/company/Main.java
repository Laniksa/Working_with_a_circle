package com.company;

import java.util.Scanner;

public class Main {
    public static double pi = 3.14;

    public static double lineToNumeric(String str){
        double okr = 0;
        try{
           okr = Double.parseDouble(str);
        }catch(NumberFormatException e){
            System.out.println("Вы не верно ввели размер окружности");
        }
        return okr;
    }

    public static void area(double okr){
        System.out.println("Площадь окружности равна: "+(okr*okr)*pi);
    }

    public static void circle (double okr){
        System.out.println("Длина окружности равна: "+2*pi*okr);
    }

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        String line = scan.nextLine();
        area(lineToNumeric(line));
        circle(lineToNumeric(line));

    }
}
