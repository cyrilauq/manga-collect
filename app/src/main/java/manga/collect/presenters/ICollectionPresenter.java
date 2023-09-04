package manga.collect.presenters;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:26:19
 */
public interface ICollectionPresenter extends IPresenter {

	/**
	 * 
	 * @param isbn
	 */
	public void deleteMangaFromCollection(String isbn);

}