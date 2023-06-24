import java.util.LinkedList;

class SimpleLinkedList<T> {
    LinkedList<T> ll;
    SimpleLinkedList() {
        ll=new LinkedList<T>();
    }

    SimpleLinkedList(T[] values) {
        ll=new LinkedList<T>();
        for(int i=0;i<values.length;i++)
        {
            ll.add(values[i]);
        }
    }

    void push(T value) {
        ll.push(value);
    }

    T pop() {
        Object p= ll.pop();
        return (T) p;
    }

    void reverse() {
        ll = reverseLinkedList(ll);
    }
    public LinkedList<T> reverseLinkedList(LinkedList<T> llist)
    {
        LinkedList<T> revLinkedList = new LinkedList<T>();
        for (int i = llist.size() - 1; i >= 0; i--) {

            // Append the elements in reverse order
            revLinkedList.add(llist.get(i));
        }
        // Return the reversed arraylist
        return revLinkedList;
    }
    T[] asArray(Class<T> clazz) {
        Object []arr =new Object[ll.size()];
        for(int i=0;i<ll.size();i++)
        {
            arr[i]=ll.get(i);
        }

        return (T[]) arr;
    }

    int size() {

        return ll.size();
    }
}
