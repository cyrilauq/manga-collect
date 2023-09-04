package manga.collect.presenters;

import manga.collect.views.SearchView;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:26:51
 */
public interface ISearchPresenter extends IPresenter {

	/**
	 * 
	 * @param pageNumber
	 */
	void goToPage(int pageNumber);

	void searchFor();

    void setView(SearchView searchView);
}