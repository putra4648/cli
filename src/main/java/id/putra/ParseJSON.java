package id.putra;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseJSON {
    private ParseJSON() {
    }

    private static String exitStatus = "y";
    private static AtomicInteger numbering = new AtomicInteger();

    /**
     * Read JSON file and print in terminal
     * 
     * @param jsonPath
     * @throws StreamReadException
     * @throws DatabindException
     * @throws IOException
     */
    public static void read(String jsonPath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode value = mapper
                .readTree(new File(jsonPath));

        Scanner scanner = new Scanner(System.in);

        while (exitStatus.equalsIgnoreCase("y")) {
            System.out.println("Keys: ");
            value.fields().forEachRemaining(v -> {
                System.out.println(numbering.incrementAndGet() + ". " + value.fieldNames().next());
            });

            System.out.print("Lanjut Y/N ? ");
            exitStatus = scanner.nextLine();

        }
        scanner.close();
    }
}
