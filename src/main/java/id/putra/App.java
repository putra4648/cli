package id.putra;

import java.io.IOException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

public class App {
    public static void main(String[] args) throws ParseException, StreamReadException, DatabindException, IOException {
        Options options = new Options();

        options.addOption("pj", false, "extract json");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        if (cmd.hasOption("pj")) {
            ParseJSON.read(
                    "C:\\\\Users\\\\Putra\\\\Documents\\\\Project\\\\cli\\\\src\\\\main\\\\resources\\\\object.json");
        }

    }
}
