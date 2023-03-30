package FactoryPattern.Models;

public abstract class Envelopes {

    protected Size _size;
    protected Double _weight;

    public Size get_size() {
        return _size;
    }

    public void set_size(Size _size) {
        this._size = _size;
    }

    public Double get_weight() {
        return _weight;
    }

    public void set_weight(Double _weight) {
        this._weight = _weight;
    }

    public Envelopes(Size size, Double weight){
        this._size = size;
        this._weight = weight;
    }


    public String toString(){
        return this._size + " " + this._weight + " ";
    };


}
