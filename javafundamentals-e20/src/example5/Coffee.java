package example5;
/*
* roughly a class that has instances initially defined and there cannot be new ones created
* */
public enum Coffee {
    SMALL(10),MEDIUM,LARGE;
    int qty;
    Coffee(){} //always private
    Coffee(int qty){this.qty=qty;}

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
//public final class Coffee{
//    public static final SMALL = new Coffee();
//    public static final MEDIUM = new Coffee();
//    public static final LARGE = new Coffee();
//    private Coffee(){}
//}

