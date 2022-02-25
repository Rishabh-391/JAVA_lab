class pattern{
 static void pattern1(int x){
 	int i=0,j;
 	while(i<x){
 		j=0;
 		while(j<i){
 			System.out.print(i+j+" ");
 			j=j+2;
 		}
 		System.out.println();
 		i++;
 	}
 }
 static void pattern2(int x){
 	int i=0,j;
 	while(i<=x){
 		j=i;
 		while(j<=x){
 			System.out.print(j+" "+i+" ");
 			j++;
 		}
 		System.out.println();
 		i++;
 	}
 }
 public static void main(String args[]){
 	int x=5;
 	pattern1(x);
 	pattern2(x);
 }
}
