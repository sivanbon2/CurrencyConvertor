import Coin.Coin;
import Coin.CoinFactory.CoinFactory;
import Coin.CoinFactory.CoinFactory;
import Coin.CoinFactory.Coins;
import Coin.ILS.ILS;
import Coin.Result.Result;
import Coin.USD.USD;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class CurrencyCalculator implements Serializable {
    public static void main(String[] args) {

        Coin ils = new ILS();
        Coin usd = new USD();

        //Technical number 8
        System.out.println(ils.calculate(1));
        System.out.println(usd.calculate(1));

        ArrayList<Double> result = new ArrayList<>();
        String answer;

            do {
                //First screen
                firstScreenQuestions();
                Scanner userChoice = new Scanner(System.in); // Create a Scanner object
                if (userChoice.hasNextInt()) {
                    int userInt = userChoice.nextInt();
                    //Second screen
                    System.out.println("Please Enter Amount to Convert");
                    Scanner scanner = new Scanner(System.in);
                    if (scanner.hasNextDouble()) {
                        double input = scanner.nextDouble();
                        if (userInt == 1) {
                            Coin usdValue = CoinFactory.getCoinsInstance(Coins.ILS);
                            double value = usd.calculate(input);
                            //Third screen
                            System.out.println(value);
                            Result USD2ILS = new Result(value,  "USD to ILS");
                            System.out.println(USD2ILS.getResult());
                            result.add(value);
                        } else if (userInt == 2) {
                            Coin ilsValue = CoinFactory.getCoinsInstance(Coins.USD);
                            double value = ils.calculate(input);
                            //Third screen
                            System.out.println(value);
                            Result ILS2USD = new Result(value, "ILS to USD");
                            System.out.println(ILS2USD.getResult());
                            result.add(value);

                        } else {
                            System.out.println("Invalid Choice, Please try again");
                        }
                    }
                }
                    //Third screen
                    System.out.println("Would you like to start over ?");
                    answer = userChoice.next();
                }

            while (answer.equals("Y") || answer.equals("y") );

        //Fourth screen
        if(answer.equals("N")|| answer.equals("n")) {
            System.out.println("Thanks for using currency converter");
            System.out.println("Your Currency Calculation " + result);
        }else {
            System.out.println("Invalid Choice, Please try again");
        }

        }

        public static void firstScreenQuestions(){
            System.out.println("Welcome to Currency converter");
            System.out.println("Please choose an option (1/2):");
            System.out.println("Choose 1 for Dollars to Shekels");
            System.out.println("Choose 2 for Shekels to Dollars");
        }
    }


