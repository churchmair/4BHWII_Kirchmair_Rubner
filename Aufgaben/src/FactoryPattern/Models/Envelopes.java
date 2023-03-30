package FactoryPattern.Models;

public abstract class Envelopes {

    protected Size _size;
    protected Double _weight;

    public Envelopes(Size size, Double weight){
        this._size = size;
        this._weight = weight;
    }


    public String toString(){
        return this._size + " " + this._weight + " ";
    };


}
