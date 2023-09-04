package manga.collect.repositories;

import manga.collect.infrastructures.IMangaRepository;
import manga.collect.models.Manga;
import manga.collect.presenters.SearchMangaArgs;

import java.util.ArrayList;
import java.util.List;

public class FakeMangaRepository implements IMangaRepository {

    private final List<Manga> _mangas = new ArrayList<Manga>();

    public FakeMangaRepository() {
        
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
