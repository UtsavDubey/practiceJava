package org.example.designPatterns;

public class ShapeFactory {

    public Shape getShape(String shape) {
        if(shape==null){
            return null;
        }else if(shape.equals("Rectangle")){
            return new Rectangle();
        }else if(shape.equals("Circle")){
            return new Circle();
        }else if(shape.equals("Square")){
            return new Square();
        }else{
            return null;
        }
    }

    public static void main(String args[]){
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape=shapeFactory.getShape("Rectangle");
        shape.draw();
    }
}
