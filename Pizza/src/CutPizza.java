import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//the helper class of cutting the pizza
public class CutPizza {

	public static Set<Shape> validShapes(Pizza pizza){
		findFactors(pizza.getMaxSliceLength());
		return null;
	}
	
	public static void Cut(Set<Shape> shapes, Pizza pizza){
		
	}
	
	public static List<Integer[]> findFactors(int num)
    {
        int incrementer = 1;
        if (num % 2 != 0)
        {
            incrementer = 2; //only test the odd ones
        }
        List<Integer[]> list = new ArrayList<>();
        for (int i = 1; i <= num / 2; i=i+incrementer)
        {
            if (num % i == 0)
            {
                list.add(new Integer[]{i, num/i});
            }
        }
        list.add(new Integer[]{num,1});
        return list;
    }
}
