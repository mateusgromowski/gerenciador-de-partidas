package com.mateus.matchmanager.service;

import com.mateus.matchmanager.model.Match;
import com.mateus.matchmanager.model.Team;

public class MatchService {
    public int result(Match match) {
        int goalsDiff = match.getHomeGoals() - match.getVisitorGoals();
        Team home = match.getHome();
        Team visitor = match.getVisitor();
        if (goalsDiff == 0) {
            return draw(home, visitor);
        }

        if (goalsDiff > 0) {
            return victory(home, visitor);
        }

        return loss(home, visitor);
    }

    private int loss(Team home, Team visitor) {
        home.loss();
        visitor.victory();
        return -1;
    }

    private int draw(Team home, Team visitor) {
        home.draw();
        visitor.draw();
        return 0;
    }

    private int victory(Team home, Team visitor) {
        home.victory();
        visitor.loss();
        return 1;
    }
}
