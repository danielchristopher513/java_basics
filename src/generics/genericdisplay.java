package generics;



class genericdisplay {

    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }

    // Driver method
    public static void main(String[] args)
    {

        genericDisplay(11);


        genericDisplay("GeeksForGeeks");


        genericDisplay(1.0);
    }
}
