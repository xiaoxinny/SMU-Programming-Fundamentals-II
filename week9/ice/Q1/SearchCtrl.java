public class SearchCtrl {
    private InterestGroupDAO IGDM;

    public SearchCtrl() {
        IGDM = new InterestGroupDAO();
    }

    public Student searchPresident(String IGName, int year) {
        InterestGroup IG = IGDM.retrieve(IGName);
        return IG.retrievePresidentInYear(year);
    }
}
