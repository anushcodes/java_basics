public class Rectangle {
    private Integer length;
    private Integer width;
    public Integer getLength() {
        return length;
    }
    public Integer getWidth() {
        return width;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
    public void setWidth(Integer width) {
        this.width = width;
    }
    public Rectangle(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }
    
    public Integer area(){
        return length*width;
    }

    Rectangle dimensionChange(Integer newDimension){
        this.setLength(this.getLength()*newDimension);
        this.setWidth(this.getWidth()*newDimension);
        if(this instanceof Rectangle){
            return this;
        }
        return null;
    }

    public void display(){
        System.out.println("Rectangle Dimension\nLength:"+length);
        System.out.println("Width:"+width);
        System.out.println("Area of the Rectangle:"+area());
    }

}
