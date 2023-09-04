package manga.collect.viewmodels;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:27:12
 */
public class MangaDescriptionViewModel {

	private final String isbn;
	private final String title;
	private final String yearParutionVf;
	private final String imgUrl;

	public MangaDescriptionViewModel(){
		this("", "","", "");
	}

	public MangaDescriptionViewModel(final String title, final String isbn){
		this(title, isbn, "", "");
	}

	public MangaDescriptionViewModel(final String title, final String isbn, final String imgUrl, final String yearParutionVf) {
		this.title = title;
		this.isbn = isbn;
		this.imgUrl = imgUrl;
		this.yearParutionVf = yearParutionVf;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getYearParutionVf() {
		return yearParutionVf;
	}
}