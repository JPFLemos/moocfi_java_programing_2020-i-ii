
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int gamesPlayedByTeam = 0;
        int teamWins = 0;
        
        try (Scanner fileScan = new Scanner(Paths.get(fileName))) {
            
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                
                String[] parts = line.split(",");
                String teamOne = parts[0];
                String teamTwo = parts[1];
                int teamOneScore = Integer.valueOf(parts[2]);
                int teamTwoScore = Integer.valueOf(parts[3]);
                
                if (teamOne.equalsIgnoreCase(teamName) || teamTwo.equalsIgnoreCase(teamName)) {
                    gamesPlayedByTeam++;
                }
                
                if (teamOne.equalsIgnoreCase(teamName) && teamOneScore > teamTwoScore) {
                    teamWins++;
                } else 
               if (teamTwo.equalsIgnoreCase(teamName) && teamTwoScore > teamOneScore) {
                    teamWins++;
               }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + gamesPlayedByTeam);
        System.out.println("Wins: " + teamWins);
        System.out.println("Losses: " + (gamesPlayedByTeam - teamWins));
    }

}
