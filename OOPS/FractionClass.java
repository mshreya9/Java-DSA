import java.util.*;

class Fraction {
    private int num;
    private int den;

    public Fraction(int num, int den){
        this.num = num;
        if(den == 0){
            
        }
        this.den = den;
        simplify();
    }

    public int getNumerator(){
        return num;
    }

    public int getDenominator() {
        return den;
    }

    public void setNumerator(int n) {
        this.num = n;
        simplify();
    }

    public void setDenominator(int d) throws ZeroDenominatorException{
        if(d == 0){
            ZeroDenominatorException e = new ZeroDenominatorException();
            throw e;
        }
        this.den = d;
        simplify();
    }

    public void print() {
        if(den == 1) {
            System.out.println(num);
        } else {
            System.out.println(num + "/" + den);
        }
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(num, den);
        for(int i = 2; i <= smaller; i++){
            if(num % i == 0 && den % i == 0){
                gcd = i;
            }
        }
        num = num/gcd;
        den = den/gcd;
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        int newNum = f1.num * f2.den + f1.den * f2.num;
        int newDen = f1.den * f2.den;
        Fraction f = new Fraction(newNum, newDen);
        return f;
    }

    public void add(Fraction f2) {
        this.num = this.num * f2.den + this.den * f2.num;
        this.den = this.den * f2.den;
        simplify();
     }

    public void multiply(Fraction f2) {
        this.num = this.num * f2.num;
        this.den = this.den * f2.den;
        simplify();
    }
}

class ZeroDenominatorException extends Exception {

}
class FractionUse {
    public static void main(String[] args) throws ZeroDenominatorException{
        Fraction f1 = new Fraction(20,30);
        f1.print();
        // 2/3

        f1.setNumerator(12); // 4/1
        int d = f1.getDenominator();
        System.out.println(d);
        // 1
        f1.print();
        // 4

        // Fraction f2 = new Fraction(61,60);
        // System.out.println(Fraction.add(f1, f2));

        f1.setNumerator(10);
        try {
            f1.setDenominator(0);
        } catch (ZeroDenominatorException e) {
            System.out.println("Cannot put a zero in denominator!");        }
        f1.print();
        // 1/3

        Fraction f2 = new Fraction(3,4);
        f1.add(f2);
        f1.print();
        // 13/12
        f2.print();
        // 3/4

        Fraction f3 = new Fraction(4,5);
        f3.multiply(f2);
        f3.print();
        // 3/5
        f2.print();
        // 3/4

        Fraction f4 = Fraction.add(f1, f3);
        f1.print();
        // 13/12
        f3.print();
        // 3/5
        f4.print();
        // 101/60
    }
}

//For Exception Handling, either catch the exception or mention in the function's signature that you throw the exception