public class CalculateG {
    public static double multiplication(double figure1,double figure2){
        return figure1*figure2;
    }
    public static double square(double figure1){
        return figure1*figure1;
    }
    public static double summation(double figure1,double figure2){
        return figure1+figure2;
    }
    public static void outline(String message,double result){
        System.out.println(message + result);
    }
    public static void main(String[] args) {
        double gravity=-9.81;
        double fallingTime=30;
        double initialVelocity=0.0;
        double finalVelocity;
        double initialPosition=0.0;
        double finalPosition=0.0;
        double value=0.5;
        System.out.println("The object's position after "+fallingTime+"seconds is "+finalPosition+"m.");
        //x(t)=0.5*at^2+vit+xi
        finalPosition=(value*(gravity*fallingTime*fallingTime)+(initialVelocity*fallingTime)+initialPosition)/fallingTime;
        System.out.println("finalposition is:"+finalPosition);
        //v(t)=at+vi
        finalVelocity=gravity*fallingTime/fallingTime;
        System.out.println("finalvelocity area:"+finalVelocity);
        double figure1=110;
        double figure2=70;
        double c=multiplication(figure1,figure2);
        outline("multiplication: ",c);
        double d=square(figure1);
        outline("powering to square: ",d);
        double e=summation(figure1,figure2);
        outline("summation: ",e);


    }
}