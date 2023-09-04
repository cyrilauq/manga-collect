package manga.collect.presenters;

import manga.collect.infrastructures.IMangaRepository;
import manga.collect.models.Manga;
import manga.collect.viewmodels.MangaViewModel;
import manga.collect.views.IMangaView;

public class MangaPresenter implements IMangaPresenter {

    private IMangaView view;
    private final IMangaRepository repository;

    public MangaPresenter(IMangaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void onEnter(ViewName from) {

    }

    @Override
    public void onLeave(ViewName to) {

    }

    @Override
    public void onEnter(ViewName from, GoToArgs args) {
        final Manga manga = repository.getMangaByIsbn(args.get("title"));
        this.view.setMangaInformation(
                new MangaViewModel(
                    manga.getTitlesInformations().getTitle(),
                    "",
                    String.valueOf(manga.getParutionInformations().getVfParutionYear()),
                    String.valueOf(manga.getParutionInformations().getVoParutionYear()),
                    manga.getParutionInformations().getVfParutionCountry(),
                    manga.getParutionInformations().getVoParutionCountry(),
                    manga.getParutionInformations().getVfEditor(),
                    manga.getParutionInformations().getVoEditor(),
                    manga.getSynopsis(),
                    manga.getImageUrl()
                )
        );
    }

    @Override
    public void onLeave(ViewName to, GoToArgs args) {

    }

    @Override
    public void setView(IMangaView view) {
        this.view = view;
    }
}
