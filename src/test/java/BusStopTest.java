import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;
    private Person person2;

    @Before
    public void before(){
        busStop = new BusStop("CodeClan");
        person = new Person();
        person2 = new Person();
    }

    @Test
    public void personCount(){
        assertEquals(0, busStop.stopCount());
    }

    @Test
    public void addPersonToStop(){
        busStop.addPerson(person);
        assertEquals(1, busStop.stopCount());
    }

    @Test
    public void removePersonFromStop(){
        busStop.addPerson(person);
        busStop.addPerson(person2);
        Person removedPerson = busStop.removePerson(person2);
        assertEquals(1, busStop.stopCount());
        assertEquals(person2, removedPerson);
    }
}
