package manga.collect.views;

import manga.collect.viewmodels.CollectionViewModel;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:26:22
 */
public interface ICollectionView extends IView {

	/**
	 * 
	 * @param informations
	 */
	public void setCollectionInfo(CollectionViewModel informations);

}