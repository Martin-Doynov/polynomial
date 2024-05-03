import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



//        Scanner test = new Scanner(input);
//        List<Integer> list = new ArrayList<>();
//
//        while(test.hasNextInt()) list.add(test.nextInt());
//
//        for(Integer i : list) System.out.println(i);

        // f(x) = y[0]*x^0 + y[1]*x^1 + y[2]*x^2 + y[3]*x^3 + y[4]*x^4...
        while (scanner.hasNextLine())
        {
            String input = scanner.nextLine();
            Scanner ints = new Scanner(input);

            int a = ints.nextInt();
            int b = ints.nextInt();

            List<Integer> Y = new ArrayList<>();

            while (ints.hasNextInt())
            {
                Y.add(ints.nextInt());
            }
//            for (Integer i : Y) System.out.println(i);

            List<Integer>results = new ArrayList<>();

            // f(x) = y[0]*x^0 + y[1]*x^1 + y[2]*x^2 + y[3]*x^3 + y[4]*x^4...

            for (int x = a;x<=b;x++)
            {
                int result=0;
                for(int j=0;j<Y.size();j++)
                {
                    result+=Y.get(j)*Math.pow(x,j);
                }
//                System.out.println(result);
                results.add(result);
            }

            String outp = Collections.min(results)+" "+ Collections.max(results);
            System.out.println(outp);

        }
    }
}