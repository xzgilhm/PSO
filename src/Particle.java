import java.util.Random;

/**
 * Created by 73559 on 2017/10/19.
 */
public class Particle {
    //维数
    public  int dimension = 2;

    //粒子的位置
    public double[] X = new double[dimension];

    //局部最好位置
    public double[] pbest = new double[dimension];

    //粒子的速度
    public double[] V = new double[dimension];

    //最大速度
    public double Vmax = 1;

    //适应值
    public double fitness;



    /**
     * 根据当前位置计算适应值
     * @return newFitness
     */
    public double calculateFitness() {

        //Rosenbrock function
        double newFitness = 100*(Math.pow((X[0]*X[0]-X[1]),2))+Math.pow((1-X[0]), 2);

        return newFitness;
    }


    /**
     * 初始化自己的位置和pbest
     */
    public void initialX() {
        for(int i=0;i<dimension;i++) {
//            X[i] = new Random().nextInt(5);
            X[i] = randDouble(5.12);
//            System.out.print(" X["+i+"]: "+ X[i]);
            pbest[i] = X[i];
        }
//        System.out.println();
    }

    /**
     * 初始化自己的速度
     */
    public void initialV() {
        for(int i=0;i<dimension;i++) {
            V[i] = randDouble(Vmax);//随机产生一个Vmax内的随机小数
        }

    }


    /**
     * 随机生成（-scope,scope）内的值
     */
    static double randDouble(double scope){
        double i =new Random().nextDouble();
        if(new Random().nextBoolean()){
            i *=  scope;
        }
        else{
            i = -(i * scope);
        }
        return i;
    }
}

