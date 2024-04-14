package Lessons26;

public enum Operations {
    PLUS
{
    public double apply(double x, double y){
        return x+y;
    }
},
    MINUS {
        public double apply(double x, double y) {
            return x -y;
        }
    },
    MULTIPLY {
        public  double apply(double x, double y) {
            return x*y;
        }
    },
    DIVIDE {
        public double apply (double x, double y) {
            return x/y;
        }
    };

    public  abstract  double apply(double x, double y);
}
