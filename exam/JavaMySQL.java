package exam;

public class JavaMySQL implements Dbconnect{

    @Override
    public void getConnection(String url, String user, String password) {
        System.out.println("MySQL DB가 접속됩니다.");
        
    }
    
}
