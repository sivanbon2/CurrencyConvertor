package Coin.Result;

public class Result {
    String valueType;
    double value;

    public Result(double value, String valueType) {
        this.valueType = valueType;
        this.value = value;
    }

    // Getter
    public String getResult() {
        return valueType + value;
    }
}
