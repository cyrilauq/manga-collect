package manga.collect.presenters;

import manga.collect.views.IHomeView;

import java.util.function.Consumer;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:26:25
 */
public interface IHomePresenter extends IPresenter {

	/**
	 * 
	 * @param isbn
	 */
	void seeManga(String isbn);

	void setView(IHomeView view);

	void seeMoreLastParution();

	void seeMoreMostPopular();
}