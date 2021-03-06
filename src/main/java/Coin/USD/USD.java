package Coin.USD;
import Coin.Coin;

import java.io.Serializable;

//Currency class - USD
public class USD extends Coin implements Serializable {

    final double valueOf = 3.52;

    //Getter
    @Override
    public double getValue(double value) {
        return value;
    }

    //calculation of fx
    @Override
    public double calculate(double input) {

        return input * getValue(valueOf);
    }
}
