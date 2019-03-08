package flexCal;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CsvReader {
    public List<String> read() {
        List<String> csvLines = new ArrayList<>();
        try {
            Path path = Paths.get(ClassLoader.getSystemResource("ExampleInput1.csv").toURI());
            Charset charset = Charset.forName("UTF-8");
            try (Stream<String> stream = Files.lines(path, charset)) {
                csvLines = stream
                        .collect(Collectors.toList());
            } catch (IOException e) {
                //TODO
                e.printStackTrace();
            }
        } catch (URISyntaxException u) {
            //TODO
            u.printStackTrace();
        }
        return csvLines;
    }

    public List<PimData> split(List<String> csvLines) {
        List<PimData> pimDataList = new ArrayList<>();
        for (String line : csvLines) {
            if (!line.startsWith("Item;Duration;")) {
                String[] fields = line.split(";");
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                //TODO use default constructor, check for nulls and empties
//                PimData pimData = new PimData(fields[0], Integer.valueOf(fields[1]), fields[2],
//                        LocalDate.parse(fields[3], dateFormatter), LocalDateTime.parse(fields[4], timeFormatter), LocalDateTime.parse(fields[5], timeFormatter), Boolean.valueOf(fields[6]), Boolean.valueOf(fields[7]), LocalDate.parse(fields[8], dateFormatter));
                PimData pimData = new PimData();
                pimDataList.add(pimData);
            }
        }
        return pimDataList;
    }
}
