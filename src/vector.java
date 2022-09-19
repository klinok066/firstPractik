public class vector {
    int x;
    int y;
    int z;

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
        vector v3 = null;
        v3.x =  v1.y*v2.z - v1.z*v2.x;
        v3.y =  v1.z*v2.x - v1.x*v2.z;
        v3.y =  v1.x*v2.y - v1.y*v2.x;
        return v3;
    }
}