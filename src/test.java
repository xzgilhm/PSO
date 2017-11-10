import java.util.Random;

/**
 * Created by 73559 on 2017/11/9.
 */
public class test {
    public static void main(String[] args){
        double i =new Random().nextDouble();
        if(new Random().nextBoolean()){
            i = i * 5.12;
        }
        else{
            i = i * (-5.12);
        }
        System.out.print(i);
    }
}
