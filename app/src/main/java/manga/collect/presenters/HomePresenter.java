package manga.collect.presenters;

import manga.collect.infrastructures.IMangaRepository;
import manga.collect.models.Manga;
import manga.collect.models.manga.ParutionInformations;
import manga.collect.models.manga.TitlesInformations;
import manga.collect.viewmodels.MangaDescriptionViewModel;
import manga.collect.views.IHomeView;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HomePresenter implements IHomePresenter {
    private IHomeView view;
    private final IMangaRepository repository;

    public HomePresenter(IMangaRepository repository) {
        this.repository = repository;
    }

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
        fillList(descriptions, mostPopular);

        view.setMangas(descriptions);
        view.setMostPopularMangas(mostPopular);
    }

    private void fillList(List<MangaDescriptionViewModel> descriptions, List<MangaDescriptionViewModel> mostPopular) {
        final List<Manga> mangas = new ArrayList<>();
        repository.getAllManga().forEach(mangas::add);

        for(int i = 0; i < 12 && i < mangas.size(); i++) {
            descriptions.add(computeViewModel(mangas.get(i)));
            mostPopular.add(computeViewModel(mangas.get(i)));
        }
    }

    private MangaDescriptionViewModel computeViewModel(Manga manga) {
        final TitlesInformations mangaTitles = manga.getTitlesInformations();
        final ParutionInformations parutionInformations = manga.getParutionInformations();
        return new MangaDescriptionViewModel(
                    mangaTitles.getTitle(),
                    "123456789",
                    "",
                    String.valueOf(parutionInformations.getVfParutionYear())
                );
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
