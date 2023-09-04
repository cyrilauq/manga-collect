package manga.collect.repositories;

import manga.collect.infrastructures.IMangaRepository;
import manga.collect.models.Manga;
import manga.collect.presenters.SearchMangaArgs;

import java.util.ArrayList;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:27:07
 */
public class JsonMangaRepository implements IMangaRepository {
	private final String path;
	private final String filename;

	public JsonMangaRepository(final String path, final String filename){
		this.path = path;
		this.filename = filename;
	}

	public Iterable<Manga> getAllManga(){
		return new ArrayList<>();
	}

	public Manga getMangaByIsbn(String isbn){
		return null;
	}

	@Override
	public Iterable<Manga> searchManga(SearchMangaArgs args) {
		return new ArrayList<>();
	}
}