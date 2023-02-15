package models;

import java.util.Objects;

public class Game {
   private String name;
   private String price;

    public Game(String name, String price){
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return this.name;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

    public String getPrice(){
        return this.price;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(!(obj instanceof Game)) return false;
        Game game = (Game) obj;
        return getName().equals(game.name) && getPrice().equals(game.getPrice());
    }
}
