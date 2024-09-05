import java.util.Map;
import java.util.HashMap;

public class Purse
{
    public static void main (String[] args)
    {
     Map<Integer,Denomination> denominations = new HashMap<>();

     denominations.put(100.00, new Denomination("Hundred", 100.00,Denomination.Form.Bill, "hundred_note.png"));
     denominations.put(50.00, new Denomination("Fifty", 50.00,Denomination.Form.Bill, "fifty_note.png"));
     denominations.put(20.00, new Denomination("Twenty", 20.00,Denomination.Form.Bill, "twenty_note.png"));
     denominations.put(10.00, new Denomination("Ten", 10.00,Denomination.Form.Bill, "ten_note.png"));
     denominations.put(5.00, new Denomination("Five", 5.00,Denomination.Form.Bill, "five_note.png"));
     denominations.put(1.00, new Denomination("One", 1.00,Denomination.Form.Bill, "one_note.png"));
     denominations.put(0.25, new Denomination("Quarter", 0.25,Denomination.Form.Coin, "quarter.png"));
     denominations.put(0.10, new Denomination("Dime", 0.10,Denomination.Form.Coin, "dime.png"));
     denominations.put(0.05, new Denomination("Nickle", 0.05,Denomination.Form.Coin, "nickle.png"));
     denominations.put(0.01, new Denomination("Penny", 0.01,Denomination.Form.Coin, "penny.png"));


    }

}
