package miage.qbe.bowling;

public class Jeu {

    private Integer lancer1;
    private Integer lancer2;

    public Jeu(Integer lancer1, Integer lancer2) {
        this.lancer1 = lancer1;
        this.lancer2 = lancer2;
    }

    public Integer getLancer1() {
        return lancer1;
    }

    public Integer getLancer2() {
        return lancer2;
    }

    public int nombreQuillesTombees(){
        int score = 0;
        score = getLancer1() + getLancer2();
        return score;
    }

    public boolean isSpare() {
        return getLancer1()+getLancer2() == 10;
    }

    public boolean isStrike() {
        return getLancer1() == 10;
    }
}
