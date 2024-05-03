package AUTO;

import java.util.HashSet;
public class AutoCatalog {
    public static void main(String[] args) {
        HashSet<AutoCons> autoConsHashSet = new HashSet<>();
        AutoCons ModelS = new AutoCons("ModelS1", "Performance", 100, Color.BLUE, 139990, 2023);
        AutoCons ModelS2 = new AutoCons("ModelS2", "LongRange", 110, Color.RED, 109990, 2022);
        AutoCons ModelS3 = new AutoCons("ModelS3", "Plaid", 110, Color.WHITE, 79990, 2022);
        AutoCons Model3 = new AutoCons("Model3", "Long Range AWD", 90, Color.BLACK, 107990, 2021);
        AutoCons Model3One = new AutoCons("Model31", "Performance", 90, Color.SILVER, 85990, 2021);
        AutoCons ModelX = new AutoCons("ModelX", "LongRange", 100, Color.BLACK, 114990, 2020);
        AutoCons ModelXOne = new AutoCons("ModelX1", "Plaid", 100, Color.SILVER, 123990, 2021);
        AutoCons ModelY = new AutoCons("ModelY", "LongRange", 90, Color.RED, 100990, 2021);
        AutoCons ModelYOne = new AutoCons("ModelY1", "Performance", 90, Color.SILVER, 149990, 2022);

        autoConsHashSet.add(ModelS);
        autoConsHashSet.add(ModelS2);
        autoConsHashSet.add(ModelS3);
        autoConsHashSet.add(Model3);
        autoConsHashSet.add(Model3One);
        autoConsHashSet.add(ModelX);
        autoConsHashSet.add(ModelXOne);
        autoConsHashSet.add(ModelY);
        autoConsHashSet.add(ModelYOne);

        accessCheck(Access.READ);

        AutoCons.printObjectsInfo(autoConsHashSet);

        HashSet<AutoCons> resultSearch = AutoCons.filterByModel (autoConsHashSet, "ModelS", "Performance");
        AutoCons.printObjectsInfo(resultSearch);
    }

    public static void accessCheck(Access access) {
        switch (access) {
            case NONE:
                System.out.println(access.canNone() + " Access only to registered users!");
                break;
            case READ:
                System.out.println(access.canRead() + " Accessible to everyone!");
                break;
            case ADD:
                System.out.println(access.canAdd() + " Admin access! ");
                break;
            case DELETE:
                System.out.println(access.canDelete() + " Admin access! ");
                break;
            case ADMIN:
                System.out.println(access.isAdmin() + " Admin access! ");
                break;
            default:
                System.out.println(" " + access);
                break;
        }
    }
}

