import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class BYTECODE{   
    Stack<Object> os1 = new Stack<>();
    LinkedList<Object> cp1 = new LinkedList<>();
    LinkedList<Object> constant_pool = new LinkedList<>();  
    public int line_no;
    private String getSub(String x)
    {HashMap<String,String> hm=new HashMap<String,String>();
    hm.put("int", "iload");
    hm.put("byte", "iload");
    hm.put("char", "iload");
    hm.put("new ", "astore");
    hm.put("func","invokespecial");
    hm.put("double", "dload");    
    if(x.contains("int")) return hm.get("int");
    if(x.contains("byte")) return hm.get("byte");
    if(x.contains("char")) return hm.get("char");
    if(x.contains("new")) return hm.get("new");
    if(x.contains("(")&& x.contains(")") ) return hm.get("func");
    if(x.contains("double")) return hm.get("double");
    
    return x;
            }
    public BYTECODE(String blk){
        
        String lines[] = blk.split("\n");
        LinkedList<String> statements = new LinkedList<>();
        
        for(String line: lines)
        {
            
            if(line.contains(";")) ///if multiple statements in one line
            {
                String tmp[] = line.split(";");
            
                for(String statement: tmp)
                {
                    //System.out.println("Hi");
                    if(!statement.contains("\n"))statements.add(statement);
                }
            }
            else statements.add(line);
            
        }
        
        for(int i=0;i<statements.size();i++) System.out.println(i+" "+ this.getSub(statements.get(i)));
    }
    
    
    
    
    
}


public class CovertByteCode2 {
    
    Stack<String> bstk = new Stack<>();
    
    
    
    public static void main(String[] args){
        
        String s = "import java.util.Scanner;\n" +
"\n" +
"\n" +
"public class Area {\n" +
"    \n" +
"    public static double circleArea(double r) \n" +
"    {   \n" +
"        double pi = 3.14;\n" +
"\n" +
"        double area = pi * r *r;\n" +
"\n" +
"        return area;\n" +
"    }\n" +
"    \n" +
"    public static void main(String[] args) {\n" +
"        \n" +
"        Scanner sc = new Scanner(System.in);\n" +
"        \n" +
"        double radius, area1;\n" +
"\n" +
"        System.out.println(\"Enter the radius of circle: \");\n" +
"\n" +
"        radius = sc.nextDouble();\n" +
"\n" +
"        area1 = circleArea(radius);\n" +
"\n" +
"        System.out.println(area1);\n" +
"\n" +
"        for(int i =0; i<3; i++)\n" +
"        {\n" +
"            System.out.println(i);\n" +
"        }\n" +
"\n" +
"        \n" +
"        \n" +
"        \n" +
"    }\n" +
"    \n" +
"}";
        
        String lines[] = s.split("\n");
        Stack<BYTECODE> stk = new Stack<>();
        
        int cnt =0;
        String[] BYTECODEs = new String[100];
        
        int ind =0;
        for(int i =0;i<100;i++) BYTECODEs[i] = "";
         
        String tmp="";
        for (int i=0;i<lines.length; i++)
        {
            if(lines[i].contains("{")) ind++;
            
            
            
            else if(lines[i].contains("}"))
            {
                ind --;
                
            }
            BYTECODEs[ind] += lines[i]+"\n";
         
        }
        
        
        
        //System.out.println(BYTECODEs.length);
        for(int i=0; i<BYTECODEs.length;i++)
        {
            if(BYTECODEs[i]=="") break;
            System.out.println("-----------");
            //System.out.println(BYTECODEs[i]);
            BYTECODE b1 = new BYTECODE(BYTECODEs[i]);
        }
        
        
        
        
        
        
        
        
        
       
    
    }
    
}
