package manga.collect.viewmodels;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:27:12
 */
public class MangaDescriptionViewModel {

	private String imgUrl;
	private String isbn;
	private String title;
	private String name;

	public MangaDescriptionViewModel(){
		this("", "");
	}

	public MangaDescriptionViewModel(final String title, final String isbn){
		this.title = title;
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}
}