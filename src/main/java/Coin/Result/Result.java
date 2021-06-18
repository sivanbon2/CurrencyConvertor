package Coin.Result;

public class Result {
   private String valueType;
   private  double value;

    //Result constructor
    public Result(double value, String valueType) {
        this.valueType = valueType;
        this.value = value;
    }

    // Getter
    public String getResult() {
        return valueType + value;
    }

}
