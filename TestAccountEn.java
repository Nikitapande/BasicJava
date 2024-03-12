
public class TestAccountEn {

	public static void main(String[] args) {
		AccountEncap a=new AccountEncap();
		//calling setter methods
		a.setAcc_no(8521479630L);
		a.setName("Nikita Pande");
		a.setEmail("nikipande00@gmail.com");
		a.setAmount(15200.50F);
		
		//calling getter methods
		a.getAcc_no();
		a.getName();
		a.getEmail();
		a.getAmount();
		
		System.out.println(a.getAcc_no()+" "+a.getName()+" "+a.getEmail()+" "+a.getAmount());

	}

}
