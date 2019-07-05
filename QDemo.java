class Queue {
    char q[]; // array with queue
    int putloc, getloc; // index of operations put and get
    
    Queue(int size) {
        q = new char[size]; // allocates memory to the queue
        putloc = getloc = 0;
    }

    // put element to the queue
    void put(char ch) {
        if(putloc == q.length) {
            System.out.println("\t -- Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // get element from que
    char get() {
        if(getloc == putloc) {
            System.out.println("\t -- Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }

    int getLength() {
        return (int) q.length;
    }
}

class QDemo {
    public static void main(String args[]) {
        Queue mQueue = new Queue(100);
        int size = mQueue.getLength();
        char mElement;

        System.out.println("Putting elements to queue..\n");
        for(int i = 0; i < size; i++) {
            mElement = (char) i;
            mQueue.put(mElement);
            System.out.print(mElement);
        }

        System.out.println("\n\nGetting elements from queue.. \n");
        for(int i = size; i > 0; i--){
            mElement = mQueue.get();
            System.out.print(mElement);
        }
    }
}