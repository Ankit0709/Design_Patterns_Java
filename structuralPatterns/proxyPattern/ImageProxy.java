package structuralPatterns.proxyPattern;

public class ImageProxy implements  DisplayObject{
    String filePath;
    ImageFile imageFile;
    public ImageProxy(String filePath){
        this.filePath=filePath;
    }
    public void display(){
        if(imageFile == null){
            imageFile = new ImageFile(filePath);
        }
        imageFile.display();
    }
}
