import java.util.List;

public class Calc {
    public Double sum(List<? extends Number> items) {
        double sum = 0;
        for(var i: items){
            sum += i.doubleValue();
        }
        return sum;
    }

    public Double subtracnion (List<? extends Number> items){
        double result = 0;
        for (Number i: items)
            result -= i.doubleValue();
        return result;
    }

    public Double multy(List<? extends Number> items) {
        double result = 1;
        for(Number i: items)
            result *= i.doubleValue();
        return result;
    }

    public Double div(List<? extends Number> items) {
        double result = items.get(0).doubleValue();
        for (Number i: items) {
            if (i.doubleValue() == 0) {
                System.out.println("На ноль делить нельзя!");
            }
            else {
                result /= i.doubleValue();
            }
        }
        return result;
    }

    public Double binaryToDouble(Object num){
        String line = num.toString();
        int n = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '1')
                n += (int) Math.pow(2.0,line.length() - 1 - i);
        }
        return (double) n;
    }

    public String toBinary (Object num){
        StringBuilder sb = new StringBuilder();
        String line = num.toString();
        if (line.contains("."))
            line = line.replace('.', ' ').split(" ")[0];
        int number = Integer.parseInt(line);

        while (number > 1) {
            sb.append(number % 2);
            number /= 2;
        }
        sb.append(number);
        return sb.reverse().toString();
    }



}
