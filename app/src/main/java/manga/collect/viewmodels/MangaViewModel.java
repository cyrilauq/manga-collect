package manga.collect.viewmodels;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:27:17
 */
public class MangaViewModel {
	private final String isbn;
	private final String title;
	private final String yearParutionVf;
	private final String yearParutionVo;
	private final String countryParutionVf;
	private final String countryParutionVo;
	private final String editorParutionVf;
	private final String editorParutionVo;
	private final String synopsis;
	private final String imgUrl;

	public MangaViewModel(){
		this("");
	}

	public MangaViewModel(final String isbn) {
		this("", "", "", "", "", "", "", "", "", "");
	}

	public MangaViewModel(final String title, final String isbn) {
		this(title, isbn, "", "", "", "", "", "", "", "");
	}

	public MangaViewModel(
			final String title,
			final String isbn,
			final String yearParutionVf,
			final String yearParutionVo,
			final String countryParutionVf,
			final String countryParutionVo,
			final String editorParutionVf,
			final String editorParutionVo,
			final String synopsis,
			final String imgUrl) {
		this.title = title;
		this.isbn = isbn;
		this.yearParutionVf = yearParutionVf;
		this.yearParutionVo = yearParutionVo;
		this.countryParutionVf = countryParutionVf;
		this.countryParutionVo = countryParutionVo;
		this.editorParutionVf = editorParutionVf;
		this.editorParutionVo = editorParutionVo;
		this.synopsis = synopsis;
		this.imgUrl = imgUrl;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getYearParutionVf() {
		return yearParutionVf;
	}

	public String getYearParutionVo() {
		return yearParutionVo;
	}

	public String getCountryParutionVf() {
		return countryParutionVf;
	}

	public String getCountryParutionVo() {
		return countryParutionVo;
	}

	public String getEditorParutionVf() {
		return editorParutionVf;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getEditorParutionVo() {
		return editorParutionVo;
	}

	public String getSynopsis() {
		return synopsis;
	}
}