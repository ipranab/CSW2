import java.util.*;

class Address {
    private int plotNo;
    private String at, post;

    public Address(int plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Address[" +
                "plotNo='" + plotNo + '\'' +
                ", at='" + at + '\'' +
                ", post='" + post + '\'' +
                ']';
    }
}

public class _8160_q7 {

	public static void main(String[] args) {
		TreeMap<String, Address> add = new TreeMap<>();
		add.put("Aditya", new Address(191, "JAGAMARA", "New York"));
		add.put("Debi", new Address(190, "Khandagiri", "Chicago"));
		add.put("Suvam", new Address(193, "Cuttack", "Los Angeles"));

		Iterator<Map.Entry<String, Address>> iterator =  add.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Address> entry = iterator.next();
			System.out.println("Name : "+entry.getKey()+" , address : "+entry.getValue());
		}
	}

}
