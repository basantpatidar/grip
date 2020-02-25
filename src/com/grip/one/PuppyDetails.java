package com.grip.one;

public class PuppyDetails implements Dog{
	private String color;

	public void setColor (String newColor){
		this.color = newColor;
	}
	public String getColor(){
		return this.color;}
	@Override
	public String breedName(String bName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public float height(float puppyHeight) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float weight(float puppyWeight) {
		// TODO Auto-generated method stub
		return 0;
	}}