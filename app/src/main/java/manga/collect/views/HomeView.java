package manga.collect.views;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import manga.collect.models.Manga;
import manga.collect.presenters.IHomePresenter;
import manga.collect.presenters.ViewName;
import manga.collect.viewmodels.MangaDescriptionViewModel;
import manga.collect.views.home.HomeMangaView;
import manga.collect.views.home.MangasContainer;
import manga.collect.views.resources.HomeStringResources;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:26:06
 */
public class HomeView extends View implements IHomeView {
	private final IHomePresenter presenter;

	private final MangasContainer lastestParutionContainer;

	private final MangasContainer mostPopularContainer;

	public HomeView(ViewName viewName, IHomePresenter presenter){
		super(viewName);

		this.presenter = presenter;

		this.lastestParutionContainer = new MangasContainer(
				HomeStringResources.LAST_PARUTION_TITLE,
				e -> presenter.seeMoreLastParution()
		);
		this.mostPopularContainer = new MangasContainer(
				HomeStringResources.MOST_POPULAR_TITLE,
				e -> presenter.seeMoreMostPopular()
		);

		getChildren().addAll(
				lastestParutionContainer,
				mostPopularContainer
		);

		this.presenter.setView(this);
	}

    @Override
    public void onEnter(ViewName from) {
        presenter.onEnter(from);
    }

    @Override
	public void setMangas(Iterable<MangaDescriptionViewModel> mangas) {
		mangas.forEach(manga ->
				lastestParutionContainer.add(new HomeMangaView(manga, presenter::seeManga))
		);
	}

	@Override
	public void setMostPopularMangas(Iterable<MangaDescriptionViewModel> mangas) {
		mangas.forEach(manga ->
				mostPopularContainer.add(new HomeMangaView(manga, presenter::seeManga))
		);
	}
}