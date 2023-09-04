package manga.collect.viewmodels;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:27:17
 */
public class MangaViewModel {
	private final String isbn;
	private final String title;

	public MangaViewModel(){
		this("");
	}

	public MangaViewModel(final String isbn) {
		this("", "");
	}

	public MangaViewModel(final String title, final String isbn) {
		this.isbn = isbn;
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}
}