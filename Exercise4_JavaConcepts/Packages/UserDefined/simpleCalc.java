import  userPacks.Calc;

class simpleCalc{
    public static void main(String[] args) {
        Calc calcOBJ =new Calc();
        int sum=calcOBJ.add(5,10);
        int dif=calcOBJ.subtract(5, 10);
        int prod=calcOBJ.multiply(5, 10);
        double quo=calcOBJ.divide(5, 10);
        System.out.println("SUM: "+sum);
        System.out.println("DIFFERENCE: "+dif);
        System.out.println("PRODUCT: "+prod);
        System.out.println("QUOTIENT: "+quo);

    }
    


}