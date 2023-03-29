package FactoryPattern.Models;

public class A5 extends Envelopes {

    private String _size;
    private String _weight;

    public A5(String size, String weight){
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
