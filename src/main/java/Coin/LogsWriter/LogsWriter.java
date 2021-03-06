package Coin.LogsWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class LogsWriter implements Logger{
    private static LogsWriter instance = null;

    private LogsWriter() {}

    public static LogsWriter getInstance() {
        if (instance == null) {
            instance = new LogsWriter();
        }
        return instance;
    }

    @Override
    public void writeToFile(String content)throws IOException {
        String filePath = "/Users/home/Desktop/Results.txt";
        Files.writeString(Path.of(filePath), content + "\n", StandardOpenOption.APPEND);
    }

}