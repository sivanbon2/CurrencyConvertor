package Coin;

// Abstract class that implements Coin.Coin.ICalculate interface
public abstract class Coin implements ICalculate {

    //abstract method
    public abstract double getValue(double value);

    @Override
    public double calculate(double value) {
        return value;
    }

}
