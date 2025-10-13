
public class CheckMembershipCtrl {

    private TeamDAO teamDAO;

    public CheckMembershipCtrl() {
        teamDAO = new TeamDAO();
    }

    // complete the checkMembershipDuration method here
    public int checkMembershipDuration(String name, String tName) {
        try {
            Team team = teamDAO.retrieve(tName);
            TMSDate dateFormed = team.getDateFormed();
            Student member = team.retrieve(name);
            TMSDate dateJoined = member.getDateJoined();
            return dateJoined.calculateDifference(dateFormed);
        } catch (NullPointerException e) {
            return -1;
        }
    }
}
