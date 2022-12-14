public class LinkedList <V>{
    private Element<V> firstElement;
    private Element<V> lastElement;

    public LinkedList() {
        firstElement = null;
        lastElement = null;
    }

    public void insertFirst(V value) {
        Element<V> element = new Element<>(value);
        element.setNextElement(firstElement);
        firstElement = element;
        if (lastElement == null) {
            lastElement = element; //First element
        }

    }

    public void insertLast(V value) {
        Element<V> element = new Element<>(value);
        if (lastElement != null) {
            lastElement.setNextElement(element);
        }
        lastElement = element;
        if (firstElement == null) {
            firstElement = element;
        }
    }

    public void print() {
        Element<V> element = firstElement;
        while (element != null) {
            System.out.println(element.getValue());
            element.getNextElement();
        }
    }

    public boolean isEmpty() {
        return firstElement == null;
    }

    public void removeValue(V value) throws ValueNotFoundException, EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("La lista ta vacia");
        }
        Element element = firstElement;
        Element temporal = firstElement;

        while (element != null) {
            if (element.getValue().equals(value)) {
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
    @Override
    public String toString() {
        String s = "";
        Element<V> element = firstElement;
        boolean alreadyComma = false;
        while (element != null) {
            if (!alreadyComma) {
                alreadyComma = true;
            } else {
                s += ", ";
            }
            s += element.getValue();
            element = element.getNextElement();
        }
        return s;
    }


}
