package Coin.ILS;
import Coin.Coin;

import java.io.Serializable;

//Currency class - ILS
public class ILS extends Coin implements Serializable {

    final double valueOf = 0.28;

    //Getter
    @Override
    public double getValue(double value) {

        return value;
    }

    //Calculation of fx
    @Override
    public double calculate(double input) {

        return input * getValue(valueOf);
    }

}
