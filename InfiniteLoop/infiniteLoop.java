public class infiniteLoop {
	private static int i;
	
	public infiniteLoop(){
		this.i=3;
	}
	public int getI(){
		return this.i;
	}

	public static void main(String args[]){
		infiniteLoop n=new infiniteLoop();
		while(n.getI()>0){
			System.out.println("i sup a 0");	
		}
	}
}
