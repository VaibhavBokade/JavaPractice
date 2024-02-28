package org.example.randomGeneration;

import org.example.randomGeneration.generatorInterface.DataGeneratorInterface;

public class NumberGeneratorRunner {
    public static void main(String[] args) {
        DataGeneratorInterface generateData = new NumberDataGenerator();
        String panNumber = generateData.panGenerator();
        System.out.println(panNumber);
        String gstinNumber = generateData.generateGSTINNumber(panNumber);
        System.out.println(gstinNumber);
    }
}
