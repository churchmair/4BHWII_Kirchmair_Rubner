package FactoryPattern.Models;

public class A6 extends Envelopes {

    private String _size;
    private String _weight;

    public A6(String size, String weight){
        this._size = size;
        this._weight = weight;
    }




    @Override
    public String getEnvelope() {
        return this._size + "" + this._weight;
    }

    @Override
    public String toString() {
        return this._size + " " + this._weight + " ";
    }

}
