package practice.corejava;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    private static void met() {
        List<Somemmmmm> list = new ArrayList<>();
        list.add(new Somemmmmm("som1"));
        list.add(new Somemmmmm("som2"));
        list.add(new Somemmmmm("som3"));
        list.add(new Somemmmmm("som4"));
        list.add(new Somemmmmm("som5"));
        anotherMet(list);
        System.out.println(list);
    }

    private static void anotherMet(List<Somemmmmm> list) {
        List<Somemmmmm> another = new ArrayList<>();
        for (Somemmmmm som : list) {
            another.add(som.getCopy());
        }
        for (Somemmmmm som : another) {
            if (som.getStoreDays().equalsIgnoreCase("som2")) {
                som.setStoreDays("som6");
                break;
            }
        }
        list.clear();
        list.addAll(another);
    }

    public static void main(String[] args) {
        met();
    }
}

class Somemmmmm implements Cloneable {
    private String storeDays;
    public Somemmmmm(String storeDays) {
        this.storeDays = storeDays;
    }
    public String getStoreDays() {
        return storeDays;
    }

    public void setStoreDays(String storeDays) {
        this.storeDays = storeDays;
    }
    @Override
    public String toString() {
        return storeDays;
    }
    public Somemmmmm getCopy() {
        try {
            return (Somemmmmm) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}