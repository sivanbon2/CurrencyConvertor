package Coin.ILS;
import Coin.Coin;

//Currency class - Coin.ILS.Coin.ILS
public class ILS extends Coin {

    final double valueOf = 0.28;

    @Override
    public double getValue(double value) {
        return value;
    }

    @Override
    public double calculate(double input) {

        return input * getValue(valueOf);
    }

}
