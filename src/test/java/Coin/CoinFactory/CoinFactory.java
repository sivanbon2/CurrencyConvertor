package Coin.CoinFactory;

import Coin.Coin;
import Coin.ILS.ILS;
import Coin.USD.USD;


public class CoinFactory {

    public static Coin getCoinsInstance(Coins coin){
        switch (coin){
            case ILS -> {
                System.out.println("USD to ILS");
                return new ILS();
            }
            case USD -> {
                System.out.println("USD to ILS");
                return new USD();
            }
        }
        return null;
    }


}
