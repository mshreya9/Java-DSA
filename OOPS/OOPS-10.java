//Generics

class Pair<T, V> {
    private T first;
    private V second;

    Pair(T first, V second){
        this.first = first;
        this.second = second;
    }

    //getters and setters to access private data members

    public void setFirst(T first){
        this.first = first;
    }
    public T getFirst(){
        return first;
    }

    public void setSecond(V second){
        this.second = second;
    }
    public V getSecond(){
        return second;
    }
}

class PairUse{
    public static void main(String[] args) {

        int a = 10;
        int b = 12;
        int c = 23;

        Pair<Integer, Integer> internalPair = new Pair<>(a, b);
        Pair<Pair<Integer, Integer>, Integer> p1 = new Pair<>(internalPair, c);
    
        System.out.println(p1.getSecond());
        //23
        System.out.println(p1.getFirst().getFirst());
        //10
        System.out.println(p1.getFirst().getSecond());
        //12
    }
}

