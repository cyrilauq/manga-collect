package manga.collect.views;

import manga.collect.presenters.ISearchPresenter;
import manga.collect.presenters.ViewName;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:27:25
 */
public class SearchView extends View implements ISearchView {

	private final ISearchPresenter presenter;

	public SearchView(final ViewName viewName, final ISearchPresenter presenter){
		super(viewName);

		this.presenter = presenter;

		this.presenter.setView(this);
	}
}