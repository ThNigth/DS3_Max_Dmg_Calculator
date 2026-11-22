import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void main() {

        ArrayList<Weapon> weaponList = new ArrayList<>();

        weaponList.add(new Weapon("Sellsword Twinblades", 99, 10, 16, 0, 0, 0.2, 0.6, 0, 0));
        weaponList.add(new Weapon("Lothric Knight Sword", 103, 11, 18, 0, 0, 0.4, 0.4, 0, 0));
        weaponList.add(new Weapon("Exile Greatsword", 148, 24, 16, 0, 0, 0.6, 0.4, 0, 0));
        weaponList.add(new Weapon("Dragonslayer Grataxe", 274, 40, 0, 0, 0, 0.4, 0.2, 0, 0.4));
        weaponList.add(new Weapon("Fume Ultra Greatsword", 149, 50, 10, 0, 0, 1.0, 0.2, 0, 0));
        weaponList.add(new Weapon("Astora Greatsword", 132, 16, 18, 0, 0, 0.4, 0.6, 0, 0));
        weaponList.add(new Weapon("Hollowslayer Greatsword", 145, 14, 18, 0, 0, 0.4, 0.6, 0, 0));
        weaponList.add(new Weapon("Ringed Knight Paired Greatsword", 196, 40, 15, 0, 0, 0.6, 0.2, 0.2, 0.2));
        weaponList.add(new Weapon("Moonlight Greatsword", 199, 16, 11, 26, 0, 0.2, 0, 0.6, 0));

        ArrayList<Buff> buffList = new ArrayList<>();

        buffList.add(new Buff("none", 1.0, 0, 0, 0, 0));
        buffList.add(new Buff("Lloyd's Sword Ring", 1.10, 0, 0, 0, 0));
        buffList.add(new Buff("Red Tearstone Ring", 1.20, 0, 0, 0, 0));
        buffList.add(new Buff("Flynn's Ring", 1.15, 0, 0, 0, 0));
        buffList.add(new Buff("Knight's Ring", 1.0, 5, 0, 0, 0));
        buffList.add(new Buff("Hunter's Ring", 1.0, 0, 5, 0, 0));
        buffList.add(new Buff("Scholar Ring", 1.0, 0, 0, 5, 0));
        buffList.add(new Buff("Priestess Ring", 1.0, 0, 0, 0, 5));

        Scanner sc = new Scanner(System.in);

        System.out.print("===Bienvenido a la calculadora de Dmg Max=== \n ===de Dark Souls III=== \n Ingresa el nombre de tu MC: ");
        String nameMc = sc.next();
        System.out.print("Ingresa la fuerza de tu Mc: ");
        int strMc = sc.nextInt();
        System.out.print("Ingresa la destreza de tu Mc: ");
        int dexMc = sc.nextInt();
        System.out.print("Ingresa la inteligencia de tu Mc: ");
        int intMc = sc.nextInt();
        System.out.print("Ingresa la fe de tu Mc: ");
        int fthMc = sc.nextInt();

        double maxDamage = 0;
        String bestWeapon = "none";
        String bestBuff = "none";

        for (Weapon w : weaponList) {

            for (Buff b : buffList) {

                int efectiveStr = strMc + b.bonusStr;
                int efectiveDex = dexMc + b.bonusDex;
                int efectiveInt = intMc + b.bonusInt;
                int efectiveFth = fthMc + b.bonusFth;

                if (efectiveStr >= w.reqStr && efectiveDex >= w.reqDex && efectiveInt >= w.reqInt && efectiveFth >= w.reqFth) {

                    double temp = w.baseDamage + (efectiveStr * w.strScaling) + (efectiveDex * w.dexScaling) + (efectiveInt * w.intScaling) + (efectiveFth * w.fthScaling);
                    double totalDmg = temp * b.multiplier;

                    if (totalDmg > maxDamage) {
                        maxDamage = totalDmg;
                        bestWeapon = w.name;
                        bestBuff = b.name;

                    }
                }
            }
        }

        System.out.println("Mejor arma: " + bestWeapon + "\n" + "Con en el anillo: " + bestBuff + "\n" + "Daño maximo con tu configuracion actual: " + maxDamage);
        sc.close();

    }
}
