package othersmodel;

import java.util.List;

/**
 * Created by Marcin on 2015-12-08.
 */
public class Team {

    private long teamId;
    private TeamMember leader;
    private List<TeamMember> teamMemberList;

    public Team(long teamId, TeamMember leader, List<TeamMember> teamMemberList) {
        this.teamId = teamId;
        this.leader = leader;
        this.teamMemberList = teamMemberList;
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public TeamMember getLeader() {
        return leader;
    }

    public void setLeader(TeamMember leader) {
        this.leader = leader;
    }

    public List<TeamMember> getTeamMemberList() {
        return teamMemberList;
    }

    public void setTeamMemberList(List<TeamMember> teamMemberList) {
        this.teamMemberList = teamMemberList;
    }
}
