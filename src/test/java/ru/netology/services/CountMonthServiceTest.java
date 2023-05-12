package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CountMonthServiceTest {

    @ParameterizedTest
    @CsvSource({
            "10000,3000,20000,3",
            "100000,60000,150000,2"
    })
    void CalculateHoliday(int income, int expenses, int threshold, int expected) {
        CountMonthService service = new CountMonthService();

      /*  int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int count = 3;
*/
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }


}
