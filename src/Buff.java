public class Buff {

    String name;
    double multiplier;
    int bonusStr;
    int bonusDex;
    int bonusInt;
    int bonusFth;

    public Buff(String name, double multiplier, int bonusStr, int bonusDex, int bonusInt, int bonusFth) {
        this.name = name;
        this.multiplier = multiplier;
        this.bonusStr = bonusStr;
        this.bonusDex = bonusDex;
        this.bonusInt = bonusInt;
        this.bonusFth = bonusFth;
    }
}