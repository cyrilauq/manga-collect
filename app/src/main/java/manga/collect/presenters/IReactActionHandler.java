package manga.collect.presenters;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:26:49
 */
public interface IReactActionHandler {

	/**
	 * 
	 * @param mangaName
	 */
	public void addToCollection(String mangaName);

	/**
	 * 
	 * @param mangaName
	 */
	public void like(String mangaName);

}