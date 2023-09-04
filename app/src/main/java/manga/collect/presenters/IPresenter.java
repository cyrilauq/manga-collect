package manga.collect.presenters;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:26:46
 */
public interface IPresenter extends IInOutActionHandler {

	/**
	 *
	 * @param from
	 */
	void onEnter(ViewName from);

	/**
	 *
	 * @param to
	 */
	void onLeave(ViewName to);

	/**
	 *
	 * @param from
	 */
	void onEnter(ViewName from, GoToArgs args);

	/**
	 *
	 * @param to
	 */
	void onLeave(ViewName to, GoToArgs args);

}