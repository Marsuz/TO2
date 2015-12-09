package othersmodel;

import javafx.beans.property.*;

import java.util.List;

/**
 * Created by Marcin on 2015-12-08.
 */
public class Team {

    private LongProperty teamId;
    private StringProperty teamName;
    private ObjectProperty<TeamMember> leader;
    private ObjectProperty<List<TeamMember>> teamMemberList;

    public Team(long teamId, String teamName, TeamMember leader, List<TeamMember> teamMemberList) {
        this.teamId = new SimpleLongProperty(teamId);
        this.teamName = new SimpleStringProperty(teamName);
        this.leader = new SimpleObjectProperty<TeamMember>(leader);
        this.teamMemberList = new SimpleObjectProperty<List<TeamMember>>(teamMemberList);
    }

    public long getTeamId() {
        return teamId.getValue();
    }

    public LongProperty getTeamIdProperty() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId.set(teamId);
    }

    public String getTeamName() {
        return teamName.getValue();
    }

    public StringProperty getTeamNameProperty() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName.set(teamName);
    }

    public TeamMember getLeader() {
        return leader.getValue();
    }

    public ObjectProperty<TeamMember> getLeaderProperty() {
        return leader;
    }

    public void setLeader(TeamMember leader) {
        this.leader.set(leader);
    }

    public List<TeamMember> getTeamMemberList() {
        return teamMemberList.getValue();
    }

    public ObjectProperty<List<TeamMember>> getTeamMemberListProperty() {
        return teamMemberList;
    }

    public void setTeamMemberList(List<TeamMember> teamMemberList) {
        this.teamMemberList.set(teamMemberList);
    }
}
