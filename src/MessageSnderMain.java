
public class MessageSnderMain {
      public static void main(String[] args) {
    	  EMailSender obj1 =  new EMailSender("������ �����մϴ�.","������",
    			  "admin@kaywon.ac.kr","10% ���� ������ ����Ǿ����ϴ�.");

    	  SMSSender obj2 = new SMSSender("������ �����ϴϴ�.","������",
 "02-0000-0000","10% ���������� ����Ǿ����ϴ�.");
    	  obj1.sendMessage("whomi78@naver.com");
    	  obj2.sendMessage("010-4873-4363");
      }

}
