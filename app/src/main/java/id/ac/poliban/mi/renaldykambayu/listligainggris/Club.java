package id.ac.poliban.mi.renaldykambayu.listligainggris;

public class Club {
    private String club;
    private String ClubName;
    private String ClubDesc;

    public Club(String club, String clubName, String clubDesc) {
        this.club = club;
        ClubName = clubName;
        ClubDesc = clubDesc;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getClubName() {
        return ClubName;
    }

    public void setClubName(String clubName) {
        ClubName = clubName;
    }

    public String getClubDesc() {
        return ClubDesc;
    }

    public void setClubDesc(String clubDesc) {
        ClubDesc = clubDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getClubName(), getClubDesc());
    }
}
