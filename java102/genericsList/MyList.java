package java102.genericsList;

public class MyList<T> {

    private Object[] array;
    private int capacity = 10, index = 0;

    public MyList() {
        this.array = new Object[this.capacity];
    }

    public MyList(int capacity) {
        this.array = new Object[capacity];
    }

    public int size() {
        int count = 0;
        for (Object object : array) {
            if (object != null)
                count++;
        }
        return count;
    }

    public int getCapacity() {
        return array.length;
    }

    public void add(T data) {
        if (this.index == array.length)
            increaseArrayCapacity();

        array[this.index++] = data;

    }

    private void increaseArrayCapacity() {
        Object[] tempArray = new Object[this.getCapacity() * 2];

        // int zero = 0;
        // System.arraycopy(this.array, zero, tempArray, zero, this.array.length);

        for (int i = 0; i < this.array.length; i++) {
            tempArray[i] = array[i];
        }

        this.array = tempArray;
    }

    public Object get(int index) {
        if (index >= this.array.length || index < 0)
            return null;
        return this.array[index];
    }

    public Object remove(int index) {
        if (index >= this.array.length || index < 0)
            return null;

        Object value = this.array[index];

        while (this.array.length - 1 != index) {
            this.array[index] = this.array[++index];
        }
        this.array[index] = null;

        this.index--;
        if ((this.index >= this.capacity) && (this.index <= (this.array.length / 2)))
            decreaseArrayCapacity();

        // silinen değeri döndür
        return value;
    }

    private void decreaseArrayCapacity() {
        Object[] tempArray = new Object[this.getCapacity() / 2];

        // int zero = 0;
        // System.arraycopy(this.array, zero, tempArray, zero, this.array.length);

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = array[i];
        }

        this.array = tempArray;
    }

    public Object set(int index, T data) {
        if (index >= this.array.length || index < 0)
            return null;
        this.array[index] = data;
        return data;
    }

    public int indexOf(T data) {
        int index = 0;
        for (Object object : this.array) {
            if (data == object)
                return index;
            index++;
        }
        return -1;
    }

    public int lastIndexOf(T data) {

        int i = this.getCapacity() - 1;
        while (i > 0) {
            if (data == this.get(i))
                return i;
            i--;
        }

        return -1;
    }

    public boolean isEmpty() {
        int count = 0;
        for (Object object : array) {
            if (object != null)
                count++;
        }
        return count == 0;
    }

    public Object[] toArray() {
        Object[] tempArray = new Object[this.getCapacity()];
        for (int i = 0; i < this.getCapacity(); i++) {
            tempArray[i] = this.get(i);
        }
        return tempArray;
    }

    public void clear() {
        this.array = new Object[this.capacity];
        this.index = 0;
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> list = new MyList<>();
        for (int i = start; i <= finish; i++) {
            list.add((T) this.get(i));
        }
        return list;
    }

    public boolean contains(T data) {

        return this.indexOf(data) != -1;
    }

    public String toString() {
        int count = 0;
        String print = "[";

        for (Object object : this.array) {
            if (object != null)
                count++;
            if (object == null)
                continue;

            print += count != this.size() ? object + ", " : object;
        }

        print += "]";

        return print;
    }

    public void printArray() {
        for (Object object : array) {
            System.out.print(object + ", ");
        }
        System.out.println();
    }

}