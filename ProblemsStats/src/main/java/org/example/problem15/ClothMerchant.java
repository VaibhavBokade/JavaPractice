package org.example.problem15;

public class ClothMerchant {
        public static void main(String[] args) {
            int[] clothPieces = {3, 42, 60, 6, 14};
            int totalCurtains = findTotalCurtains(5, clothPieces);
            System.out.println("Total curtains that can be made: " + totalCurtains);
        }

        public static int findTotalCurtains(int n, int[] clothPieces) {
            int totalCurtains = 0;
            for (int i = 0; i < n; i++) {
                totalCurtains += clothPieces[i] / 12;
            }
            return totalCurtains;
        }
    }

