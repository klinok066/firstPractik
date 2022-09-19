import java.lang.reflect.Array;

public class vector {
    int x;
    int y;
    int z;

    public vector(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getLenght(){
        return Math.sqrt(this.x* this.x + this.y* this.y+ this.z* this.z);
    }

    public double scalar(vector v1, vector v2){
        return (v1.x*v2.x + v1.y*v2.y + v1.z*v2.z);
    }

    public vector vectorMultiply(vector v1, vector v2){
        vector v3 = new vector();
        v3.x =  v1.y*v2.z - v1.z*v2.x;
        v3.y =  v1.z*v2.x - v1.x*v2.z;
        v3.y =  v1.x*v2.y - v1.y*v2.x;
        return v3;
    }

    public double corner(vector v1, vector v2){
        return scalar(v1,v2) / (Math.abs(v1.getLenght())*Math.abs(v2.getLenght()));
    }

    public vector plus(vector v1, vector v2){
        vector v3 = new vector();
        v3.x = v1.x + v2.x;
        v3.y = v1.y + v2.y;
        v3.z = v1.z + v2.z;
        return v3;
    }

    public static Array metod(int N){

        return null;
    }
}