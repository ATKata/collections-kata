import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.emptyIterable;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

public class Java8PeopleTest extends Java7PeopleTest {

    @Override
    public People people(Person... peopleList) {
        return new Java8People(peopleList);
    }

}
