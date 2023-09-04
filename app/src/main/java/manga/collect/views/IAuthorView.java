package manga.collect.views;

import manga.collect.viewmodels.AuthorViewModel;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:26:16
 */
public interface IAuthorView extends IView {

	/**
	 * 
	 * @param informations
	 */
	public void setAuthorInformation(AuthorViewModel informations);

}