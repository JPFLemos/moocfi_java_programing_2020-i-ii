/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class Game {
    
    private String homeTeam;
    private String opposingTeam;
    private int homePoints;
    private int opposingPoints;
    
    public Game(String homeTeam, String opposingTeam, int homePoints, int opposingPoints) {
        this.homeTeam = homeTeam;
        this.opposingTeam = opposingTeam;
        this.homePoints = homePoints;
        this.opposingPoints = opposingPoints;
    }
    
    public String getHomeTeam() {
        return homeTeam;
    }
    
    public String getOpponent() {
        return opposingTeam;
    }
    
    public boolean winnerIs(String team) {
        if (team.equalsIgnoreCase(homeTeam) && homePoints > opposingPoints) {
            return true;
        }
        
        if (team.equalsIgnoreCase(opposingTeam) && opposingPoints > homePoints) {
            return true;
        }
        
        return false;
    }
    
}
