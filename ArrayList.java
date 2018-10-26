public class ArrayList implements List{

    private int SIZE;
    private int initialCapacity = 10;
    private Object[] arr = new Object[initialCapacity];



    private void resize(){
        Object newArr[] = new Object[initialCapacity * 2];
        for(int i =0; i < initialCapacity;i++){
            newArr[i] = arr[i];
        }

        arr = newArr;
        initialCapacity = initialCapacity *2;
    }

    @Override
    public void add(Object obj) {

        if(initialCapacity == SIZE) {
            resize();
        }

        arr[SIZE] = obj;
        SIZE++;

    }

    @Override
    public void add(int pos, Object obj) {
        if(initialCapacity == SIZE) {
            resize();
        }

        for(int i = 0;i<initialCapacity;i++ ){
            if(arr[i] == arr[pos]){
                arr[i] = obj;
                SIZE++;
            }
        }

    }

    @Override
    public Object get(int pos) {
        return (String)arr[pos];
    }

    @Override
    public Object remove(int pos) {
        Object temp = arr[pos];
        for (int j = pos; j < SIZE - 1; j++) {
            arr[j] = arr[j + 1];
        }
        SIZE--;

        return temp;
    }

    @Override
    public int size() {
        return SIZE;
    }

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();




    }
}
