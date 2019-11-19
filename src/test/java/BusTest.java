import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private Person person2;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Ocean Terminal", 20);
        person = new Person();
        person2 = new Person();
        busStop = new BusStop("CodeClan");
        busStop.addPerson(person);
    }

    @Test
    public void passengerCount(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void addPassengerToBus(){
        bus.addPassengerFromBusStop(busStop, person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void removedPassengerFromBus(){
        bus.addPassengerFromBusStop(busStop, person);
        bus.addPassengerFromBusStop(busStop, person2);
        Person removedPerson = bus.removePassenger(person2);
        assertEquals(1, bus.passengerCount());
        assertEquals(person2, removedPerson);
    }
}
