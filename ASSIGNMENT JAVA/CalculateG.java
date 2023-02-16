Class CalculateG {
    public static double multiplication(double x,double y){
        return x*y;
    }
    public static double square(double x){
        return x*y
    }
    public static double summation(double x,double y){
        return x+y;
    }
    public static void outline(string message,double result){
        system.out.println(message + result);
    }

    public static void main(string[] arguments){
        double gravity=9.81;
        double fallingtime=30;
        double initial velocity=0.0;
        double final velocity;
        double initial position=0.0;
        double finalposition;
        //Add the formulas for position and velocity
        //x(t)=0.5*at2 + vit+x
        final position=0.5 *gravity * fallingTime *fallingTime +initial velocity *fallingTime *initialposition;
        //v(t)=at + vi
        finalvelocity=gravity*fallingtime + initialvelocity;
        //output the results
        system.out.println("The object's position after"+fallingTime + "seconds is ")+finalposition + "m.";
        system.out.println("The object's velocity after "+fallingTime + "seconds is")+finalvelocity + "m/s.";
        double a =6.4;
        double b =3.6;
        double c =multiplication(a,b);
        outline(message"multiplication: ", c);
        double d =square(a);
        outline(message"powering to square: ", d);
        double e = summation(a,b);
        outline(message"summation: ",e);
        
            }
}