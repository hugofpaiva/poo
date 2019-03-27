package aula06;

public class Conjunto {
	private int size = -1;
	private int[] vet = new int[10];
	
	
	public void insert(int n) {
		if(!this.contains(n)) {
			size+=1;
			if(size > 10) {
				int[] temp_vet = new int[size+10];
				for(int i=0; i<vet.length; i++) {
					temp_vet[i]=vet[i];
				}
				vet = temp_vet;
			}
			vet[size] = n;
		}
	}
	
	public boolean contains(int n) {
		for(int i=0; i<size+1; i++) {
			if(vet[i]==n) {
				return true;
			}
		}
		return false;
	}
	
	public void remove(int n) {
		for(int i=0; i<vet.length; i++) {
			if(vet[i]==n) {
				for(int j=i; j<=size;j++) {//vet.length-1
					vet[j]=vet[j+1];
					
				}
				size-=1;
			}
		}
	}
	
	public void empty() {
		size=-1;
	}
	
	public String toString() {
		String x = "{";
		for(int i=0; i<size+1;i++) {
			x += vet[i]+",";
		}
		if(size() > 0) {
			x=x.substring(0, x.length()-1);
		}
		return x+"}";
	}
	
	public int size(){
		return size+1;	
	}
	
	public int[] getVet() { return vet;}
	
	public Conjunto unir(Conjunto add) {
		int size1=this.size();
		int size2=add.size();
		Conjunto c1 = new Conjunto();
		for(int i=0; i<size1; i++) {
			c1.insert(this.vet[i]);
		}
		for(int i=size1;i<size2+size1;i++ ) {
			c1.insert(add.vet[i-size1]);
		}
		return c1;
		
	}
	
	public Conjunto subtrair(Conjunto dif) {
	
		//obter conjunto maior
		Conjunto maior;
		Conjunto menor;
		
		if (this.size() > dif.size()) {
			menor = dif;
			maior = this;
		}
		else{
			maior = dif;
			menor = this;
		}
		
		Conjunto difference =  new Conjunto();
		
		for(int i=0; i<maior.size(); i++){
			if (!menor.contains(maior.vet[i]))
				difference.insert(maior.vet[i]);
				
		}
		return difference;
			
	}
	
	public Conjunto interset(Conjunto inter) {
		Conjunto c1 = new Conjunto();
		for(int i=0; i<inter.vet.length;i++) {
			if(this.contains(inter.vet[i])) {
				c1.insert(inter.vet[i]);
			}
		}
		return c1;
	}

}
