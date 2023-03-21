// Stats from https://www.betfirm.com/seeds-national-championship-odds/

import java.util.Scanner;

public class GamePicker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Team Seed: ");
        int inputOne = scan.nextInt();
        System.out.println("Enter Second Team Seed: ");
        int inputTwo = scan.nextInt();
        System.out.println("Enter Round of Tournament: ");
        int roundInput = scan.nextInt();
    
        System.out.println(runSimulation(inputOne,inputTwo, roundInput));


        scan.close();
    }

    public static boolean seedOneWin(int seedOne, int round){
        int total = (int) (Math.random() * 147 );
        if (round == 1) {
            if (seedOne == 1) {
                if (total <= 147) {
                    return true;
                }
            } else if (seedOne == 2) {
                if (total <= 138) {
                    return true;
                }
            } else if (seedOne == 3) {
                if (total <= 126) {
                    return true;
                }
            } else if (seedOne == 4) {
                if (total <= 117) {
                    return true;
                }
            } else if (seedOne == 5) {
                if (total <= 95) {
                    return true;
                }
            } else if (seedOne == 6) {
                if (total <= 91) {
                    return true;
                }
            } else if (seedOne == 7) {
                if (total <= 90) {
                    return true;
                }
            } else if (seedOne == 8) {
                if (total <= 72) {
                    return true;
                }
            } else if (seedOne == 9) {
                if (total <= 76) {
                    return true;
                }
            } else if (seedOne == 10) {
                if (total <= 58) {
                    return true;
                }
            } else if (seedOne == 11) {
                if (total <= 57) {
                    return true;
                }
            } else if (seedOne == 12) {
                if (total <= 53) {
                    return true;
                }
            } else if (seedOne == 13) {
                if (total <= 31) {
                    return true;
                }
            } else if (seedOne == 14) {
                if (total <= 22) {
                    return true;
                }
            } else if (seedOne == 15) {
                if (total <= 10) {
                    return true;
                }
            } else if (seedOne == 16) {
                if (total <= 1) {
                    return true;
                }
            } else {
                return false;
            }
        } else if (round == 2){
            int total2 = (int) (Math.random() * 101) + 1;
            if (seedOne == 1) {
                if (total2 <= 86) {
                    return true;
                }
            } else if (seedOne == 2) {
                if (total2 <= 67) {
                    return true;
                }
            } else if (seedOne == 3) {
                if (total2 <= 61) {
                    return true;
                }
            } else if (seedOne == 4) {
                if (total2 <= 60) {
                    return true;
                }
            } else if (seedOne == 5) {
                if (total2 <= 53) {
                    return true;
                }
            } else if (seedOne == 6) {
                if (total2 <= 47) {
                    return true;
                }
            } else if (seedOne == 7) {
                if (total2 <= 31) {
                    return true;
                }
            } else if (seedOne == 8) {
                if (total2 <= 21) {
                    return true;
                }
            } else if (seedOne == 9) {
                if (total2 <= 9) {
                    return true;
                }
            } else if (seedOne == 10) {
                if (total2 <= 41) {
                    return true;
                }
            } else if (seedOne == 11) {
                if (total2 <= 46) {
                    return true;
                }
            } else if (seedOne == 12) {
                if (total2 <= 42) {
                    return true;
                }
            } else if (seedOne == 13) {
                if (total2 <= 19) {
                    return true;
                }
            } else if (seedOne == 14) {
                if (total2 <= 9) {
                    return true;
                }
            } else if (seedOne == 15) {
                if (total2 <= 30) {
                    return true;
                }
            } else if (seedOne == 16) {
                if (total2 <= 0 ) {
                    return true;
                }
            } else {
                return false;
            }
        } else if (round == 3){
            int total3 = (int) (Math.random() * 100) + 1;
            if (seedOne == 1) {
                if (total3 <= 80) {
                    return true;
                }
            } else if (seedOne == 2) {
                if (total3 <= 72) {
                    return true;
                }
            } else if (seedOne == 3) {
                if (total3 <= 48) {
                    return true;
                }
            } else if (seedOne == 4) {
                if (total3 <= 31) {
                    return true;
                }
            } else if (seedOne == 5) {
                if (total3 <= 20) {
                    return true;
                }
            } else if (seedOne == 6) {
                if (total3 <= 35) {
                    return true;
                }
            } else if (seedOne == 7) {
                if (total3 <= 36) {
                    return true;
                }
            } else if (seedOne == 8) {
                if (total3 <= 60) {
                    return true;
                }
            } else if (seedOne == 9) {
                if (total3 <= 57) {
                    return true;
                }
            } else if (seedOne == 10) {
                if (total3 <= 38) {
                    return true;
                }
            } else if (seedOne == 11) {
                if (total3 <= 35) {
                    return true;
                }
            } else if (seedOne == 12) {
                if (total3 <= 9) {
                    return true;
                }
            } else if (seedOne == 13) {
                if (total3 <= 0) {
                    return true;
                }
            } else if (seedOne == 14) {
                if (total3 <= 0) {
                    return true;
                }
            } else if (seedOne == 15) {
                if (total3 <= 33) {
                    return true;
                }
            } else if (seedOne == 16) {
                if (total3 <= 0) {
                    return true;
                }
            } else {
                return false;
            }
        } else if (round == 4){
            int total4 = (int) (Math.random() * 100) + 1;
            if (seedOne == 1) {
                if (total4 <= 59) {
                    return true;
                }
            } else if (seedOne == 2) {
                if (total4 <= 48) {
                    return true;
                }
            } else if (seedOne == 3) {
                if (total4 <= 46) {
                    return true;
                }
            } else if (seedOne == 4) {
                if (total4 <= 59) {
                    return true;
                }
            } else if (seedOne == 5) {
                if (total4 <= 70) {
                    return true;
                }
            } else if (seedOne == 6) {
                if (total4 <= 20) {
                    return true;
                }
            } else if (seedOne == 7) {
                if (total4 <= 30) {
                    return true;
                }
            } else if (seedOne == 8) {
                if (total4 <= 67) {
                    return true;
                }
            } else if (seedOne == 9) {
                if (total4 <= 25) {
                    return true;
                }
            } else if (seedOne == 10) {
                if (total4 <= 11) {
                    return true;
                }
            } else if (seedOne == 11) {
                if (total4 <= 56) {
                    return true;
                }
            } else {
                return false;
            }
        } else if (round == 5){
            int total5 = (int) (Math.random() * 100) + 1;
            if (seedOne == 1) {
                if (total5 <= 62) {
                    return true;
                }
            } else if (seedOne == 2) {
                if (total5 <= 41) {
                    return true;
                }
            } else if (seedOne == 3) {
                if (total5 <= 65) {
                    return true;
                }
            } else if (seedOne == 4) {
                if (total5 <= 23) {
                    return true;
                }
            } else if (seedOne == 5) {
                if (total5 <= 43) {
                    return true;
                }
            } else if (seedOne == 6) {
                if (total5 <= 67) {
                    return true;
                }
            } else if (seedOne == 7) {
                if (total5 <= 33) {
                    return true;
                }
            } else if (seedOne == 8) {
                if (total5 <= 67) {
                    return true;
                }
            } else {
                return false;
            }
        } else if (round == 6){
            int total6 = (int) (Math.random() * 100) + 1;
            if (seedOne == 1) {
                if (total6 <= 65) {
                    return true;
                }
            } else if (seedOne == 2) {
                if (total6 <= 38) {
                    return true;
                }
            } else if (seedOne == 3) {
                if (total6 <= 36) {
                    return true;
                }
            } else if (seedOne == 4) {
                if (total6 <= 33) {
                    return true;
                }
            } else if (seedOne == 5) {
                if (total6 <= 0) {
                    return true;
                }
            } else if (seedOne == 6) {
                if (total6 <= 50) {
                    return true;
                }
            } else if (seedOne == 7) {
                if (total6 <= 100) {
                    return true;
                }
            } else if (seedOne == 8) {
                if (total6 <= 25) {
                    return true;
                }
            } else {
                return false;
            }
        }

        return false;
    }

    public static boolean seedTwoWin(int seedTwo, int round){
        int total = (int) (Math.random() * 147 );
        if (round == 1) {
            if (seedTwo == 1) {
                if (total <= 147) {
                    return true;
                }
            } else if (seedTwo == 2) {
                if (total <= 138) {
                    return true;
                }
            } else if (seedTwo == 3) {
                if (total <= 126) {
                    return true;
                }
            } else if (seedTwo == 4) {
                if (total <= 117) {
                    return true;
                }
            } else if (seedTwo == 5) {
                if (total <= 95) {
                    return true;
                }
            } else if (seedTwo == 6) {
                if (total <= 91) {
                    return true;
                }
            } else if (seedTwo == 7) {
                if (total <= 90) {
                    return true;
                }
            } else if (seedTwo == 8) {
                if (total <= 72) {
                    return true;
                }
            } else if (seedTwo == 9) {
                if (total <= 76) {
                    return true;
                }
            } else if (seedTwo == 10) {
                if (total <= 58) {
                    return true;
                }
            } else if (seedTwo == 11) {
                if (total <= 57) {
                    return true;
                }
            } else if (seedTwo == 12) {
                if (total <= 53) {
                    return true;
                }
            } else if (seedTwo == 13) {
                if (total <= 31) {
                    return true;
                }
            } else if (seedTwo == 14) {
                if (total <= 22) {
                    return true;
                }
            } else if (seedTwo == 15) {
                if (total <= 10) {
                    return true;
                }
            } else if (seedTwo == 16) {
                if (total <= 1) {
                    return true;
                }
            } else {
                return false;
            }
        } else if (round == 2){
            int total2 = (int) (Math.random() * 101) + 1;
            if (seedTwo == 1) {
                if (total2 <= 86) {
                    return true;
                }
            } else if (seedTwo == 2) {
                if (total2 <= 67) {
                    return true;
                }
            } else if (seedTwo == 3) {
                if (total2 <= 61) {
                    return true;
                }
            } else if (seedTwo == 4) {
                if (total2 <= 60) {
                    return true;
                }
            } else if (seedTwo == 5) {
                if (total2 <= 53) {
                    return true;
                }
            } else if (seedTwo == 6) {
                if (total2 <= 47) {
                    return true;
                }
            } else if (seedTwo == 7) {
                if (total2 <= 31) {
                    return true;
                }
            } else if (seedTwo == 8) {
                if (total2 <= 21) {
                    return true;
                }
            } else if (seedTwo == 9) {
                if (total2 <= 9) {
                    return true;
                }
            } else if (seedTwo == 10) {
                if (total2 <= 41) {
                    return true;
                }
            } else if (seedTwo == 11) {
                if (total2 <= 46) {
                    return true;
                }
            } else if (seedTwo == 12) {
                if (total2 <= 42) {
                    return true;
                }
            } else if (seedTwo == 13) {
                if (total2 <= 19) {
                    return true;
                }
            } else if (seedTwo == 14) {
                if (total2 <= 9) {
                    return true;
                }
            } else if (seedTwo == 15) {
                if (total2 <= 30) {
                    return true;
                }
            } else if (seedTwo == 16) {
                if (total2 <= 0 ) {
                    return true;
                }
            } else {
                return false;
            }
        } else if (round == 3){
            int total3 = (int) (Math.random() * 100) + 1;
            if (seedTwo == 1) {
                if (total3 <= 80) {
                    return true;
                }
            } else if (seedTwo == 2) {
                if (total3 <= 72) {
                    return true;
                }
            } else if (seedTwo == 3) {
                if (total3 <= 48) {
                    return true;
                }
            } else if (seedTwo == 4) {
                if (total3 <= 31) {
                    return true;
                }
            } else if (seedTwo == 5) {
                if (total3 <= 20) {
                    return true;
                }
            } else if (seedTwo == 6) {
                if (total3 <= 35) {
                    return true;
                }
            } else if (seedTwo == 7) {
                if (total3 <= 36) {
                    return true;
                }
            } else if (seedTwo == 8) {
                if (total3 <= 60) {
                    return true;
                }
            } else if (seedTwo == 9) {
                if (total3 <= 57) {
                    return true;
                }
            } else if (seedTwo == 10) {
                if (total3 <= 38) {
                    return true;
                }
            } else if (seedTwo == 11) {
                if (total3 <= 35) {
                    return true;
                }
            } else if (seedTwo == 12) {
                if (total3 <= 9) {
                    return true;
                }
            } else if (seedTwo == 13) {
                if (total3 <= 0) {
                    return true;
                }
            } else if (seedTwo == 14) {
                if (total3 <= 0) {
                    return true;
                }
            } else if (seedTwo == 15) {
                if (total3 <= 33) {
                    return true;
                }
            } else if (seedTwo == 16) {
                if (total3 <= 0) {
                    return true;
                }
            } else {
                return false;
            }
        } else if (round == 4){
            int total4 = (int) (Math.random() * 100) + 1;
            if (seedTwo == 1) {
                if (total4 <= 59) {
                    return true;
                }
            } else if (seedTwo == 2) {
                if (total4 <= 48) {
                    return true;
                }
            } else if (seedTwo == 3) {
                if (total4 <= 46) {
                    return true;
                }
            } else if (seedTwo == 4) {
                if (total4 <= 59) {
                    return true;
                }
            } else if (seedTwo == 5) {
                if (total4 <= 70) {
                    return true;
                }
            } else if (seedTwo == 6) {
                if (total4 <= 20) {
                    return true;
                }
            } else if (seedTwo == 7) {
                if (total4 <= 30) {
                    return true;
                }
            } else if (seedTwo == 8) {
                if (total4 <= 67) {
                    return true;
                }
            } else if (seedTwo == 9) {
                if (total4 <= 25) {
                    return true;
                }
            } else if (seedTwo == 10) {
                if (total4 <= 11) {
                    return true;
                }
            } else if (seedTwo == 11) {
                if (total4 <= 56) {
                    return true;
                }
            } else {
                return false;
            }
        } else if (round == 5){
            int total5 = (int) (Math.random() * 100) + 1;
            if (seedTwo == 1) {
                if (total5 <= 62) {
                    return true;
                }
            } else if (seedTwo == 2) {
                if (total5 <= 41) {
                    return true;
                }
            } else if (seedTwo == 3) {
                if (total5 <= 65) {
                    return true;
                }
            } else if (seedTwo == 4) {
                if (total5 <= 23) {
                    return true;
                }
            } else if (seedTwo == 5) {
                if (total5 <= 43) {
                    return true;
                }
            } else if (seedTwo == 6) {
                if (total5 <= 67) {
                    return true;
                }
            } else if (seedTwo == 7) {
                if (total5 <= 33) {
                    return true;
                }
            } else if (seedTwo == 8) {
                if (total5 <= 67) {
                    return true;
                }
            } else {
                return false;
            }
        } else if (round == 6){
            int total6 = (int) (Math.random() * 100) + 1;
            if (seedTwo == 1) {
                if (total6 <= 65) {
                    return true;
                }
            } else if (seedTwo == 2) {
                if (total6 <= 38) {
                    return true;
                }
            } else if (seedTwo == 3) {
                if (total6 <= 36) {
                    return true;
                }
            } else if (seedTwo == 4) {
                if (total6 <= 33) {
                    return true;
                }
            } else if (seedTwo == 5) {
                if (total6 <= 0) {
                    return true;
                }
            } else if (seedTwo == 6) {
                if (total6 <= 50) {
                    return true;
                }
            } else if (seedTwo == 7) {
                if (total6 <= 100) {
                    return true;
                }
            } else if (seedTwo == 8) {
                if (total6 <= 25) {
                    return true;
                }
            } else {
                return false;
            }
        }

        return false;
    }


    public static String runSimulation(int seedOne,int seedTwo, int round){


        if ((seedOneWin(seedOne, round)) && !(seedTwoWin(seedTwo, round))){
          return "Team One Wins!";
    } else if (!(seedOneWin(seedOne, round)) && (seedTwoWin(seedTwo, round))){
        return "Team Two Wins!";
    } else {
        int winner = (int)(Math.random() * 2);

        if (winner == 0) {
            return "Team One Wins!";
        } else {
            return "Team Two Wins!";
        }
    }
    }

}