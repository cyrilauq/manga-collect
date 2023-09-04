package manga.collect.infrastructures;

import manga.collect.models.Manga;
import manga.collect.presenters.SearchMangaArgs;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:26:44
 */
public interface IMangaRepository {

	Iterable<Manga> getAllManga();

	Manga getMangaByIsbn(String isbn);

	/**
	 * 
	 * @param args
	 */
	Iterable<Manga> searchManga(SearchMangaArgs args);

}