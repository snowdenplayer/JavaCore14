package ua.lviv.lgs;

import java.util.*;

public class Commodity {
    private String name;
    private int length;
    private int width;
    private int weight;
    private Set<Commodity> comd = new LinkedHashSet<>();
    Scanner in = new Scanner(System.in);

    public Commodity() {
    }

    public Commodity(String name, int length, int width, int weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }

    public void add() {
        System.out.println("Enter name");
        String name = in.next();
        System.out.println("Enter length");
        int length = in.nextInt();
        System.out.println("Enter width");
        int width = in.nextInt();
        System.out.println("Enter weight");
        int weight = in.nextInt();
        comd.add(new Commodity(name, length, width, weight));
    }

    public void remove() {
        System.out.println("Enter name");
        String name = in.next();
        System.out.println("Enter length");
        int length = in.nextInt();
        System.out.println("Enter width");
        int width = in.nextInt();
        System.out.println("Enter weight");
        int weight = in.nextInt();

        Iterator<Commodity> iterator = comd.iterator();
        while (iterator.hasNext()) {
            Commodity com = iterator.next();
            if (com.getName().equalsIgnoreCase(name)
                    & com.getLength() == length
                    & com.getWeight() == weight
                    & com.getWidth() == width) {
                iterator.remove();
            }
        }

    }

    public void change() {
        System.out.println("Enter name");
        String name = in.next();
        System.out.println("Enter length");
        int length = in.nextInt();
        System.out.println("Enter width");
        int width = in.nextInt();
        System.out.println("Enter weight");
        int weight = in.nextInt();

        Iterator<Commodity> iterator = comd.iterator();
        while (iterator.hasNext()) {
            Commodity com = iterator.next();
            if (com.getName().equalsIgnoreCase(name)
                    & com.getLength() == length
                    & com.getWeight() == weight
                    & com.getWidth() == width) {
                System.out.println("Enter name");
                com.setName(in.next());
                System.out.println("Enter length");
                com.setLength(in.nextInt());
                System.out.println("Enter width");
                com.setWidth(in.nextInt());
                System.out.println("Enter weight");
                com.setWeight(in.nextInt());
            }
        }

    }

    public void sortByName(){
        Set<Commodity> s = new TreeSet<>(new SortByName());
        s.addAll(comd);
        System.out.println("Before :");
        for (Commodity commodity : comd) {
            System.out.println(commodity);
        }
        System.out.println();
        System.out.println("After :");
        for (Commodity commodity : comd) {
            System.out.println(commodity);
        }
        System.out.println();

    }
    public void sortByLength(){
        Set<Commodity> s = new TreeSet<>(new SortByLength());
        s.addAll(comd);
        System.out.println("Before :");
        for (Commodity commodity : comd) {
            System.out.println(commodity);
        }
        System.out.println();
        System.out.println("After :");
        for (Commodity commodity : comd) {
            System.out.println(commodity);
        }
        System.out.println();

    }
    public void sortByWeight(){
        Set<Commodity> s = new TreeSet<>(new SortByWeight());
        s.addAll(comd);
        System.out.println("Before :");
        for (Commodity commodity : comd) {
            System.out.println(commodity);
        }
        System.out.println();
        System.out.println("After :");
        for (Commodity commodity : comd) {
            System.out.println(commodity);
        }
        System.out.println();

    }
    public void sortByWidth(){
        Set<Commodity> s = new TreeSet<>(new SortByWidth());
        s.addAll(comd);
        System.out.println("Before :");
        for (Commodity commodity : comd) {
            System.out.println(commodity);
        }
        System.out.println();
        System.out.println("After :");
        for (Commodity commodity : comd) {
            System.out.println(commodity);
        }
        System.out.println();

    }
    public void show(){
        System.out.println();
        for (Commodity commodity : comd) {
            System.out.println(commodity);
        }
        System.out.println();
    }
    public void Element(){
        System.out.println("Enter index");
        int i = in.nextInt();
        List<Commodity> arr = new ArrayList<>();
        arr.addAll(comd);
        System.out.println(arr.get(i));
    }

}
