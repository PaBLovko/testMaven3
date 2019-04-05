package Hello;

import java.util.StringTokenizer;

public class ComplexNumber extends Number {
    private final static double EPSILON = 0.0000001;

    private double re;
    private double im;

    public ComplexNumber (double re, double im) {
        super();
        this.re = re;
        this.im = im;
    }

    public ComplexNumber(String value) {
        super(value);
        StringTokenizer st = new StringTokenizer (value, "+-i", true);
        if (st.hasMoreTokens()) {
            String sa = st.nextToken().trim();
            if (st.hasMoreTokens()) {
                if (sa.equals ("+")) sa = st.nextToken().trim();
                if (sa.equals ("-")) sa = "-" + st.nextToken().trim();
                if (sa.equals ("i")) throw new IllegalArgumentException
                        (value + " is not a complex number");
            }
            re = Double.parseDouble (sa);
            if (st.hasMoreTokens()) {
                String sb = st.nextToken().trim();
                if (st.hasMoreTokens()) {
                    if (sb.equals ("+")) sb = st.nextToken().trim();
                    if (sb.equals ("-")) sb = "-" + st.nextToken().trim();
                }
                im = Double.parseDouble (sb);
            }
            if (st.hasMoreTokens()) {
                String si = st.nextToken().trim();
                if (!si.equals ("i"))
                    throw new IllegalArgumentException
                            (value + " is not a complex number");
                if (st.hasMoreTokens())
                    throw new IllegalArgumentException
                            (value + " is not a complex number");
            } else
                throw new IllegalArgumentException
                        (value + " is not a complex number");
        } else
            throw new IllegalArgumentException (value + " is not a complex number");
    }

    public double getRe() { return re; }

    public double getIm() {
        return im;
    }

    public static ComplexNumber add(ComplexNumber cn1, ComplexNumber cn2) {
        return new ComplexNumber(cn1.getRe() + cn2.getRe(), cn1.getIm() + cn2.getIm());
    }

    public static ComplexNumber dif(ComplexNumber cn1, ComplexNumber cn2) {
        return new ComplexNumber(cn1.getRe() - cn2.getRe(), cn1.getIm() - cn2.getIm());
    }

    @Override
    public String toString() {
        double a = this.getRe();
        double b = this.getIm();
        if (EPSILON > 0) {
            long jark = Math.round (1./EPSILON);
            a = Math.rint (a*jark)/jark;
            b = Math.rint (b*jark)/jark;
        }
        String rS = String.valueOf (a);
        String iS = String.valueOf (b);
        return rS + (iS.startsWith ("-") ? "" : "+") + iS + "i";
    }
}
