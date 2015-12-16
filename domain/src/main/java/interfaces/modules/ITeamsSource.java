package interfaces.modules;

import interfaces.ITeam;
import javafx.collections.ObservableList;
import othersmodel.Team;

import java.util.List;

public interface ITeamsSource {
    ObservableList<ITeam> getTeams();
}
