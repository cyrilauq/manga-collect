package manga.collect.views;

import manga.collect.viewmodels.MangaDescriptionViewModel;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:26:29
 */
public interface IHomeView extends IView {

    void setMostPopularMangas(Iterable<MangaDescriptionViewModel> mangas);

}