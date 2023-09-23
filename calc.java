import java.util.Scanner;
public class calc{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ch = 0;
        double num1;
        double num2;
        double res;
        node ptr = new node(0, null, null);
        node prev = new node(0, null, null);
        node next = new node(0, null, null);
        System.out.println("Submit numbers and operators (+, -, *, /, %, ^, =, z, y). Submit z as an operator to undo and y to redo.");
        System.out.println("Submit a number: ");
        num1 = input.nextDouble();

        
        
        while(ch==0){
            System.out.println("Enter an operator: ");
            char op = input.next().charAt(0);
            switch(op){
                case'y':
                    if(next == null){
                        System.out.println(ptr.getData());
                        break;
                    }
                    System.out.println(next.getData());
                    node c = new node(0, null, null);
                    c=ptr;
                    ptr = next;
                    next = ptr.getNext();
                    prev = c;
                    break;
                case 'z':
                    if(prev==null){
                        System.out.println(ptr.getData());
                        break;
                    }
                    else if(prev.getPrev() == null){
                        System.out.println(ptr.getData());
                        break;
                    }
                    System.out.println(prev.getData());
                    node b = new node(0, null, null);
                    b=ptr;
                    ptr = prev;
                    prev = ptr.getPrev();
                    ptr.setNext(b);
                    next=b;
                    break;
                case '^':
                    System.out.println("Enter a number: ");
                    num2 = input.nextDouble();
                    res = Math.pow(num1, num2);
                    if((res == Double.NaN) || Double.isInfinite(res)){
                        System.out.println("Error");
                        ch++;
                        break;
                    } 
                    System.out.println("Equals:");
                    System.out.println(res);
                    ptr.setData(num1);
                    node a = new node(res, ptr, null);
                    ptr.setNext(a);
                    prev = ptr;
                    ptr = a;
                    num1 = res;
                    break;
                case '%':
                    System.out.println("Enter a number: ");
                    num2 = input.nextDouble();
                    res = num1 % num2;
                    if((res == Double.NaN) || Double.isInfinite(res)){
                        System.out.println("Error");
                        ch++;
                        break;
                    } 
                    System.out.println("Equals:");
                    System.out.println(res);
                    ptr.setData(num1);
                    node m = new node(res, ptr, null);
                    ptr.setNext(m);
                    prev = ptr;
                    ptr = m;
                    num1 = res;
                    break;
                case '+':
                    System.out.println("Enter a number: ");
                    num2 = input.nextDouble();
                    res = num1 + num2;
                    if((res == Double.NaN) || Double.isInfinite(res)){
                        System.out.println("Error");
                        ch++;
                        break;
                    } 
                    System.out.println("Equals:");
                    System.out.println(res);
                    ptr.setData(num1);
                    node i = new node(res, ptr, null);
                    ptr.setNext(i);
                    prev = ptr;
                    ptr = i;
                    num1 = res;
                    break;
                case '-':
                    System.out.println("Enter a number: ");
                    num2 = input.nextDouble();
                    res = num1 - num2;
                    if((res == Double.NaN) || Double.isInfinite(res)){
                        System.out.println("Error");
                        ch++;
                        break;
                    } 
                    System.out.println("Equals:");
                    System.out.println(res);
                    ptr.setData(num1);
                    node k = new node(res, ptr, null);
                    ptr.setNext(k);
                    prev = ptr;
                    ptr = k;
                    num1 = res;
                    break;
                case '*':
                    System.out.println("Enter a number: ");
                    num2 = input.nextDouble();
                    res = num1 * num2;
                    if((res == Double.NaN) || Double.isInfinite(res)){
                        System.out.println("Error");
                        ch++;
                        break;
                    } 
                    System.out.println("Equals:");
                    System.out.println(res);
                    ptr.setData(num1);
                    node e = new node(res, ptr, null);
                    ptr.setNext(e);
                    prev = ptr;
                    ptr = e;
                    num1 = res;
                    break;
                case '/':
                    System.out.println("Enter a number: ");
                    num2 = input.nextDouble();
                    res = num1 / num2;
                    if((res == Double.NaN) || Double.isInfinite(res)){
                        System.out.println("Error");
                        ch++;
                        break;
                    } 
                    System.out.println("Equals:");
                    System.out.println(res);
                    ptr.setData(num1);
                    node y = new node(res, ptr, null);
                    ptr.setNext(y);
                    prev = ptr;
                    ptr = y;
                    num1 = res;
                    break;
                case '=':
                    res=num1;
                    System.out.println("The result is " + ptr.getData());
                    ch++;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        input.close();
    }
}