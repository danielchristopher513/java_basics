package generics;

class genericsMethods {

    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]){
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("Pankaj");

        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Pankaj");

        boolean isEqual = genericsMethods.<String>isEqual(g1, g2);
        isEqual = genericsMethods.isEqual(g1, g2);
    }
}
