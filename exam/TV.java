package exam;

//import java.security.CryptoPrimitive;

public class TV implements RemoCon {
    int currCH = 70;
    @Override
    public void chUp() {
        if(currCH < MAXCH){
            currCH++;
            System.out.println("TV의 채널이 올라간다: " + currCH);
        }else {
            currCH=1; //채널 100이 되면 채널 1로 돌아가기
            System.out.println("TV의 채널이 올라간다: " + currCH);
        }
        
    }

    @Override
    public void chDown() {
        if(currCH > MINCH){
            currCH--;
            System.out.println("TV의 채널이 내려간다: " + currCH);
        }else {
            currCH=100; //채널이 1이 됐다면 채널 100으로 돌아가기
            System.out.println("TV의 채널이 내려간다: " + currCH);
        }
    }

    @Override
    public void internet() {
        System.out.println("인터넷이 된다.");
    }
    //별도로 추가적인 기능을 구현시킬 수 있다.
}