package strings;
public class s_builders{
    public static void main(String[] args) {
       StringBuilder sb=new StringBuilder(10); 
       sb.append("hello");//add
       sb.append("Hey");//add
       sb.ensureCapacity(40);//make the capacity atleast
       System.out.println(sb);
       System.out.println(sb.capacity());
       sb.append("guten tag");
       System.out.println(sb.capacity()==sb.length());//capacity is "you can keep this much   length is the length"    
       System.out.println(sb.capacity());
       System.out.println(sb.length());
       System.out.println(sb.substring(5));   
       sb.insert(2,"black myth");//append at an index
       System.out.println(sb);
       sb.delete(2,4);//remove from an index
       System.out.println(sb);
       sb.replace(2,4,"wu");//replace some elements
       System.out.println(sb);
       sb.delete(0,sb.length());
       System.out.println(sb);
       
    }
}