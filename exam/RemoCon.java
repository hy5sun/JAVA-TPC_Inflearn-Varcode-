package exam;

public interface RemoCon { ///객체생성X; RemoCon r = new RemoCon(); (X)
    //인터페이스에서 상수 사용 가능
    public static final int MAXCH = 100; //RemoCon.MAXCH 이렇게 직접 접근하기 위해서 static 사용
    public final static int MINCH =  1; //RemoCon.MINCH 
    //그리고 상수는 (final은) 수정할 수가 없는 특징을 가지고 있어서 사용함.
    
    //추상메소드
    public void chUp(); //abstract는 생략됨
    public void chDown();
    public void internet();
}