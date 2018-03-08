public class Class1 {
    public double calculate(double amountt, int type, int years) {
        double result;
        result = 0;
        double disc = (years > 5) ? (double) 5 / 100 : (double) years / 100;
        if (type == 1) {
            result = amountt;

        } else if (type == 2) {
            result = (amountt - (0.1d * amountt)) - disc * (amountt - (0.1d * amountt));
        } else if (type == 3) {
            result = (0.7d * amountt) - disc * (0.7d * amountt);
        } else if (type == 4) {
            result = (amountt - (0.5d * amountt)) - disc * (amountt - (0.5d * amountt));
        }
        return result;
    }
}
