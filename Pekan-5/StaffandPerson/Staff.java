public class Staff extends Person {
    public String x = "Staff";
    public void makan(){
        System.out.println("Staff Makan");
    }
    public void minum(){
        System.out.println("Staff minum");
    }

    public static void main(String[] args) {
        Staff s = new Staff();
        s.makan();
        s.minum();

        Person p = new Person();// kalo new Person diganti new Staff maka outputnya "Staff... " semua
        p.makan();
        p.minum();

        System.out.println(p.x); // kalo p diganti s maka outpunya staff karena polimorphism

    }
}
