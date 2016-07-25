package hw07;

public class hw0725 {
	int a;
	int b;
	final float PI=3.14f;
	public float area(){
		return a*b*PI;
	}
	public float peri(){
		return 2*PI*b+4*(a-b);
	}
	public void setWH(int a,int b){
		this.a=a;
		this.b=b;
	}
}
