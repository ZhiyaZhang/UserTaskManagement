package PointManagement;

import java.util.ArrayList;

public class RedeemingManager {
    private int point;
    private ArrayList<Goods> redeemedGoodsList;
    static private String[] goodsName = {"coke", "chocolate", "napkin", "pen", "milk"};
    static private Goods[] goodsList = {new Goods(5, "coke"), new Goods(10, "chocolate"),
            new Goods(7, "napkin"), new Goods(3, "pen"), new Goods(5,"milk")};
    public RedeemingManager(int point){
        this.point = point;
        this.redeemedGoodsList = null;
    }

    public int buyGoods(String goodsName){
        if(!goodsName.contains(goodsName)){
            System.out.println("there is no such goods to be redeemed by your point");
            return point;
        }
        Goods chosenGoods = null;
        for(Goods goods : goodsList){
            if(goods.getName().equals(goodsName))
                chosenGoods = goods;
        }
        if(chosenGoods.getCost() > point){
            System.out.println("your point is not enough to buy this goods");
            return point;
        }
        System.out.println("you have bought the goods : " + goodsName +" successfully");
        redeemedGoodsList.add(chosenGoods);
        this.point -= chosenGoods.getCost();
        return point;
    }

    public void setPoint(int point){
        this.point = point;
    }
}