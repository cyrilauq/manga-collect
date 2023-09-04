package manga.collect.views;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import manga.collect.presenters.GoToArgs;
import manga.collect.presenters.IInOutActionHandler;
import manga.collect.presenters.ViewName;
import manga.collect.viewmodels.MangaDescriptionViewModel;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:27:27
 */
public class View extends VBox implements IInOutActionHandler, IView {

	private final ViewName viewName;
	private Consumer<ViewName> router;
	private BiConsumer<ViewName, GoToArgs> router2;

	public View(ViewName viewName){
		this.viewName = viewName;
	}

	public ViewName getViewName() {
		return viewName;
	}

	/**
	 * 
	 * @param mangas
	 */
	public void setMangas(Iterable<MangaDescriptionViewModel> mangas){

	}

	@Override
	public void goTo(ViewName viewName, GoToArgs args) {
		router2.accept(viewName, args);
	}

	@Override
	public void onEnter(ViewName from) {

	}

	@Override
	public void onLeave(ViewName to) {

	}

	@Override
	public void onEnter(ViewName from, GoToArgs args) {

	}

	@Override
	public void onLeave(ViewName to, GoToArgs args) {

	}

	public void setStage(Stage stage) {
	}

	public void refresh() {
	}

	public void setRouter(Consumer<ViewName> router) {
		this.router = router;
	}

	public void setRouter(BiConsumer<ViewName, GoToArgs> router) {
		this.router2 = router;
	}

	public void setShowPopUp(Consumer<ViewName> setSndView) {
	}

	public void setRefresh(Consumer<ViewName> refreshAll) {
	}
}