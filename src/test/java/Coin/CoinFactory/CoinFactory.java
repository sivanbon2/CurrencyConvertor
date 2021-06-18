package Coin.CoinFactory;

import Coin.Coin;
import Coin.ILS.ILS;
import Coin.USD.USD;

/*
* A Factory Pattern or Factory Method Pattern says that just define an
interface or abstract class for creating an object but let the subclasses
decide which class to instantiate.*/

public class CoinFactory {
//Virtual Constructor
    public static Coin getCoinsInstance(Coins coin){
        switch (coin){
            case ILS -> {
                System.out.println("ILS to USD");
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
