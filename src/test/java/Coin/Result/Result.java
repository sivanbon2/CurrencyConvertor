package Coin.Result;

public class Result {
    String UsdToIls;
    String IlsToUsd;
    double value;


    public Result(double value, String ilsToUsd) {
        this.IlsToUsd = ilsToUsd;
        this.value = value;
    }
//
//    public Result(double value, String UsdToIls) {
//        this.UsdToIls = UsdToIls;
//    }

}
//
//public class Main {
//    int modelYear;
//    String modelName;
//
//    public Main(int year) {
//        modelYear = year;
//    }
//    public Main(String name) {
//        modelName = name;
//    }
//
//    public static void main(String[] args) {
//        Main myCar = new Main(1969);
//        System.out.println(myCar.modelYear);
//    }
//}
