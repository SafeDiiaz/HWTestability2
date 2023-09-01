public class BmiService {
    public int calculate(int height ,int weight){
        int index;
        int sheight = height * height;
        int sweight = weight * 10000;
        index = sweight/ sheight;
        return index;

    }
}
