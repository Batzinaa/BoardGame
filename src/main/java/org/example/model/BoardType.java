package org.example.model;

public class BoardType {

    enum Type{
        KYKLIKO,
        SPRINT,

    };

    private Type type;

    private BoardType(){

    }
    public void lapType(){
        type = Type.KYKLIKO;
    }

}
