public class Burbuja{
	

	public static void main(String [] args){  
	 	int x, y, c;
	 	int A [] = {50,10,40,20,30,60,70,90,100,80};    
	 		for(x=0;x<A.length-1;x++){
	 			for(y=0;y<A.length-x-1;y++){                   
	 		 	 	if(A[y+1]<A[y]){
	 					c=A[y+1];
	 		 			A[y+1]=A[y];
	 		 			A[y]=c;
	 		 		}
	 		  	}
	 		}
	 System.out.print("EL ARREGLO ORDENADO ES: ");
					for(x=0;x<A.length;x++) {
	 System.out.print(" "+A[x] + ", ");
					}
	 		}

	}
