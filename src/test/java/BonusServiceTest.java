import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    @Test
    void shouldCalculateRegisteredAndUnderLimit() {

        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateRegisteredAndOverLimit() {

        BonusService service = new BonusService();
        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateRegisteredAndZeroBonuses() {

        BonusService service = new BonusService();
        long amount = 10_60;
        boolean registered = true;
        long expected = 0;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateRegisteredAndOneBonus() {

        BonusService service = new BonusService();
        long amount = 50_60;
        boolean registered = true;
        long expected = 1;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateRegisteredAndOneToTheLimit() {

        BonusService service = new BonusService();
        long amount = 16633_60;
        boolean registered = true;
        long expected = 499;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateRegisteredAndLimit() {

        BonusService service = new BonusService();
        long amount = 16667_60;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }


    @Test
    void shouldCalculateRegisteredAndOneMoreLimit() {

        BonusService service = new BonusService();
        long amount = 16700_60;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateUnRegisteredAndZeroBonuses() {

        BonusService service = new BonusService();
        long amount = 10_60;
        boolean registered = false;
        long expected = 0;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateUnRegisteredAndOneBonus() {

        BonusService service = new BonusService();
        long amount = 100_60;
        boolean registered = false;
        long expected = 1;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateUnRegisteredAndUnderLimit() {

        BonusService service = new BonusService();
        long amount = 49_900_60;
        boolean registered = false;
        long expected = 499;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateUnRegisteredAndLimit() {

        BonusService service = new BonusService();
        long amount = 50_000_60;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateUnRegisteredAndOverLimit() {

        BonusService service = new BonusService();
        long amount = 51_000_60;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }
}