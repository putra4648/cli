package id.putra;

import java.io.IOException;

import org.apache.commons.cli.ParseException;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import id.putra.prompt.JsonPrompt;

public class App {
    public static void main(String[] args) throws ParseException, StreamReadException, DatabindException, IOException {
        Terminal terminal = TerminalBuilder.terminal();
        LineReader lineReader = LineReaderBuilder.builder()
                .terminal(terminal)
                .build();

        String menu = """
                Choose menu:
                1. jsx -> Json Extractorr
                Select menu >
                """;

        JsonPrompt.init(lineReader);

        String line = lineReader.readLine("Prompt> ");
        System.out.println(line);

        // if (cmd.hasOption("pj")) {
        // ParseJSON.read(
        // "C:\\\\Users\\\\Putra\\\\Documents\\\\Project\\\\cli\\\\src\\\\main\\\\resources\\\\object.json");
        // }

    }
}
