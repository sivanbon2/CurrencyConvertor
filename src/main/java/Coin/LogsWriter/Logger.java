package Coin.LogsWriter;

import java.io.IOException;

public interface Logger {
    void write(String log) throws IOException;
}
