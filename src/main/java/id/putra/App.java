package id.putra;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;

public class App {
    public static void main(String[] args) {
        Options options = new Options();

        options.addOption("t", false, "display current time");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        if (cmd.hasOption("t")) {
            System.out.println("current version 1.0");
        }
    }
}
