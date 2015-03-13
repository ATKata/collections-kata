import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.fail;

public class Java7PeopleTest {
    private static final Person TEGWEN_22_164_BLACK    = new Person("Tegwen", 22, 164, HairColour.BLACK);
    private static final Person TOMMIE_21_175_GINGER   = new Person("Tommie", 21, 175, HairColour.GINGER);
    private static final Person ADELAIDE_38_165_GREY    = new Person("Adelaide", 38, 165, HairColour.GREY);
    private static final Person CELESTE_52_198_BROWN   = new Person("Celeste", 52, 198, HairColour.BROWN);
    private static final Person ELISA_18_162_BLONDE  = new Person("Elisa", 18, 162, HairColour.BLONDE);
    private static final Person MARTA_24_171_BROWN   = new Person("Marta", 24, 171, HairColour.BROWN);
    private static final Person SHERWOOD_37_169_BLONDE  = new Person("Sherwood", 37, 169, HairColour.BLONDE);
    private static final Person MEURIG_62_182_BLACK   = new Person("Meurig", 62, 182, HairColour.BLACK);
    private static final Person HELLA_19_159_BLONDE  = new Person("Hella", 19, 159, HairColour.BLONDE);
    private static final Person CADOC_17_188_BLUE    = new Person("Cadoc", 17, 188, HairColour.BLUE);
    private static final Person CARLA_45_170_BROWN   = new Person("Carla", 45, 170, HairColour.BROWN);
    private static final Person CARLETON_83_175_GREY    = new Person("Carleton", 83, 175, HairColour.GREY);

    private People people;

    public People people(Person... peopleList) {
        return new Java7People(peopleList);
    }

    @Test
    public void getAgesShouldNotReturnAnyAgesIfThereAreNoPeople() {
        people = people();

        assertThat(people.getAges(), is(emptyIterable()));
    }

    @Test
    public void getAgesShouldReturnASingleAge() {
        people = people(CARLETON_83_175_GREY);

        assertThat(people.getAges(), contains(83));
    }

    @Test
    public void getAgesShouldReturnAllAges() {
        people = people(TEGWEN_22_164_BLACK, MARTA_24_171_BROWN, CADOC_17_188_BLUE);

        assertThat(people.getAges(), contains(22, 24, 17));
    }
}
