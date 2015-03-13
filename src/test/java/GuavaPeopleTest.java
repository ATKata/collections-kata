public class GuavaPeopleTest extends Java7PeopleTest {

    @Override
    public People people(Person... peopleList) {
        return new GuavaPeople(peopleList);
    }

}
