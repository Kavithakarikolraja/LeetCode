class Solution {

    private int operate(int op1,int op2,String op)
    {
        if(op.equals("*")) return op1*op2;
        else if(op.equals("/")) return op1/op2;
        else if(op.equals("+")) return op1+op2;
        else if(op.equals("-")) return op1-op2;

        return 0;
    }
    public int clumsy(int n) {
        
        char[] c = {'*','/','+','-'};

        
        List<String> a = new ArrayList<>();
        int pos = 0;
        a.add(String.valueOf(n));

        for(int i=n-1;i>=1;i--)
        {
            char op = c[pos%4];
           a.add(String.valueOf(op));
           a.add(String.valueOf(i));
            pos++;
        }
       
        Deque<Integer> digit = new ArrayDeque<>();
        Deque<String>  operand = new ArrayDeque<>();

        int ind;
        for(ind = 0;ind<a.size();ind++)
        {
            String val = a.get(ind);
            if(val.equals("*")||val.equals("/"))
            {
                int operand1 = digit.removeLast();
                ind++;
                int operand2 = Integer.parseInt(a.get(ind));
                int result = operate(operand1,operand2,val);
                digit.addLast(result);
            }
            
            else if(val.equals("+")||val.equals("-"))
            {
                operand.addLast(val);
            }

            else 
            {
                digit.addLast(Integer.parseInt(val));
            }

        }

        while(!operand.isEmpty())
        {
            int operand1 = digit.removeFirst();
            int operand2 = digit.removeFirst();
            String val = operand.removeFirst();
            int result = operate(operand1,operand2,val);
            digit.addFirst(result);
        }
    
        return digit.removeFirst();
    }
}