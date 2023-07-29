package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class StatsServiceTest {

    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] seals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(seals);
        long expected = 8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] seals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(seals);
        long expected = (8+ 15+ 13+ 15+ 17+ 20+ 19+ 20+ 7+ 14+ 14+ 18) /12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMaximum() {
        StatsService service = new StatsService();
        long[] seals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMaximum(seals);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testMonthMinimum() {
        StatsService service = new StatsService();
        long[] seals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMinimum(seals);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBelowAverage() {
        StatsService service = new StatsService();
        long[] seals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.belowAverage(seals);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAboveAverage() {
        StatsService service = new StatsService();
        long[] seals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.aboveAverage(seals);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}