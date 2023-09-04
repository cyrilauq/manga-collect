package manga.collect.models.manga;

public class TitlesInformations {
    private final String title;
    private final String arcTitle;

    public TitlesInformations(String title, String arcTitle) {
        this.title = title;
        this.arcTitle = arcTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public String getArcTitle() {
        return this.arcTitle;
    }
}
