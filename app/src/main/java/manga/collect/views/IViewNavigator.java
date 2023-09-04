package manga.collect.views;

import manga.collect.presenters.GoToArgs;
import manga.collect.presenters.ViewName;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:26:58
 */
public interface IViewNavigator {

	/**
	 * 
	 * @param viewName
	 */
	void goTo(ViewName viewName);

	void goTo(ViewName viewName, GoToArgs args);

}