package org.example.randomGeneration;

import org.example.randomGeneration.generatorInterface.DataGeneratorInterface;

import java.util.Random;

public class NumberDataGenerator implements DataGeneratorInterface {


    @Override
    public String panGenerator() {
        Random random = new Random();
        //for generating the 5 char
        StringBuilder firstFiveChar = new StringBuilder();
        int panCharLength = 5;
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < panCharLength; i++) {
            int index = random.nextInt(alphabets.length());
            firstFiveChar.append(alphabets.charAt(index));
        }
        //for generating the 4 digit number
        StringBuilder fourDigitNumber= new StringBuilder();
        int panNoLength = 4;
        String numberSet = "0123456789";
        for(int i=0; i<panNoLength; i++) {
            int index= random.nextInt(numberSet.length());
            fourDigitNumber.append(numberSet.charAt(index));
        }

        //for last single character
        int randomIndex = random.nextInt(alphabets.length());
        char randomChar = alphabets.charAt(randomIndex);

        //Generate Random pan number
        StringBuilder panNumber= new StringBuilder(firstFiveChar.append(fourDigitNumber.append(randomChar)));
        String result= panNumber.toString();
        return result;
    }

    @Override
    public String generateGSTINNumber(String PanNo) {
        Random random = new Random();
        StringBuilder gstinNumber = new StringBuilder();
        StringBuilder num = new StringBuilder("0");
        StringBuilder sc;
        int stateCodeNum = random.nextInt(37) + 1;

        if (stateCodeNum < 10) {
            sc = num.append(stateCodeNum);
            gstinNumber.append(sc.append(PanNo));
        } else {
            gstinNumber.append(stateCodeNum);
            gstinNumber.append(PanNo);
        }

        String entityCodeSet = "0123456789";
        int index = random.nextInt(entityCodeSet.length());
        gstinNumber.append(index);

        StringBuilder zonalCode = new StringBuilder("Z");
        gstinNumber.append(zonalCode);

        String checkSumDigitCodeSet = "0123456789";
        int index2 = random.nextInt(checkSumDigitCodeSet.length());
        gstinNumber.append(index2);

        return gstinNumber.toString();
    }

}
