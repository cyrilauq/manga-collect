package manga.collect.models.manga;

public class ParutionInformations {
    private final int vfParutionYear;
    private final int voParutionYear;
    private final String vfParutionCountry;
    private final String voParutionCountry;
    private final String vfEditor;
    private final String voEditor;

    public ParutionInformations(
            final int vfParutionYear,
            final int voParutionYear,
            final String vfParutionCountry,
            final String voParutionCountry,
            final String vfEditor,
            final String voEditor) {
        this.vfParutionYear = vfParutionYear;
        this.voParutionYear = voParutionYear;
        this.vfParutionCountry = vfParutionCountry;
        this.voParutionCountry = voParutionCountry;
        this.vfEditor = vfEditor;
        this.voEditor = voEditor;
    }

    public int getVfParutionYear() {
        return vfParutionYear;
    }

    public int getVoParutionYear() {
        return voParutionYear;
    }

    public String getVfParutionCountry() {
        return vfParutionCountry;
    }

    public String getVoParutionCountry() {
        return voParutionCountry;
    }

    public String getVfEditor() {
        return vfEditor;
    }

    public String getVoEditor() {
        return voEditor;
    }
}
