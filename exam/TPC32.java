package exam;

public class TPC32 {
    public static void main(String[] args){
        //Oracle, MySQL -> Driver class
        Dbconnect conn = new JavaOracle();
        conn.getConnection("url", "bit", "12345");

        conn = new JavaMySQL();
        conn.getConnection("url", "root", "ABCD");
    }
}
