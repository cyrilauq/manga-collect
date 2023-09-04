package manga.collect.repositories;

import manga.collect.infrastructures.IMangaRepository;
import manga.collect.models.Manga;
import manga.collect.models.manga.CollectionInformations;
import manga.collect.models.manga.ParutionInformations;
import manga.collect.models.manga.StaffInformation;
import manga.collect.models.manga.TitlesInformations;
import manga.collect.presenters.SearchMangaArgs;
import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FakeMangaRepository implements IMangaRepository {

    private final List<Manga> _mangas = new ArrayList<>();
    private final static Integer MANGA_COUNT = 12;

    public FakeMangaRepository() {
        for(int i = 0; i < MANGA_COUNT; i++) {
            this._mangas.add(
                new Manga(
                        new TitlesInformations(
                                "Test Title " + i,
                                new Random().nextInt(2) == 0 ? "Test Arc Title " : null
                        ),
                        new ParutionInformations(
                                new Random().nextInt(2023-1990) + 1990,
                                new Random().nextInt(2023-1990) + 1990,
                                "France",
                                "Japan",
                                "Kana",
                                "Kurokawa"
                        ),
                        new CollectionInformations(
                                "Test Collection",
                                "Test Collection"
                        ),
                        "Test Synopsis",
                        new StaffInformation(
                                "Test Designer",
                                "Test Illustrator",
                                "Test Author"
                        )
                )
            );
        }
    }

    @Override
    public Iterable<Manga> getAllManga() {
        return this._mangas;
    }

    @Override
    public Manga getMangaByIsbn(String isbn) {
        return this._mangas.get(0);
    }

    @Override
    public Iterable<Manga> searchManga(SearchMangaArgs args) {
        return this._mangas;
    }
}
