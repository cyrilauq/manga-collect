package manga.collect.views;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import manga.collect.presenters.GoToArgs;
import manga.collect.presenters.IMangaPresenter;
import manga.collect.presenters.ViewName;
import manga.collect.viewmodels.MangaViewModel;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:27:13
 */
public class MangaView extends View implements IMangaView {
	private final IMangaPresenter presenter;

	private final Label titleLbl = new Label();

	private final VBox infoContainer = new VBox(); {
		infoContainer.getChildren().addAll(
				titleLbl
		);
	}

	public MangaView(final ViewName viewName, final IMangaPresenter presenter){
		super(viewName);

		this.presenter = presenter;

		getChildren().addAll(
				infoContainer
		);

		this.presenter.setView(this);
	}

	/**
	 * 
	 * @param informations
	 */
	public void setMangaInformation(MangaViewModel informations){
		titleLbl.setText(informations.getTitle());
	}

	@Override
	public void onEnter(ViewName from, GoToArgs args) {
		presenter.onEnter(from, args);
	}
}