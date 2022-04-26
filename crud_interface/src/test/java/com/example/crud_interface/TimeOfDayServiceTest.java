package com.example.crud_interface;

import com.example.crud_interface.services.TimeOfDayService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeOfDayServiceTest {

    @Test
    void fiveShouldReturnMorning() {
        var timeOfDayService = new TimeOfDayService();

        String expected = "morning";
        String result = timeOfDayService.getTimeOfDayPeriod(5);

        assertEquals(expected, result);

    }

    @Test
    void elevenShouldReturnMorning() {
        var timeOfDayService = new TimeOfDayService();

        String expected = "morning";
        String result = timeOfDayService.getTimeOfDayPeriod(11);

        assertEquals(expected, result);
    }

    @Test
    void sevenShouldReturnMorning() {
        var timeOfDayService = new TimeOfDayService();

        String expected = "morning";
        String result = timeOfDayService.getTimeOfDayPeriod(7);

        assertEquals(expected, result);
    }

    @Test
    void twelveShouldReturnAfternoon() {
        var timeOfDayService = new TimeOfDayService();

        String expected = "afternoon";
        String result = timeOfDayService.getTimeOfDayPeriod(12);

        assertEquals(expected, result);
    }

    @Test
    void thirteenShouldReturnAfternoon() {
        var timeOfDayService = new TimeOfDayService();

        String expected = "afternoon";
        String result = timeOfDayService.getTimeOfDayPeriod(13);

        assertEquals(expected, result);
    }

    @Test
    void fifteenShouldReturnAfternoon() {
        var timeOfDayService = new TimeOfDayService();

        String expected = "afternoon";
        String result = timeOfDayService.getTimeOfDayPeriod(15);

        assertEquals(expected, result);
    }

    @Test
    void sixteenShouldReturnEvening() {
        var timeOfDayService = new TimeOfDayService();

        String expected = "evening";
        String result = timeOfDayService.getTimeOfDayPeriod(16);

        assertEquals(expected, result);
    }

    @Test
    void eighteenShouldReturnEvening() {
        var timeOfDayService = new TimeOfDayService();

        String expected = "evening";
        String result = timeOfDayService.getTimeOfDayPeriod(18);

        assertEquals(expected, result);
    }

    @Test
    void twentyoneShouldReturnEvening() {
        var timeOfDayService = new TimeOfDayService();

        String expected = "evening";
        String result = timeOfDayService.getTimeOfDayPeriod(21);

        assertEquals(expected, result);
    }

    @Test
    void twentytwoShouldReturnEvening() {
        var timeOfDayService = new TimeOfDayService();

        String expected = "night";
        String result = timeOfDayService.getTimeOfDayPeriod(22);

        assertEquals(expected, result);
    }

    @Test
    void zerotwoShouldReturnEvening() {
        var timeOfDayService = new TimeOfDayService();

        String expected = "night";
        String result = timeOfDayService.getTimeOfDayPeriod(0);

        assertEquals(expected, result);
    }

    @Test
    void fourShouldReturnEvening() {
        var timeOfDayService = new TimeOfDayService();

        String expected = "night";
        String result = timeOfDayService.getTimeOfDayPeriod(4);

        assertEquals(expected, result);
    }

}