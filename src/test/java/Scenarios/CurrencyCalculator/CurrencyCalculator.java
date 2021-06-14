package Scenarios.CurrencyCalculator;

import Coin.Coin;
import Coin.CoinFactory.CoinFactory;
import Coin.CoinFactory.Coins;
import Coin.ILS.ILS;
import Coin.LogsWriter.LogsWriter;
import Coin.Result.Result;
import Coin.USD.USD;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CurrencyCalculator {

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
                //Present the first screen question inside the console
                System.out.println("Welcome to Currency converter");
                System.out.println("Please choose an option (1/2):");
                System.out.println("Choose 1 for Dollars to Shekels");
                System.out.println("Choose 2 for Shekels to Dollars");
                // Create new Scanner that the user will be able to choose 1/2 (int)
                Scanner userChoice = new Scanner(System.in); // Create a Scanner object
                if (userChoice.hasNextInt()) {
                    int userInt = userChoice.nextInt();
                    //Second screen - the user is able to enter Amount to Convert (double)
                    System.out.println("Please Enter Amount to Convert");
                    //user input Validation
                    if (userChoice.hasNextDouble()) {
                        double input = userChoice.nextDouble();
                        if (userInt == 1) {
                            //If the user choose 1 - convert from USD TO ILS (Dollars to Shekels)
                            Coin usdValue = CoinFactory.getCoinsInstance(Coins.ILS);
                            assert usdValue != null;
                            double value = usdValue.calculate(input);

                            //Third screen
                            System.out.println(value);
                            //Getting results from results object
                            Result USD2ILS = new Result(value,  "USD to ILS");
                            System.out.println(USD2ILS.getResult());
                            result.add(value);//Adding value to result arr
                           LogsWriter.getInstance().writeToFile(USD2ILS.getResult()); //Write results to a file

                        } else if (userInt == 2) {
                            //If the user choose 2 - convert from ILS TO USD (Shekels to Dollars)
                            Coin ilsValue = CoinFactory.getCoinsInstance(Coins.USD);
                            assert ilsValue != null;
                            double value = ilsValue.calculate(input);

                            //Third screen
                            System.out.println(value);
                            //Getting results from results object
                            Result ILS2USD = new Result(value, "ILS to USD");
                            System.out.println(ILS2USD.getResult());
                            result.add(value);//Adding value to result arr
                            LogsWriter.getInstance().writeToFile(ILS2USD.getResult());//Write results to a file

                        } else {
                            System.out.println("Invalid Choice, Please try again");//user input Validation
                        }
                    }
                }
                    //Third screen - Question to the user
                    System.out.println("Would you like to start over ?");
                    answer = userChoice.next();
                }
            while (answer.equals("Y") || answer.equals("y") ); //while answer Y or y - user will start over

        //Fourth screen - If the user doesn't won't to proceed
        if(answer.equals("N")|| answer.equals("n")) {
            System.out.println("Thanks for using currency converter");
            System.out.println("Your Currency Calculation " + result);
        }else {
            System.out.println("Invalid Choice, Please try again");
        }

    }

}


