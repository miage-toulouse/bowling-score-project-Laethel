package miage.qbe.bowling;

import java.util.ArrayList;
import java.util.List;

public class Partie {

    private List<Jeu> jeux = new ArrayList<>();
    int score;

    public Partie(Jeu jeu) {
        for(int i =0;i<10;i++){
            jeux.add(jeu);
        }
        if(jeux.get(9).isSpare()){
            jeux.add(jeu);
        }
        if(jeux.get(9).isStrike()){
            jeux.add(jeu);
            jeux.add(jeu);
        }
    }

    public int calculScore() {
        for(int i =0;i<10;i++){
            Jeu jeucourant = jeux.get(i);
            score += jeux.get(i).nombreQuillesTombees();
            if(jeucourant.isSpare()){
                score += jeux.get(i+1).getLancer1();
            }
            if(jeucourant.isStrike()){
                score += jeux.get(i+1).nombreQuillesTombees();
            }
        }
        return score;
    }
}
