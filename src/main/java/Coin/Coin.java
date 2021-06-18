package Coin;

// Abstract class that implements calculate method from ICalculate interface
public abstract class Coin implements ICalculate {

    //abstract method for each one of our currencies methods (ILS & USD)
    public abstract double getValue(double value);

    //Used by ILS class & USD for calculate the amount after currency convertor
    @Override
    public double calculate(double value) {
        return value;
    }

}
