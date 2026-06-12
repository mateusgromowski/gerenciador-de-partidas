package com.mateus.matchmanager.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mateus.matchmanager.model.Match;
import com.mateus.matchmanager.model.Team;

public class MatchServiceTest {

    MatchService service = new MatchService();

    @Test
    public void drawResultTest() {
        Team t1 = Team.builder().id(null).points(0).victories(0).draws(0).losses(0).build();
        Team t2 = Team.builder().id(null).points(0).victories(0).draws(0).losses(0).build();
        Match match = Match.builder().id(null).home(t1).homeGoals(0).visitor(t2).visitorGoals(0).build();
        int result = service.result(match);
        assertEquals(0, result);
    }

    @Test
    public void victoryResultTest() {
        Team t1 = Team.builder().id(null).points(0).victories(0).draws(0).losses(0).build();
        Team t2 = Team.builder().id(null).points(0).victories(0).draws(0).losses(0).build();
        Match match = Match.builder().id(null).home(t1).homeGoals(1).visitor(t2).visitorGoals(0).build();
        int result = service.result(match);
        assertEquals(1, result);
    }

    @Test
    public void lossResultTest() {
        Team t1 = Team.builder().id(null).points(0).victories(0).draws(0).losses(0).build();
        Team t2 = Team.builder().id(null).points(0).victories(0).draws(0).losses(0).build();
        Match match = Match.builder().id(null).home(t1).homeGoals(0).visitor(t2).visitorGoals(1).build();
        int result = service.result(match);
        assertEquals(-1, result);
    }

}
