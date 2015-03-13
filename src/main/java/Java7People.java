import java.util.NoSuchElementException;
import java.util.OptionalInt;

public class Java7People implements People {

    public Java7People(Person[] peopleList) {
    }

    @Override
    public Iterable<Integer> getAges() {
        return null;
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
