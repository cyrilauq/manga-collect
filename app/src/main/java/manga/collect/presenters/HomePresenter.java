package manga.collect.presenters;

import manga.collect.viewmodels.MangaDescriptionViewModel;
import manga.collect.views.IHomeView;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HomePresenter implements IHomePresenter {
    private IHomeView view;

    @Override
    public void seeManga(String isbn) {
        view.goTo(
                ViewName.MANGA_VIEW,
                new GoToArgs(
                        "isbn",
                        isbn
                )
        );
    }

    @Override
    public void setView(IHomeView view) {
        this.view = view;
    }

    @Override
    public void seeMoreLastParution() {
        view.goTo(
                ViewName.SEARCH_MANGA_VIEW,
                new GoToArgs(
                        "sort",
                        "desc"
                )
        );
    }

    @Override
    public void seeMoreMostPopular() {

    }

    @Override
    public void onEnter(ViewName from) {
        final List<MangaDescriptionViewModel> descriptions = new ArrayList<>();
        final List<MangaDescriptionViewModel> mostPopular = new ArrayList<>();

        for(int i = 0; i < 12; i++) {
            descriptions.add(
                    new MangaDescriptionViewModel(
                            "Test Title",
                            "123456789"
                    )
            );
            mostPopular.add(
                    new MangaDescriptionViewModel(
                            "Test Title",
                            "123456789"
                    )
            );
        }

        view.setMangas(descriptions);
        view.setMostPopularMangas(mostPopular);
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
}
