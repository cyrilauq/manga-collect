package manga.collect.views;

import manga.collect.presenters.GoToArgs;
import manga.collect.presenters.ViewName;
import manga.collect.viewmodels.MangaDescriptionViewModel;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:26:55
 */
public interface IView {

	/**
	 * 
	 * @param mangas
	 */
	void setMangas(Iterable<MangaDescriptionViewModel> mangas);

	void goTo(ViewName viewName, GoToArgs args);

}