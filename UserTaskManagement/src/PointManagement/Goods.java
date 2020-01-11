package PointManagement;

public class Goods {
    private int cost;
    private String name;

    public Goods(int cost, String name){
        this.cost = cost;
        this.name = name;
    }

    public int getCost(){
        return  cost;
    }

    public String getName(){
        return  name;
    }
}
