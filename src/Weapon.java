public class Weapon {

    String name;
    double baseDamage;

    int reqStr;
    int reqDex;
    int reqInt;
    int reqFth;

    double strScaling;
    double dexScaling;
    double intScaling;
    double fthScaling;

    public Weapon(String name, double baseDamage, int reqStr, int reqDex, int reqInt, int reqFth, double strScaling, double dexScaling, double intScaling, double fthScaling) {
        this.name = name;
        this.baseDamage = baseDamage;
        this.reqStr = reqStr;
        this.reqDex = reqDex;
        this.reqInt = reqInt;
        this.reqFth = reqFth;
        this.strScaling = strScaling;
        this.dexScaling = dexScaling;
        this.intScaling = intScaling;
        this.fthScaling = fthScaling;
    }
}