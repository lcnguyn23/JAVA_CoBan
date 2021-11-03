package luuTruCacDToop;

import java.io.Serializable;

public class Car implements Serializable {

	private String name;
	private String engine;
	private int seats;
	private String production_date;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String engine, int seats, String production_date) {
		super();
		this.name = name;
		this.engine = engine;
		this.seats = seats;
		this.production_date = production_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getProduction_date() {
		return production_date;
	}

	public void setProduction_date(String production_date) {
		this.production_date = production_date;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + ", seats=" + seats + ", production_date=" + production_date
				+ "]";
	}

}
