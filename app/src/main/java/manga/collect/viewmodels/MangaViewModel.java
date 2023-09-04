package manga.collect.viewmodels;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:27:17
 */
public class MangaViewModel {
	private final String isbn;

	public MangaViewModel(){
		this("");
	}

	public MangaViewModel(final String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}
}