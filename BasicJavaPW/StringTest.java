public class StringTest{
    public static void main(String[]args){
        final StringBuilder sb = new StringBuilder("Virat "); // size --> 16 + 6 = 22  (default size 16    if we add 17th chararcter in the size will increase (16 + 1)*2)
        sb.append("Kohli");
        // sb = new StringBuilder("Dhoni");
        sb.reverse();
        System.out.println(sb);

    }
}