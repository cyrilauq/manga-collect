package manga.collect.presenters;

import manga.collect.viewmodels.MangaViewModel;
import manga.collect.views.IMangaView;

public class MangaPresenter implements IMangaPresenter {

    private IMangaView view;

    @Override
    public void onEnter(ViewName from) {

    }

    @Override
    public void onLeave(ViewName to) {

    }

    @Override
    public void onEnter(ViewName from, GoToArgs args) {
        this.view.setMangaInformation(
                new MangaViewModel(
                        "123456789"
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
