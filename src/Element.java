public class Element {
    private Object object;
    private Element nextElement;


    public Element (Object newObject){
        this.object=newObject;
        nextElement=null;
    }

    public void setNextElement(Element newNextElement){
        nextElement=newNextElement;

    }

    public Object getObject() {
        return object;
    }

    public Element getNextElement() {
        return nextElement;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void delete(){
        object = null;
        nextElement=null;
    }
}
