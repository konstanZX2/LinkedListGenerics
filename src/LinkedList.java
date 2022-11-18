public class LinkedList {
    private Element firstElement;
    private Element lastElement;

    public LinkedList(){
        firstElement=null;
        lastElement=null;
    }

    public void insertFirst(Object obj){
        Element element = new Element(obj);
        element.setNextElement(firstElement);
        firstElement= element;
        if (lastElement == null){
            lastElement=element; //First element
        }

    }
    public void insertLast(Object obj){
        Element element = new Element(obj);
        if(lastElement!=null){
            lastElement.setNextElement(element);
        }
        lastElement=element;
        if(firstElement == null){
            firstElement = element;
        }
    }

    public void print(){
        Element element= firstElement;
        while(element != null){
            System.out.println(element.getObject());
            element.getNextElement();
        }
    }


}
