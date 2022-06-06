package lesson1;

public class Participants {
    private String nameMember;
    private int powerMember;

    public Participants(String nameMember, int powerMember) {
        this.nameMember = nameMember;
        this.powerMember = powerMember;
    }

    public String getNameMember() {
        return this.nameMember;
    }

    public int getPowerMember() {
        return this.powerMember;
    }

    public void setPowerMember(int powerMember) {
        this.powerMember = powerMember;
    }
}
