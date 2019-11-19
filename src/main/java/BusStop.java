import java.util.ArrayList;

public class BusStop {

        private String name;
        private ArrayList<Person> person;

        public BusStop(String name){
            this.name = name;
            this.person = new ArrayList<Person>();
        }

    public int stopCount() {
            return this.person.size();
    }

    public void addPerson(Person person) {
            this.person.add(person);
    }

    public Person removePerson(Person personToRemove) {
        int index = this.person.indexOf(personToRemove);
        return this.person.remove(index);
    }
}
