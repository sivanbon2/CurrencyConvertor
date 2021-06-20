package Coin.LogsWriter;

import java.io.IOException;

public interface Logger {
    void writeToFile(String content) throws IOException;
}
