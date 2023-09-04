package manga.collect.models.manga;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class StaffInformationTest {
    private static StaffInformation staffInformationTest;

    @BeforeAll
    static void setUp() {
        staffInformationTest = new StaffInformation(
                "The designer",
                "The illustrator",
                "The author"
        );
    }

    @Test
    void whenGetDesignerThenRetrieveDesignerName() {
        assertEquals("The designer", staffInformationTest.getDesigner());
        assertNotEquals("The deigner", staffInformationTest.getDesigner());
    }

    @Test
    void whenGetIllustratorThenRetrieveIllustratorName() {
        assertEquals("The illustrator", staffInformationTest.getIllustrator());
        assertNotEquals("Te illustrator", staffInformationTest.getIllustrator());
    }

    @Test
    void whenGetAuthorThenRetrieveAuthorName() {
        assertEquals("The author", staffInformationTest.getAuthor());
        assertNotEquals("The athor", staffInformationTest.getAuthor());
    }

    @Test
    void whenInformationAreSameThenReturnTrue() {
        StaffInformation staffInformationTest2 = new StaffInformation(
                "The designer",
                "The illustrator",
                "The author"
        );
        assertEquals(staffInformationTest, staffInformationTest2);
    }

    @Test
    void whenInformationAreNotSameThenReturnFalse() {
        StaffInformation staffInformationTest2 = new StaffInformation(
                "The designer",
                "The illustrator",
                "The author2"
        );
        assertNotEquals(staffInformationTest, staffInformationTest2);
    }

    @Test
    void whenInformationAreSameThenReturnSameHashCode() {
        StaffInformation staffInformationTest2 = new StaffInformation(
                "The designer",
                "The illustrator",
                "The author"
        );
        assertEquals(staffInformationTest.hashCode(), staffInformationTest2.hashCode());
    }

    @Test
    void whenInformationAreNotSameThenReturnDifferentHashCode() {
        StaffInformation staffInformationTest2 = new StaffInformation(
                "The designer",
                "The illustrator",
                "The author2"
        );
        assertNotEquals(staffInformationTest.hashCode(), staffInformationTest2.hashCode());
    }
}