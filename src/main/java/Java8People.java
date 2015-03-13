import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Java8People implements People {

    private final List<Person> personList;

    public Java8People(Person... peopleList) {
        personList = Arrays.asList(peopleList);
    }

    @Override
    public Iterable<Integer> getAges() {
        return personList.stream()
                .mapToInt(Person::getAge)
                .boxed().collect(toList());
    }

    @Override
    public Iterable<Person> getPeopleOverAge(int minAge) {
        return personList.stream()
                .filter((person) -> person.getAge() > minAge)
                .collect(toList());
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
