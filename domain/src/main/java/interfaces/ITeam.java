package interfaces;

import java.util.List;

public interface ITeam {
    long getId();
    String getName();
    ITeamMember getLeader();
    List<ITeamMember> getTeamMembers();
}
