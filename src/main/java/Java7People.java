import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Java7People implements People {

    private final List<Person> personList;

    public Java7People(Person... peopleList) {
        personList = Arrays.asList(peopleList);
    }

    @Override
    public Iterable<Integer> getAges() {
        List<Integer> ages = new ArrayList<>();
        for(Person person:personList){
            ages.add(person.age);
        }
        return ages;
    }

    @Override
    public Iterable<Person> getPeopleOverAge(int minAge) {
        return null;
    }

    @Override
    public Iterable<Person> getPeopleBelowAge(int maxAge) {
        return null;
    }

    @Override
    public int getSumOfAllAges() {
        return 0;
    }

    @Override
    public int getThirdHighestAge() throws NoSuchElementException {
        return 0;
    }

    @Override
    public int getHairColourOfSecondTallestPersonOverAge(int minAge) {
        return 0;
    }
}
