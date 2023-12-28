import java.util.ArrayList;
import java.util.List;

public class Планета {
    private String назва;
    private List<Материк> материки;
    private List<Океан> океани;
    private List<Острів> острови;

    public Планета(String назва) {
        this.назва = назва;
        this.материки = new ArrayList<>();
        this.океани = new ArrayList<>();
        this.острови = new ArrayList<>();
    }

    public void додатиМатерик(Материк материк) {
        материки.add(материк);
    }

    public void додатиОкеан(Океан океан) {
        океани.add(океан);
    }

    public void додатиОстрів(Острів острів) {
        острови.add(острів);
    }

    public void вивестиНазвуМатериків() {
        System.out.println("Назви материків на планеті " + назва + ":");
        for (Материк материк : материки) {
            System.out.println(matерик.назва);
        }
    }

    public void вивестиІнформаціюПланети() {
        System.out.println("Планета: " + назва);
        System.out.println("Кількість материків: " + материки.size());
    }
    @Override
    public boolean equals(Object obj) {
    }

    @Override
    public int hashCode() {
    }

    @Override
    public String toString() {
    }
}