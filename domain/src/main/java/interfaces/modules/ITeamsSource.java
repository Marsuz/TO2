package interfaces.modules;

import interfaces.ITeam;
import othersmodel.Team;

import java.util.List;

public interface ITeamsSource {
    List<ITeam> getTeams();
}
