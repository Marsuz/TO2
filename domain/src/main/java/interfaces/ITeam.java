package interfaces;

import java.math.BigDecimal;
import java.util.List;

public interface ITeam {
    long getId();
    String getName();
    ITeamMember getLeader();
    List<ITeamMember> getTeamMembers();
    BigDecimal getCost();
}
