package models;

import manga.collect.models.Manga;
import manga.collect.models.manga.CollectionInformations;
import manga.collect.models.manga.ParutionInformations;
import manga.collect.models.manga.StaffInformation;
import manga.collect.models.manga.TitlesInformations;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MangaTest {
    private Manga getTest;

    @BeforeAll
    public void setUp() {
        getTest = new Manga(
                new TitlesInformations(
                        "The title",
                        "The arc title"
                ),
                new ParutionInformations(
                        1999, // The year of vf parution
                        1999, // The year of vo parution
                        "The country of vf parution",
                        "The country of vo parution",
                        "The vf editor",
                        "The vo editor"
                ),
                new CollectionInformations(
                        "The genre",
                        "The collection"
                ),
                "The synopsis",
                new StaffInformation(
                        "The designer",
                        "The illustrator",
                        "The author"
                )
        );
    }
}
