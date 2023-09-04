package manga.collect.views;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
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
	private final ImageView coverImg = new ImageView();
	private final VBox listPnl = new VBox(); {
		listPnl.getChildren().addAll(
				titleLbl
		);
	}
	private final HBox descriptionPnl = new HBox(); {
		descriptionPnl.getChildren().addAll(
				coverImg,
				listPnl
		);
	}

	private final VBox infoContainer = new VBox(); {
		infoContainer.getChildren().addAll(
				descriptionPnl
		);
	}

	private final Label synopsisLbl = new Label();

	public MangaView(final ViewName viewName, final IMangaPresenter presenter){
		super(viewName);

		this.presenter = presenter;

		getChildren().addAll(
				infoContainer,
				synopsisLbl
		);

		this.presenter.setView(this);
	}

	/**
	 * 
	 * @param informations
	 */
	public void setMangaInformation(MangaViewModel informations){
		titleLbl.setText(informations.getTitle());
		synopsisLbl.setText(informations.getSynopsis());
		coverImg.setImage(new ImageView(informations.getImgUrl()).getImage());
	}

	@Override
	public void onEnter(ViewName from, GoToArgs args) {
		presenter.onEnter(from, args);
	}
}