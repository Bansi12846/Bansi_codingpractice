 import java.util.Scanner;

interface Exam{
    boolean isPassed(int mark);
}
interface Classify{
    String getDivision(double average);
}
class Result implements Exam,Classify{
    public boolean isPassed(int mark){
        if(mark>=33){
            return true;
        }
        else {
            return false;
        }
    }
    public String getDivision(double average){
        if(average>=80){
            return "First Division";
        }
        else if (60 <= average  && average < 80){
            return "Second Division";
        }
        else if(35 <= average  && average < 60) {
            return "Third Division";
        }
        else{
            return "Fail";
        }
    }
}
class pr17 {
    public static void main(String[] args) {
        Result a=new Result();
        System.out.println(a.isPassed(78));
        System.out.println(a.getDivision(25));
    }
}
