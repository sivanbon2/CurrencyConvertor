package Coin.USD;
import Coin.Coin;

//Currency class - Coin.USD.Coin.USD
public class USD extends Coin {

    final double valueOf = 3.52;

    @Override
    public double getValue(double value) {
        return value;
    }

    @Override
    public double calculate(double input) {

        return input * getValue(valueOf);
    }
}
