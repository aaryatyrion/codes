import java.io.*;
import java.util.*;
import java.lang.*;

public class Stuff implements Comparable<Stuff>{
	public int weight;
	public int value;
	public double valuePerUnitWeight;


	public Stuff(int weight, int value) {
		this.weight = weight;
		this.value = value;
		this.valuePerUnitWeight = (double)value / (double)weight; 
	}

	public int compareTo(Stuff s){
		return (int) (this.valuePerUnitWeight - s.valuePerUnitWeight);
	}
}