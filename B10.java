/**This is a program that search the array linearly and find out the value that is equal to the 
 * value that user looks for and return the location of the value in the array. Once the value is found
 * in the array, the loop stops and return the variable index which hold the location. If there is no such
 * value in the array, this method will assign index as -1 and return it afterward.
 * 
 * @author william
 *
 */
public class B10 {

	public static void main(String[] args){
		int A[]={5,3,4,1,2};//array with length five for dry run
		int q=3;	//integer value that we are searching 
		int index=LinearSearch(A,A.length,q);//call the method 
		System.out.println("Output="+index);//print out the result
		System.exit(0);
	}
	/**
	 * This is the method do the linear search and return the index value.
	 * @param A the array the used for checking
	 * @param n	the array length of A.
	 * @param q the value user looks for from array A.
	 * @return index.
	 */
	public static int  LinearSearch(int A[], int n, int q){
		int index=0;	//initialize the index as 0
		while(index<n&&A[index]!=q){	//once got the value from the array jump out of the loop
			index++;//increment of index
		}
		if(index==n){//if the integer doesn't exist in the array
			index= -1;//set the index as -1
		}
		return index;//return the value.
		
	}
}
