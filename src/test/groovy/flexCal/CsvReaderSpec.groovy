package flexCal

import spock.lang.Specification

class CsvReaderSpec extends Specification {
    def "Csv file is found and can be read"() {
        setup:
        def csvReader = new CsvReader()

        when:
        def result = csvReader.read()

        then:
        result != null
    }

    def "Csv file is split"() {
        setup:
        def csvReader = new CsvReader()
        def result = csvReader.read()

        when:
        def output = csvReader.split(result)

        then:
        output != null
    }
}
