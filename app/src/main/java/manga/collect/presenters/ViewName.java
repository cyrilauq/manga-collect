package manga.collect.presenters;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:27:29
 */
public enum ViewName {
	LOGIN_VIEW("LOGIN_VIEW"),
	HOME_VIEW("HOME_VIEW"),
	MENU_VIEW("MENU_VIEW"),
	MANGA_VIEW("MANGA_VIEW"),
	SEARCH_MANGA_VIEW("SEARCH_MANGA_VIEW");

	private final String viewName;

	private ViewName(final String viewName) {
		this.viewName = viewName;
	}

	public String getViewName() {
		return viewName;
	}
}