public class LinkedList {
    private Element firstElement;
    private Element lastElement;

    public LinkedList() {
        firstElement = null;
        lastElement = null;
    }

    public void insertFirst(Object obj) {
        Element element = new Element(obj);
        element.setNextElement(firstElement);
        firstElement = element;
        if (lastElement == null) {
            lastElement = element; //First element
        }

    }

    public void insertLast(Object obj) {
        Element element = new Element(obj);
        if (lastElement != null) {
            lastElement.setNextElement(element);
        }
        lastElement = element;
        if (firstElement == null) {
            firstElement = element;
        }
    }

    public void print() {
        Element element = firstElement;
        while (element != null) {
            System.out.println(element.getObject());
            element.getNextElement();
        }
    }

    public boolean isEmpty() {
        return firstElement == null;
    }

    public void removeObject(Object object) throws ObjectNotFoundException, EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("La lista ta vacia");
        }
        Element element = firstElement;
        Element temporal = firstElement;

        while (element != null) {
            if (element.getObject().equals(object)) {
                //Element next = element.getNext()
                //temp.setNext(next)
                temporal.setNextElement(element.getNextElement());

                    if (element == firstElement) {
                        firstElement=element.getNextElement();

                    }else{
                        temporal.setNextElement(element.getNextElement());
                    }
                }if (element.getNextElement() == null) {
                //lastElement=firstElement==null ? null : temporal;
                if (firstElement==null){
                    lastElement = null;

                }else{
                    lastElement=temporal;
                }

                return;
            } else {
                temporal = element;
                element = element.getNextElement();

            }
        }
        throw new EmptyListException("objeto no encontrado");

    }


}
