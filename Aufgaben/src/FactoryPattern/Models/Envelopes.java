package FactoryPattern.Models;

public abstract class Envelopes {

    protected String _size;
    protected String _weight;

    public Envelopes(String size, String weight){
        this._size = size;
        this._weight = weight;
    }


    public String toString(){
        return this._size + " " + this._weight + " ";
    };


}
