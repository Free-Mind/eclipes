public class Test {
	public static void bubble(int[] arr,int length){
		int temp;
		int n=length;
		for(int j=0;j<length;j++){
			for(int i=0;i<n-1;i++){
				if(arr[i]>=arr[i+1]){
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			n--;
		}
		for(int i=0;i<length;i++){
			System.out.println(arr[i]);
		}
	}
	public static void insert(int arr[],int length){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,6,4,7,32,1,3,43,54};
		int length = 10;
		bubble(arr,length);
	}
}
