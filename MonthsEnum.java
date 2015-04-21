package javaenum2;

enum Month {

	JANUARY("January", "Jan","01", "1"), 
	FEBRUARY("February", "Feb","02", "2"),
	MARCH("March", "Mar","03","3"),
	APRIL("April", "Apr","04","4"),
	MAY("May", "May","05","5"),
	JUNE("June", "Jun","06","6"),
	JULY("July", "Jul","07","7"),
	AUGUST("August", "Aug","08","8"),
	SEPTEMBER("September", "Sep","09","9"),
	OCTOBER("October", "Oct","10","10"),
	NOVEMBER("November", "Nov","11","11"),
	DECEMBER("December", "Dec","12","12");
	
	private String nameMonth;
	private String reduction;
	private String orderWithZero;
	private String orderWithOutZero;

	private Month(String nameMonth, String reduction, String orderWithZero,
			      String orderWithOutZero) 
	{
		this.nameMonth = nameMonth;
		this.reduction = reduction;
		this.orderWithZero = orderWithZero;
		this.orderWithOutZero = orderWithOutZero;
	}

	public String getNameMonth() {
		return nameMonth;
	}
	public String getReduction(){
		return reduction;
	}
	public String getOrderWithZero() {
		return orderWithZero;
	}
	public String getOrderWithOutZero() {
		return orderWithOutZero;
	}
	
	public String findAll (String input){
		for (Month m : Month.values()){
			return m.findCoincidence(input);
		}
		return null;
	}
	
	public String findCoincidence(String input)  {
		if (name().equals(input) || getNameMonth().equals(input)
				|| getReduction().equals(input)||getOrderWithOutZero().equals(input)
				|| getOrderWithZero().equals(input)){
				return getOrderWithOutZero();
			}
		return null;
	}
	
	public String findCoincidence(Month m, String input)  {
		if (m.name().equals(input) || m.getNameMonth().equals(input)
				|| m.getReduction().equals(input)||m.getOrderWithOutZero().equals(input)
				|| m.getOrderWithZero().equals(input)){
				return  m.getOrderWithOutZero();
			}
		return null;
	}
}
public class MonthsEnum {
	private String orderMonth;
	
	public void setOrderMonth (String orderMonth){
		this.orderMonth = orderMonth;
	}
	public String getOrderMonth(){
		return orderMonth;
	}
	public void getOrderMonthFromOut(String input){
		for (Month m : Month.values()){
			if (m.findCoincidence(input)!= null){
				setOrderMonth(m.findCoincidence(input));
			}
		}
		if (getOrderMonth() == null){
		throw new IllegalArgumentException();
		}
	}
	

}
	
	
	
	

	
	


















