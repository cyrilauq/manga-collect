package manga.collect.views;

import manga.collect.viewmodels.CollectionViewModel;
import manga.collect.viewmodels.MangaDescriptionViewModel;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:25:59
 */
public class CollectionView extends View implements ICollectionView {

	public CollectionView(){
		super(null);

	}

	/**
	 * 
	 * @param informations
	 */
	@Override
	public void setCollectionInfo(CollectionViewModel informations){

	}

	@Override
	public void setMangas(Iterable<MangaDescriptionViewModel> mangas) {

	}
}