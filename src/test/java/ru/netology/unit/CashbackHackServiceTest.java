package ru.netology.unit;

import org.junit.Test;


public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldReturn100IfAmountIs900Junit() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn0IfAmountIs1000Junit() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn200IfAmountIs1800Junit() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1800;

        int actual = service.remain(amount);
        int expected = 200;

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn100IfAmountIs900Jupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn0IfAmountIs1000Jupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn200IfAmountIs1800Jupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1800;

        int actual = service.remain(amount);
        int expected = 200;

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
}
