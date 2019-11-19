import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassengerFromBusStop(BusStop busStop, Person personToRemove) {
        Person person = busStop.removePerson(personToRemove);
        this.passengers.add(person);
    }

    public Person removePassenger(Person personToRemove) {
        int index = this.passengers.indexOf(personToRemove);
        return this.passengers.remove(index);
    }
}
