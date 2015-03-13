import java.util.NoSuchElementException;
import java.util.OptionalInt;

public interface People {
    public Iterable<Integer> getAges();

    public Iterable<Person> getPeopleOverAge(int minAge);

    public Iterable<Person> getPeopleBelowAge(int maxAge);

    public int getSumOfAllAges();

    public int getThirdHighestAge() throws NoSuchElementException;

    public int getHairColourOfSecondTallestPersonOverAge(int minAge);
}
