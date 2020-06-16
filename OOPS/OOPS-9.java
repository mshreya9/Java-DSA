//Generics

class Pair<T> {
    private T first;
    private T second;

    Pair(T first, T second){
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

    public void setSecond(T second){
        this.second = second;
    }
    public T getSecond(){
        return second;
    }
}

class PairUse{
    public static void main(String[] args) {
        Pair<String> p = new Pair<String>("Shreya", "Maheshwari");
        Pair<Integer> i = new Pair<>(1, 2);

        p.setFirst("Shourya");
        System.out.println(p.getFirst());
        //Shourya

        i.setFirst(10);
        i.setSecond(20);
        System.out.println(i.getFirst());
        //10
        System.out.println(i.getSecond());
        //20

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

//Every class is inherited by Object class
//If you do not pass String or Integer in main while writing Pair<>, then by default it is an object.
//Hence, it is strongly recommended to not write without telling the type.
//You cannot use int. You have to write an object of class. Hence, write Integer (Integer is a class, hence you are creating an object)
//There's a wrapper class for primitive data types - Integer, Character, Boolean


//What if we want different data types for first and second in a pair?
//We can do this by:
//class Pair<T, V>
//Replace T with V in all second in above example.
//Inside main:
//Pair<Integer, String>


//One more interesting thing we can do :
//What if we want triplets of different data types but using Pair class only? Line 49-50
