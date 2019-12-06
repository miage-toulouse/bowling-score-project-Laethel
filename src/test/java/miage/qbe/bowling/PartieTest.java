package miage.qbe.bowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartieTest {

    @Test
    public void testCalculScoreNoSpareNoStrike(){
        //given : je joue une partie avec ou je marque des points mais ce ne soit ni des spares, ni des strikes
        //10 jeux identiques faisant tomber 5 quilles
        Jeu jeu = new Jeu(5,0);
        Partie partie = new Partie(jeu);
        //when : on calcule le score
        int score = partie.calculScore();
        //then : le score est de 50
        assertEquals(50, score);
    }

    @Test
    public void testCalculScoreOnlySpare(){
        //given : je joue une partie avec ou je marque des points et ce sont uniquement des spares
        //10 jeux identiques faisant des spares
        Jeu jeu = new Jeu(5,5);
        Partie partie = new Partie(jeu);
        //when : on calcule le score
        int score = partie.calculScore();
        //then : le score est de 150
        assertEquals(150, score);
    }

    @Test
    public void testCalculScoreOnlyStrike(){
        //given : je joue une partie avec ou je marque des points et ce sont uniquement des strikes
        //10 jeux identiques faisant des strikes
        Jeu jeu = new Jeu(10,0);
        Partie partie = new Partie(jeu);
        //when : on calcule le score
        int score = partie.calculScore();
        //then : le score est de 150
        assertEquals(300, score);
    }

}