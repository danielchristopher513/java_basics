package Collections;

class genrics {

    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }

    public static void main(String args[]){
        genrics type = new genrics();
        type.set("Pankaj");
        String str = (String) type.get(); //type casting, error prone and can cause ClassCastException
    }
}
