package manga.collect.views;

import manga.collect.viewmodels.MangaViewModel;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:26:45
 */
public interface IMangaView extends IView {

	/**
	 * 
	 * @param informations
	 */
	void setMangaInformation(MangaViewModel informations);

}