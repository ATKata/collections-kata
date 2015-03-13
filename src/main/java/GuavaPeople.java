import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static java.util.stream.Collectors.toList;

public class GuavaPeople implements People {

    public static final Function<Person, Integer> GET_AGE = new Function<Person, Integer>() {
        @Override
        public Integer apply(Person person) {
            return person.getAge();
        }
    };
    private final List<Person> personList;

    public GuavaPeople(Person... peopleList) {
        personList = Arrays.asList(peopleList);
    }

    @Override
    public Iterable<Integer> getAges() {
        return FluentIterable.from(personList).transform(GET_AGE);
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
