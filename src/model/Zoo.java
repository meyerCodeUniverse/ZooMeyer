package model;

import java.time.LocalTime;
// import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "zoo")
	

public class Zoo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int ID;
	@Column(name = "zoo_keeper")
	private String zooKeeper;
	// private ArrayList<Animal> listOfAnimals = new ArrayList<Animal>();
	@Column(name = "name_of_zoo")
	private String name;
	@Column(name = "open_time")
	private LocalTime openTime;
	@Column(name = "close_time")
	private LocalTime closeTime;
	
	public Zoo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Zoo(String zooKeeper, String name, LocalTime openTime,
			LocalTime closeTime) {
		super();
		this.zooKeeper = zooKeeper;
		this.name = name;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	public String getZooKeeper() {
		return zooKeeper;
	}
	public void setZooKeeper(String zooKeeper) {
		this.zooKeeper = zooKeeper;
	}
	// public ArrayList<Animal> getListOfAnimals() {
	//	return listOfAnimals;
	//}
	// public void setListOfAnimals(ArrayList<Animal> listOfAnimals) {
	//	this.listOfAnimals = listOfAnimals;
	// }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalTime getOpenTime() {
		return openTime;
	}
	public void setOpenTime(LocalTime openTime) {
		this.openTime = openTime;
	}
	public LocalTime getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(LocalTime closeTime) {
		this.closeTime = closeTime;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "Zoo [zooKeeper=" + zooKeeper + "name=" + name + ", openTime="
				+ openTime + ", closeTime=" + closeTime + "]";
	}

	public Zoo(String name) {
		super();
		this.name = name;
	}

	public String printZooDetails () {
		return "Zoo: " + name + "\n Zoo Keeper: " + zooKeeper + "\n Opening Time: " + openTime + "\n Closing Time " + closeTime;
	}
	
	// public void addToZoo(Animal p) {
	// 	listOfAnimals.add(p);
	// }
	
	// public int getTotalAnimals() {
	// 	return listOfAnimals.size() + 1;
	// }
	
	// public String displayZoo() {
	// 	String r = ("Zoo: " + name + "\n Zoo Keeper: " + zooKeeper + "\n Opening Time: " + openTime + "\n Closing Time " + closeTime + "\nList of animals:\n");
	// 	for (Animal animal : listOfAnimals ) {
	// 		r = r + animal.animalProfile() + "\n";
	// 	}
	// return r;
	// 
	}

