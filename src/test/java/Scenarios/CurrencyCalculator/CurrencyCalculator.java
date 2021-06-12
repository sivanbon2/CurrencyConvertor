package Scenarios.CurrencyCalculator;

import Coin.Coin;
import Coin.CoinFactory.CoinFactory;
import Coin.CoinFactory.Coins;
import Coin.ILS.ILS;
import Coin.Result.Result;
import Coin.USD.USD;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class CurrencyCalculator implements Serializable {
    public static void main(String[] args) throws IOException {

        Coin ils = new ILS();
        Coin usd = new USD();

        //Technical number 8 - Use calculate to perform the calculate in Main
        System.out.println(ils.calculate(1));
        System.out.println(usd.calculate(1));

        //arr named result that contains all currency converter results
        ArrayList<Double> result = new ArrayList<>();
        String answer;

            do {
                //First screen scenario
                firstScreenQuestions();
                // Create new Scanner that the user will be able to choose 1/2 (int)
                Scanner userChoice = new Scanner(System.in); // Create a Scanner object
                if (userChoice.hasNextInt()) {
                    int userInt = userChoice.nextInt();
                    //Second screen - the user is able to enter Amount to Convert (double)
                    System.out.println("Please Enter Amount to Convert");
                    Scanner scanner = new Scanner(System.in);
                    //user input Validation
                    if (scanner.hasNextDouble()) {
                        double input = scanner.nextDouble();
                        if (userInt == 1) {
                            //If the user choose 1 - convert from USD TO ILS (Dollars to Shekels)
                            Coin usdValue = CoinFactory.getCoinsInstance(Coins.ILS);
                            double value = usdValue.calculate(input);
                            //Third screen
                            System.out.println(value);
                            //Getting results from results object
                            Result USD2ILS = new Result(value,  "USD to ILS");
                            System.out.println(USD2ILS.getResult());
                            //Adding value to result arr
                            result.add(value);
                        } else if (userInt == 2) {
                            //If the user choose 2 - convert from ILS TO USD (Shekels to Dollars)
                            Coin ilsValue = CoinFactory.getCoinsInstance(Coins.USD);
                            double value = ilsValue.calculate(input);
                            //Third screen
                            System.out.println(value);
                            //Getting results from results object
                            Result ILS2USD = new Result(value, "ILS to USD");
                            System.out.println(ILS2USD.getResult());
                            //Adding value to result arr
                            result.add(value);

                        } else {
                            //user input Validation
                            System.out.println("Invalid Choice, Please try again");
                        }
                    }
                }
                    //Third screen - If the user won't to proceed
                    System.out.println("Would you like to start over ?");
                    answer = userChoice.next();
                }

            while (answer.equals("Y") || answer.equals("y") );

        //Fourth screen - If the user doesn't won't to proceed
        if(answer.equals("N")|| answer.equals("n")) {
            System.out.println("Thanks for using currency converter");
            System.out.println("Your Currency Calculation " + result);
        }else {
            System.out.println("Invalid Choice, Please try again");
        }

    }
        public static void firstScreenQuestions(){
        //Present the first screen question inside the console
            System.out.println("Welcome to Currency converter");
            System.out.println("Please choose an option (1/2):");
            System.out.println("Choose 1 for Dollars to Shekels");
            System.out.println("Choose 2 for Shekels to Dollars");
        }

    }


