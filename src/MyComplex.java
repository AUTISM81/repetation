import java.util.Objects;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real1, double imag1) {
        this.imag = imag1;
        this.real = real1;
    }

    @Override
    public String toString() {
        return this.real + " + " + this.imag + 'i';
    }

    public boolean isReal() {
        if (this.imag == 0)
            return true;
        else
            return false;
    }

    public boolean isImag() {
        if (this.imag > 0)
            return true;
        else
            return false;
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == 0)
            return true;
        else
                return false;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyComplex)) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.getReal(), getReal()) == 0 &&
                Double.compare(myComplex.getImag(), getImag()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReal(), getImag());
    }

    public double magnitude() {
        return Math.sqrt(this.real*this.real + this.imag*this.imag);
    }
}
