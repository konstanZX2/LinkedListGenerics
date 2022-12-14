public class Element<V> {
    private V value;
    private Element<V> nextElement;


    public Element (V newObject){
        this.value =newObject;
        nextElement=null;
    }

    public void setNextElement(Element newNextElement){
        nextElement=newNextElement;

    }

    public V getValue() {
        return value;
    }

    public Element getNextElement() {
        return nextElement;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void delete(){
        value = null;
        nextElement=null;
    }
}
